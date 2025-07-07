/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hastanesistem;

/**
 *
 * @author kadir
 */
public class Hasta {
	public String ad;
	public String soyad;
	public long tc;
	
	public Hasta(String ad, String soyad, long tc) {//constructer
		this.ad = ad;
		this.soyad = soyad;
		this.tc = tc;
	}
	
	public void bilgi() {//method
		System.out.printf("Ad: %s, Soyad: %s, Tc: %s", this.ad, this.soyad, this.tc);
	}
}