/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable1;

/**
 *
 * @author kadir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uygulama uyg = new Uygulama(5);
        uyg.Ekle(0, "Ahmet");
        uyg.Ekle(10, "Kerem");
        uyg.Ekle(15, "Elif");
        uyg.Ekle(12, "Emre");
        uyg.Ekle(11,"Mehmet");
        uyg.Ekle(33, "Yusuf");
        uyg.Ekle(14, "Zeyd");
        uyg.Ekle(24, "Yigit");
        
        System.out.println("**********-----------**********");
        uyg.yazdir();
        System.out.println("**********-----------**********");
        
        uyg.sil(15);
        
    }
    
}
