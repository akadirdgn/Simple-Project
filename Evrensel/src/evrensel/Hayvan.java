/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evrensel;

/**
 *
 * @author kadir
 */
public class Hayvan extends Canli{
    int bacakSayisi;

    public Hayvan(int bacakSayisi, String cins, String ad, int yas) {
        super(cins, ad, yas);
        this.bacakSayisi = bacakSayisi;
    }

   public void hayvanBilgileri(){
       System.out.println("BacakSayisi: "+this.bacakSayisi);
   }
    
    
}
