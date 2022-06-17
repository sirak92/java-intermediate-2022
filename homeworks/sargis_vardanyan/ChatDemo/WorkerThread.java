import java.io.*;
import java.net.Socket;

public class WorkerThread extends Thread {

    private final Socket connection;

    public WorkerThread(Socket connection) {
        this.connection = connection;
    }


    @Override
    public void run() {
//connection.getLocalPort()
        try (InputStream input = connection.getInputStream()) {
            while (true) {
                while (input.available() > 0) {
                    byte[] bt = new byte[input.available()];
                    input.read(bt);
                    String msg = new String(bt);

                    if (msg.startsWith("GET")) {
                        System.out.println(msg.split("/")[1] + " entered chat: ");
                    } else if (msg.endsWith("wq\r\n")) {
                        System.out.println(msg.split(" ")[0] + " left chat: ");
                    } else {
                        System.out.println(msg.trim());
                    }
                }
                Thread.sleep(1000);
            }
        } catch (IOException ignored) {
            System.out.println("something went wrong");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}