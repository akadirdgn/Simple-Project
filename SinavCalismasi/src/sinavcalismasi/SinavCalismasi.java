/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinavcalismasi;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author kadir
 */
public class SinavCalismasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress adres = InetAddress.getLocalHost();
        System.out.println("adres:" + adres.toString());
        System.out.println("host:" + adres.getHostName());
        System.out.println("ip:" + adres.getHostAddress());

        System.out.println("********--------********");
           
        InetAddress adres2 = InetAddress.getByName("inonu.edu.tr");
        System.out.println("adres:" + adres2.toString());
        System.out.println("host:" + adres2.getHostName());
        System.out.println("ip:" + adres2.getHostAddress());
        
    }

}
