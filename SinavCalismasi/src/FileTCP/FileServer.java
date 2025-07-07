package FileTCP;

import java.io.*;
import java.net.*;

/**
 *
 * @author ahmet
 */
public class FileServer {
   
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("File Server baslatildi.");

            Socket socket = serverSocket.accept();
            System.out.println("Client baglandi.");

            DataInputStream input = new DataInputStream(socket.getInputStream());//istemciden veri alma nesnesi
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());//istemciye veri gönderme nesnesi

            String dosyaAdi = input.readUTF();
            System.out.println("client istenen dosya:" + dosyaAdi);
            //sunucuda okunup gönderilecek dosya için File nesnesi oluştur
            //Dosya konumu belirtilmezse projenin çalıştığı klasöre bakar
            //Belirli bir konumda dosya aranacaksa dosya adı ile birlikte konum da yazılmalıdır
            //File dosya = new File("C:/Dosyalar/"+dosyaAdi);
            File dosya = new File(dosyaAdi);

            if (!dosya.exists()) {
                out.writeUTF("FALSE");//dosya yoksa istemciye mesaj gönder
            } else {
                out.writeUTF("TRUE");
                FileInputStream fs = new FileInputStream(dosya);
                byte[] buffer = new byte[4096];
                //Dosya her adımda 4kb olarak okunup gönderilir
                while (true) {
                    int okunanByte = fs.read(buffer);
                    if (okunanByte <= 0) {//Dosyanın sonuna ulaşılmışsa döngüden çıksın
                        break;
                    }
                    out.write(buffer, 0, okunanByte);
                }
                fs.close();
                System.out.println("Dosya gonderildi.");
            }
            socket.close();
        } catch (IOException ex) {
            System.out.println("Hata olustu:" + ex.getMessage());
        }

    }

}
