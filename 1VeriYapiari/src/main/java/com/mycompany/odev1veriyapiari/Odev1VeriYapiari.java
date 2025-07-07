package com.mycompany.odev1veriyapiari;

import java.util.Scanner;

public class Odev1VeriYapiari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        int [] dizi = new int[10];
        int i,j;
        int degisken;
        
        for(i=0;i<10;i++){
            System.out.print("Dizi["+i+"]=");
            dizi[i]=scanner.nextInt();
        }
        
        System.out.println("*********Dizinin kucukten buyuge siralanmis hali*********");
        for(i = 0; i < 9; i++){
            for(j=i+1; j<10;j++){
                if(dizi[j] < dizi[i]) {
                    degisken=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=degisken;
                }
            }
        }
        
        for(i=0;i<10;i++){
            System.out.print("Dizi["+i+"]=");
            System.out.println(dizi[i]);
        }
    }
}
