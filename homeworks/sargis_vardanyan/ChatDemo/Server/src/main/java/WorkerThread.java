import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class WorkerThread extends Thread {

    private final Socket connection;

    public WorkerThread(Socket connection) {
        this.connection = connection;
    }

    @Override
    public void run() {
        try (InputStream input = connection.getInputStream()) {
            StringBuilder requestBuffer = new StringBuilder();
            int read;
            while ((read = input.read()) != -1) {
                requestBuffer.append((char) read);
                if (endsWithSlashRSlashN(requestBuffer)) {
                    String[] splits;
                    if (checkIfClientEntered((splits = requestBuffer.toString().split("/")))) {
                        switch (splits[1].trim()) {
                            case "Client1" -> System.out.println("Client1 entered chat: ");
                            case "Client2" -> System.out.println("Client2 entered chat: ");
                        }
                    } else if (checkIfClientLeft((splits = requestBuffer.toString().split(" ")))) {
                        switch (splits[0].trim()) {
                            case "Client1" -> System.out.println("Client1 left chat: ");
                            case "Client2" -> System.out.println("Client2 left chat: ");
                        }
                    } else {
                        System.out.println(requestBuffer.toString().trim());
                    }
                    requestBuffer.delete(0, requestBuffer.length());
                }
            }

        } catch (IOException ignored) {
            System.out.println("something went wrong");
        }
    }

    private static boolean endsWithSlashRSlashN(StringBuilder s) {
        if (s.length() < 2) {
            return false;
        }
        int length = s.length();
        return s.charAt(length - 2) == '\r' && s.charAt(length - 1) == '\n';
    }

    private static boolean checkIfClientEntered(String[] splits) {
        return splits[0].trim().equals("GET");
    }

    private static boolean checkIfClientLeft(String[] splits) {
        int length = splits.length;
        if (length < 2) {
            return false;
        }

        if (splits[1].trim().equals("wq")) {
            return splits[length - 1].charAt(0) == '\r' &&
                    splits[length - 1].charAt(0) == '\n';
        }
        return false;
    }
}
