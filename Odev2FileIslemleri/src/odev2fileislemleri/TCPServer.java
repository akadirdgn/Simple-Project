package odev2fileislemleri;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        while (true) {
            Socket s = ss.accept();
            new Thread(() -> {
                try (
                    DataInputStream in = new DataInputStream(s.getInputStream());
                    DataOutputStream out = new DataOutputStream(s.getOutputStream())
                ) {
                    while (true) {
                        String cmd = in.readUTF();
                        if (cmd.equals("UPLOAD")) {
                            String name = in.readUTF();
                            long len = in.readLong();
                            try (FileOutputStream f = new FileOutputStream("sunucu_" + name)) {
                                byte[] buf = new byte[4096];
                                while (len > 0) {
                                    int r = in.read(buf, 0, (int)Math.min(buf.length, len));
                                    f.write(buf, 0, r);
                                    len -= r;
                                }
                            }
                        } else if (cmd.equals("DOWNLOAD")) {
                            String name = in.readUTF();
                            File file = new File("sunucu_" + name);
                            if (file.exists()) {
                                out.writeUTF("OK");
                                out.writeLong(file.length());
                                try (FileInputStream f = new FileInputStream(file)) {
                                    byte[] buf = new byte[4096];
                                    int r;
                                    while ((r = f.read(buf)) != -1) out.write(buf, 0, r);
                                }
                            } else out.writeUTF("YOK");
                        } else if (cmd.equals("EXIT")) {
                            s.close(); break;
                        }
                    }
                } catch (Exception e) {}
            }).start();
        }
    }
}
