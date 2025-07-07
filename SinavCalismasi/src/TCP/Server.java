/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author kadir
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Socket acildi...");
        
        Socket socket = serverSocket.accept();
        System.out.println("Istemci baglantisi kabul edildi...");
        
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(out);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String gelenVeri = in.readLine();
        
    }

    
}
