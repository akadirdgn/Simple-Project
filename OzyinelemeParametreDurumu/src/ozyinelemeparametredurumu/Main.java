package ozyinelemeparametredurumu;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int ikiliArama(int[] dizi, int sol, int sag, int arananDeger, Stack<Integer> onceStack1, Stack<Integer> sonraStack1) {
        if (sag >= sol) {
            int orta = sol + (sag - sol) / 2;
            
            onceStack1.push(sol);
            onceStack1.push(sag);
            onceStack1.push(arananDeger);

            if (dizi[orta] == arananDeger) {
                sonraStack1.push(orta);
                sonraStack1.push(sol);
                sonraStack1.push(arananDeger);
                return orta;
            }

            else if (dizi[orta] > arananDeger) {
                sonraStack1.push(orta - 1);
                sonraStack1.push(sol);
                sonraStack1.push(arananDeger);
                return ikiliArama(dizi, sol, orta - 1, arananDeger, onceStack1, sonraStack1);
            }

            else{
                sonraStack1.push(sag);
                sonraStack1.push(orta + 1);
                sonraStack1.push(arananDeger);
                return ikiliArama(dizi, orta + 1, sag, arananDeger, onceStack1, sonraStack1);
            }
        }
        

        sonraStack1.push(-1);
        return -1;
    }
    
    static int minDegerBul(int[] dizi, int sol, int sag, Stack<Integer> onceStack2, Stack<Integer> sonraStack) {
        if (sol == sag) {
            sonraStack.push(dizi[sol]);
            return dizi[sol];
        } else {
            int orta = sol + (sag - sol) / 2;

            onceStack2.push(sol);
            onceStack2.push(sag);

            int solMin = minDegerBul(dizi, sol, orta, onceStack2, sonraStack);

            int sagMin = minDegerBul(dizi, orta + 1, sag, onceStack2, sonraStack);

            int min = Math.min(solMin, sagMin);

            sonraStack.push(min);

            return min;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("                        IKILI ARAMA");
        System.out.println("********************-----------------********************");
        
        int[] dizi = {2, 3, 4, 10, 11,12,13,14,15,16,17,18,19,25,44,56,57,59,61,76,78,79,88,91,96,99,106,111};
        int n = dizi.length;
        Stack<Integer> onceStack1 = new Stack<>();
        Stack<Integer> sonraStack1 = new Stack<>();
        System.out.print("Lutfen aranan degeri giriniz: ");
        int x = scanner.nextInt();
        int deger = ikiliArama(dizi, 0, n - 1, x, onceStack1, sonraStack1);
        
        System.out.println("Fonksiyonu cagirmadan once:");
        while (!onceStack1.isEmpty()) {
            int arananDeger = onceStack1.pop();
            int sag = onceStack1.pop();
            int sol = onceStack1.pop();
            System.out.println("sol index = " + sol + ", sag index = " + sag + ", aranan sayi = " + arananDeger);
        }
        
        System.out.println("\nFonksiyonu cagirdiktan sonra:");
        while (!sonraStack1.isEmpty()) {
            int arananDeger = sonraStack1.pop();
            if (!sonraStack1.isEmpty()) {
                int sol = sonraStack1.pop();
                int sag = sonraStack1.pop();
                System.out.println("sol index = " + sol + ", sag index = " + sag + ", aranan sayi = " + arananDeger);
            }
        }
        
        System.out.println("Aranan deger " + deger + ". indexte bulundu.");
        
        System.out.println("\n\n\n\n");
        System.out.println("                        MINIMUM DEGER BUL");
        System.out.println("**********************---------------------**********************");
        
        
        
        int[] dizi2 = {64, 25, 12, 22, 11,57,14,36,77,81,51,123,24,78,99,9,17,35};
        int m = dizi2.length;

        Stack<Integer> onceStack2 = new Stack<>();
        Stack<Integer> sonraStack2 = new Stack<>();

        int min = minDegerBul(dizi2, 0, m - 1, onceStack2, sonraStack2);

        System.out.println("Fonksiyonu cagirmadan once:");
        while (!onceStack2.isEmpty()) {
            int sag = onceStack2.pop();
            int sol = onceStack2.pop();
            System.out.println("sol index = " + sol + ", sag index = " + sag);
        }

        System.out.println("\nFonksiyonu cagirdiktan sonra:");
        while (!sonraStack2.isEmpty()) {
            int minimum = sonraStack2.pop();
            System.out.println("En kucuk deger = " + minimum);
        }
    

    }
}