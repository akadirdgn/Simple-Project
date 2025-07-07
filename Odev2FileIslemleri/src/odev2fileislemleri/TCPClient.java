package odev2fileislemleri;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Komut: ");
            String cmd = sc.nextLine();
            out.writeUTF(cmd);
            if (cmd.equals("UPLOAD")) {
                System.out.print("Dosya: ");
                String name = sc.nextLine();
                File f = new File(name);
                out.writeUTF(f.getName());
                out.writeLong(f.length());
                try (FileInputStream fis = new FileInputStream(f)) {
                    byte[] buf = new byte[4096];
                    int r;
                    while ((r = fis.read(buf)) != -1) out.write(buf, 0, r);
                }
            } else if (cmd.equals("DOWNLOAD")) {
                System.out.print("İsim: ");
                String name = sc.nextLine();
                out.writeUTF(name);
                String resp = in.readUTF();
                if (resp.equals("OK")) {
                    long len = in.readLong();
                    try (FileOutputStream f = new FileOutputStream("indirilen_" + name)) {
                        byte[] buf = new byte[4096];
                        while (len > 0) {
                            int r = in.read(buf, 0, (int)Math.min(buf.length, len));
                            f.write(buf, 0, r);
                            len -= r;
                        }
                    }
                } else System.out.println("Dosya yok");
            } else if (cmd.equals("EXIT")) break;
        }
        s.close();
    }
}

