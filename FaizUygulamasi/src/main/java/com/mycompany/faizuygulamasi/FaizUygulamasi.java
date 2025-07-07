/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faizuygulamasi;

import java.util.Scanner;

/**
 *
 * @author kadir
 */
public class FaizUygulamasi {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        //Faiz oranı %6
        
        System.out.print("Anapara değerini giriniz:");
        int anapara=scanner.nextInt();
        
        System.out.print("Paranızı kaç yıl vade ile yatırmak istersiniz:");
        int yil=scanner.nextInt();
        
        float faiz,sonpara=anapara;
        
        for(int i=1;i<yil+1;i++){
            faiz=(float)(sonpara*0.06)+sonpara;
            System.out.println(i+". yıl sonunda faizli toplam para:"+faiz);
            
            sonpara=faiz;
        }
        
        
    }
}
