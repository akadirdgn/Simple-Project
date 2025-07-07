package hastanesistem;

import java.util.Scanner;


public class Test {
    public static void main(String args[]) {
 		
 		// Hastahane örneği
 		HastahaneBirim hastahaneBirim = new HastahaneBirim(10);
 		
 		Hasta hasta1 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta2 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta3 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta4 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta5 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta6 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta7 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta8 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		Hasta hasta9 = new Hasta("hast_ad", "hasta_soyad", 123456789L);
 		
 		hastahaneBirim.randevuEkle(hasta1);
 		hastahaneBirim.randevuEkle(hasta2);
 		hastahaneBirim.randevuEkle(hasta3);
 		hastahaneBirim.randevuEkle(hasta4);
 		hastahaneBirim.randevuEkle(hasta5);
 		hastahaneBirim.randevuEkle(hasta6);
 		hastahaneBirim.randevuEkle(hasta7);
 		hastahaneBirim.randevuEkle(hasta8);
 		hastahaneBirim.randevuEkle(hasta9);
 		
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		hastahaneBirim.siradakiHasta();
 		
 		
 	}
        
        
        
    
}
