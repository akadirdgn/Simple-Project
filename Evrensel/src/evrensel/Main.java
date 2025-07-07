/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evrensel;

/**
 *
 * @author kadir
 */
public class Main {
    public static void main(String[] args) {
    Evrensel evrensel=new Evrensel("Kadir", 19);
    Canli canli = new Canli("Kopek", "Maraz", 7);
    Cansiz cansiz = new Cansiz("Bilgisayar", "Dell", 1);
    Hayvan hayvan = new Hayvan(4, "Inek", "Mocuk", 8);
    Bitki bitki = new Bitki("Akdeniz", "Olea", "Zeytin", 50);
    Araba araba = new Araba("BMW", "Celik","BMW E200", 3);
    Esya esya = new Esya("Supurge", "ot", "Supurge", 1);
    
    evrensel.bilgileriGoster();
    System.out.println("**********----------------**********");
    canli.canliBilgileri();
    System.out.println("**********----------------**********");
    cansiz.cansizBilgileri();
    System.out.println("**********----------------**********");
    araba.arabaBilgileri();
}
    
    
}
