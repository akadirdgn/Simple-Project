import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1221)) {
            System.out.println("Sunucu başlatıldı, istemciler bekleniyor...");

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler client = new ClientHandler(socket);
                clients.add(client);
                client.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private String clientName;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {
                out = new PrintWriter(socket.getOutputStream(), true);

                // Kullanıcıdan ismini al
                out.println("Lütfen isminizi girin:");
                clientName = in.readLine();
                System.out.println(clientName + " bağlandı.");

                // Tüm istemcilere bağlandığını bildir
                sendMessageToAll(clientName + " sohbete katıldı.");

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.equalsIgnoreCase("exit")) {
                        break;
                    }
                    String formattedMessage = new Date() + " " + clientName + ": " + message;
                    System.out.println(formattedMessage);
                    sendMessageToAll(formattedMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                clients.remove(this);
                System.out.println(clientName + " ayrıldı.");
                sendMessageToAll(clientName + " sohbetten ayrıldı.");
            }
        }

        private void sendMessageToAll(String message) {
            for (ClientHandler client : clients) {
                client.out.println(message);
            }
        }
    }
}
