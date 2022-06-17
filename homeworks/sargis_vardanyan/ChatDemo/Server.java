import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        new Server().startChat();
    }

    public void startChat() throws IOException{
        ServerSocket serverSocket = new ServerSocket(8800);
        System.out.println("Server is listening on port 8800");
        while (true) {
            Socket connection = serverSocket.accept();
            new WorkerThread(connection).start();
        }
    }
}
