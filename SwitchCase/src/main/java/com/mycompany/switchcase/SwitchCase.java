/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;

import java.util.Scanner;

/**
 *
 * @author kadir
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İşlem giriniz:");
        int islem=scanner.nextInt();
        
        //break switch işleminden direk çıkar
        switch (islem) {
            case 1:
                System.out.println("İslem 1");
                break;
            case 2:
                System.out.println("İslem 2");
                break;
            case 3:
                System.out.println("İslem 3");
                break;
                
            default://default case ler dışındakı işlemler
                System.out.println("Gecersiz islem");
                break;
                
        }
    }
}
