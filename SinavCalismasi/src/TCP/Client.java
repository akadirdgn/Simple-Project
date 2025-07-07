/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author kadir
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1234);
        System.out.println("Socket olusturuldu...");
        
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Merhaba ben istemci!");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String cevap = in.readLine();

    }
}
