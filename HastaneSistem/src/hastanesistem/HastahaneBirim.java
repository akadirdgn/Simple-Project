/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hastanesistem;

/**
 *
 * @author kadir
 */
public class HastahaneBirim {
	
	public Hasta[] hastalar;
	public int hastaSayisi;
	public int siradakiHasta;
	public int randevuSirasi;
	
	public HastahaneBirim(int siraBoyutu) {
		hastalar = new Hasta[siraBoyutu];
		hastaSayisi = 0;
		siradakiHasta = 0;
		randevuSirasi = 0;
	}
	
	//push
	public void randevuEkle(Hasta hasta) {
		if (hastaSayisi == hastalar.length) {
			System.out.println("Şu an hasta sırası dolu");
		} else {
			hastalar[randevuSirasi] = hasta;
			hastaSayisi += 1; //hastaSayisi = hastaSayisi + 1
			randevuSirasi = (randevuSirasi + 1) % hastalar.length;
			System.out.println("--- Randevu alan hasta ----");
			hasta.bilgi();
		}
	}
	
	//pop
	public void siradakiHasta() {
		if (hastaSayisi == 0) {
			System.out.println("Randevu sirasinda hasta kalmadi");
		} else {
			Hasta hasta = hastalar[siradakiHasta];
			hastaSayisi -= 1; //hastaSayisi--
			siradakiHasta = (siradakiHasta + 1) % hastalar.length;
			System.out.println("--- Siradaki hasta ---");
			hasta.bilgi();
		}
	}

}