/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evrensel;

/**
 *
 * @author kadir
 */
public class Esya extends Cansiz{
    String kullanimAlani;

    public Esya(String kullanimAlani, String malzeme, String ad, int yas) {
        super(malzeme, ad, yas);
        this.kullanimAlani = kullanimAlani;
    }
    
    public void esyaBilgileri(){
        System.out.println("Kullanim alani: "+this.kullanimAlani);
    }
}
