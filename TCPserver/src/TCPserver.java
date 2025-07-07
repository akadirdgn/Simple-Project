import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TCPserver {
    public static void main(String[] args) {
        int port = 8089; // Sunucu port numarası

        try (ServerSocket serverSocket = new ServerSocket(port)) { // ServerSocket oluştur
            System.out.println("Sunucu Baslatildi. Baglanti bekleniyor...");

            
                try {
                    Socket socket = serverSocket.accept(); // İstemci bağlantısını kabul et
                    System.out.println("Istemciye baglanildi: " + socket.getInetAddress());
                    

                    BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String gelenVeri = in.readLine();
                    System.out.println(gelenVeri);
                    
                    // İstemciye mesaj gönder
                    try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
                        out.println(gelenVeri.toUpperCase());
                    }
                    
                    

                    // Bağlantıyı kapat
                    socket.close();
                } catch (IOException e) {
                    System.out.println("İstemci ile bağlantı hatası: " + e.getMessage());
                }
            
        } catch (IOException ex) {
            Logger.getLogger(TCPserver.class.getName()).log(Level.SEVERE, "Sunucu baslatilamadi!", ex);
        }
    }
}
