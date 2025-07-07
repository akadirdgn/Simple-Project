package com.mycompany.ortalama;
//Verilen 3 sayının ortalamasını bulunuz.

import java.util.Scanner;


public class Ortalama {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("3 adet sayı giriniz=");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        
        float ort=(float)(a+b+c)/3;
        
        System.out.println("Girilen sayıların ortalaması="+ort);
    }
}
