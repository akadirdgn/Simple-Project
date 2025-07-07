package FileTCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
   
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            //sunucudan alınacak dosya adı kullanıcıdan istenebilir veya elle yazılabilir
            Scanner scanner = new Scanner(System.in);
            System.out.println("indirilecek dosya adi:");
            String dosyaAdi = scanner.nextLine();
            out.writeUTF(dosyaAdi);//istenen dosya adını sunucuya yaz
            String cevap = input.readUTF();
            if (!cevap.equals("TRUE")) { //Gelen cevap TRUE değilse veya FALSE ise bulunamamıştır
                System.out.println("Dosya sunucuda bulunamadi.");
            } else {
                FileOutputStream fs = new FileOutputStream(dosyaAdi);//İndirilecek klasörün konumu gerekirse yazılabilir
                byte[] buffer = new byte[4096];
                int okunanByte;
                while (true) {
                    okunanByte = input.read(buffer);
                    if (okunanByte <= 0) {
                        break;
                    }
                    fs.write(buffer, 0, okunanByte);
                }
                fs.close();
                System.out.println("Dosya indirildi.");
            }
            socket.close();
        } catch (IOException ex) {
            System.out.println("Hata olustu:" + ex.getMessage());
        }

    }

}
