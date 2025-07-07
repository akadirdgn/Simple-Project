/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kullanicigirisi;

import java.util.Scanner;

/**
 *
 * @author kadir
 */
public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String kullaniciAdi="kadir_dgn01";
        String sifre="Kkadird.47";
        
        String kullaniciAdi2;
        String sifre2;
        
        do{
            System.out.print("Kullanıcı adı:");
            kullaniciAdi2=scanner.nextLine();
            
            System.out.print("Şifre:");
            sifre2=scanner.nextLine();
            
            if(!(kullaniciAdi.equals(kullaniciAdi2) && sifre.equals(sifre2)))
                System.out.println("Kullanıcı adı veya şifre yanlış! Tekrar deneyin.\n");
            
        }while(!(kullaniciAdi.equals(kullaniciAdi2) && sifre.equals(sifre2)));
        
        System.out.println("Başarılı giriş yönlendiriliyorsunuz");
        
        
        
        
    }
}
