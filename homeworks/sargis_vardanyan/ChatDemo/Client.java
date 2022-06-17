import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String clientName = args[0];
        Socket connectionToServer = new Socket("127.0.0.1", 8800);
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(connectionToServer.getOutputStream());
        writer.print("GET / "+ clientName + "/ HTTP/1.1\r\n");
        writer.flush();

        String currentLine;
        while (true) {
            currentLine = sc.nextLine();
            writer.print(clientName + ": " + currentLine + "\r\n");
            writer.flush();
            if (currentLine.equals("wq")) {
                connectionToServer.close();
                break;
            }
        }
    }
}
