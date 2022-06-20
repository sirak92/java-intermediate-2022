package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        new Client("Sargis").joinNetwork("127.0.0.1", 8080);
    }

    private String name;

    private Socket socket;

    private PrintWriter writer;

    private Thread chatSupport;

    public Client(String name) {
        this.name = name;
    }

    public void joinNetwork(String host, int port) throws IOException {
        socket = new Socket(host, port);
        writer = new PrintWriter(socket.getOutputStream());
        writer.println(this.name + " entered chat\r\n");
        writer.flush();
        chatSupport = new ClientWorkerThread(this.socket);
        chatSupport.start();
        startChat();
    }

    private void startChat() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line;
            if ((line = sc.nextLine()) != null) {
                writer.println(name + ": " + line + "\r\n");
                writer.flush()
            }
        }
    }

}

