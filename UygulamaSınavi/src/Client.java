import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1221);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Bağlantı kuruldu, sunucu mesajlarını dinliyor...");

            // Sunucudan gelen mesajları dinleme
            Thread listener = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            listener.start();

            // Kullanıcıdan veri al ve sunucuya gönder
            while (true) {
                String message = userInput.readLine();
                out.println(message);
                if (message.equalsIgnoreCase("exit")) {
                    System.exit(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
