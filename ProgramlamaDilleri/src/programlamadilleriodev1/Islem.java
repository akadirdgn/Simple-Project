/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programlamadilleriodev1;

public class Islem {
    String[] kelimeler;
    
    
    public Islem(String[] kelimeler) {
        this.kelimeler = kelimeler;
    }

    
    public static String[] ozne = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
    
    public static String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi","Salı", "Çarşamba", "Perşembe",
        "Cuma","Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};

    public static String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

    
    public void Kontrol(){
        boolean ozneKontrol = false;
        boolean nesneKontrol = false;
        boolean yuklemKontrol = false;
        int i = 0;
        
        while (i != 9) {            
            if(kelimeler[0].equals(ozne[i])){
                ozneKontrol = true;
            }
            i++;
        }
        
        i = 0;
        while (i != 18) {            
            if(kelimeler[1].equals(nesne[i])){
                nesneKontrol = true;
            }
            i++;
        }
        
        i = 0;
        while (i != 6) {            
            if(kelimeler[2].equals(yuklem[i])){
                yuklemKontrol = true;
            }
            i++;
        }
        
        Islem.sonuc(ozneKontrol, nesneKontrol, yuklemKontrol);
    }
    
    public static void sonuc(boolean ozneKontrol, boolean nesneKontrol, boolean yuklemKontrol) {
        
        if(ozneKontrol && nesneKontrol && yuklemKontrol){
            System.out.println("EVET");
        }
        else{
            System.out.println("HAYIR");
        }
    }
    
}
