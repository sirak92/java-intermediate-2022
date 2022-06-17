import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket connectionToServer = new Socket("127.0.0.1", 8800);
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(connectionToServer.getOutputStream());
        writer.print("GET / Client2 / HTTP/1.1/\r\n");
        writer.flush();

        String currentLine;
        while (!(currentLine = sc.nextLine()).equals("wq")) {
            writer.print("Client2: " + currentLine + "\r\n");
            writer.flush();
        }

    }
}
