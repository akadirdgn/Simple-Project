/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evrensel;

/**
 *
 * @author kadir
 */
public class Bitki extends Canli{
    String yetistigiBolge;

    public Bitki(String yetistigiBolge, String cins, String ad, int yas) {
        super(cins, ad, yas);
        this.yetistigiBolge = yetistigiBolge;
    }
    
    public void bitkiBilgileri(){
        System.out.println("Yetistigi bolge: "+this.yetistigiBolge);
    }
}
