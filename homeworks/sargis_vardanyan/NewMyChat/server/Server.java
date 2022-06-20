package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    public static void main(String[] args) throws IOException {
        new Server(8080).accept();
    }

    private final ServerSocket ss;

    private Map<String, Socket> clients;

    public Server(int port) throws IOException {
        ss = new ServerSocket(port);
        clients = new ConcurrentHashMap<>();
    }


    public void accept() throws IOException {
        while (true) {
            new ServerWorkerThread(ss.accept(), this.clients).start();
        }
    }

}
