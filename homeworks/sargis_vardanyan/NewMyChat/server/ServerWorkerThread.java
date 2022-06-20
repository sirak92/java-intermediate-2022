package server;

import java.io.*;
import java.net.Socket;
import java.util.Map;

public class ServerWorkerThread extends Thread {
    private Map<String, Socket> clients;
    private Socket newClient;

    public ServerWorkerThread(Socket newClient, Map<String, Socket> clients) {
        this.clients = clients;
        this.newClient = newClient;
    }

    @Override
    public void run() {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(newClient.getInputStream()));
                PrintWriter writer;
                String line = reader.readLine();
                while (line != null) {
                    if (line.endsWith("entered chat")) {
                        clients.put(line.split(" ")[0], newClient);
                    }
                    for (Socket s: clients.values()) {
                        writer = new PrintWriter(s.getOutputStream());
                        writer.println(line);
                        writer.flush();
                    }
                    line = null;
                }
            } catch (
                    IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}