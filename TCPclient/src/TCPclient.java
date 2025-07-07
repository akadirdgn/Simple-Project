

import java.io.*;
import java.net.*;

public class TCPclient {

    public static void main(String[] args) {
        // Sunucu IP adresi ve port numarası
        String serverAddress = "localhost"; // Sunucu bilgisini buraya girin (localhost yerel makineyi ifade eder)
        int port = 8089;

        try {
            // Sunucuya bağlanıyoruz
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Sunucuya baglanildi: " + socket.toString());

            // Sunucuya veri göndermek ve almak için gerekli olan akışları oluşturuyoruz
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));  // Kullanıcıdan veri alacak
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Sunucuya veri gönderecek
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  // Sunucudan gelen veri

            // Kullanıcıdan mesaj almak ve sunucuya göndermek
            String userInput;
            while (true) {
                System.out.print("Mesajinizi yazin: ");
                userInput = inputReader.readLine();

                // Kullanıcı "exit" yazarsa çıkıyoruz
                if (userInput.equalsIgnoreCase("exit")) {
                    out.println(userInput);
                    System.out.println("Baglanti kapatiliyor...");
                    break;
                }

                // Sunucuya mesaj gönderiyoruz
                out.println(userInput);

                // Sunucudan cevabı alıyoruz ve ekrana yazdırıyoruz
                String response = in.readLine();
                System.out.println("Sunucudan gelen cevap: " + response);
            }

            // Bağlantıyı kapatıyoruz
            socket.close();
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
