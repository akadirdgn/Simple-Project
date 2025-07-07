/*
Serverin aynı anda birden çok client ile iletişim kurabilmesi için Thread kullanılmalıdır.
Client tarafında bunun için ekstra bir işlem yapılmasına gerek yoktur.
Birden fazla client uygulaması oluşturulup hepsi de aynı sunucuya ve aynı port numarasına(1234) bağlanabilir
Her bağlanan client için serverSocket.accept() metodu çalışıp bir ClientHandler nesnesi oluşturulur
*/

/*TCPServerThread.java → Çoklu istemcili TCP sunucu
ThreadOrnek.java → Thread sınıfını miras alarak Thread kullanımı
ThreadOrnek2.java → İki farklı Thread'in eşzamanlı çalıştırılması
ThreadOrnekRunnable.java → Runnable arayüzü ile Thread kullanımı
*/


package tcpserver;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPServerThread {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(2312);
            System.out.println("Sunucu TCP Socket olusturuldu. Baglanti bekleniyor..");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println(clientSocket.toString() + " baglandi.");

                ClientHandler handler = new ClientHandler(clientSocket);
                handler.start();
            }
        } catch (IOException ex) {
            System.out.println("Baglanti saglanamadi: " + ex.getMessage());
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;
    private PrintWriter out;
    private Scanner input;

    public ClientHandler(Socket socket) {
        try {
            this.clientSocket = socket;
            this.out = new PrintWriter(clientSocket.getOutputStream(), true);
            this.input = new Scanner(clientSocket.getInputStream());
        } catch (IOException ex) {
            System.out.println("Baglanti hatasi: " + ex.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            String gelenVeri;
            do {
                gelenVeri = input.nextLine();           
                System.out.println("Gelen mesaj: " + gelenVeri);
                out.println(gelenVeri.toUpperCase());
            } while (!gelenVeri.equalsIgnoreCase("exit"));
        } finally {
            try {
                if (clientSocket != null) {
                    System.out.println("Baglanti kapatiliyor..");
                    clientSocket.close();
                }
            } catch (IOException ex) {
                System.out.println("Baglanti kapatilamadi: " + ex.getMessage());
            }
        }
    }
}