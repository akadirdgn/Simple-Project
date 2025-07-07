class tasit{
    int tekerlekSayisi;

    public tasit(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }
   
   
    public void yazdir(){
        System.out.println("Taşıtın tekerlek sayısı =" + tekerlekSayisi);

    }
   
   
}


class Karatasiti extends tasit{
    String soforIsmi;

    public Karatasiti(String soforIsmi, int tekerlekSayisi) {
        super(tekerlekSayisi);
        this.soforIsmi = soforIsmi;
    }

     public void yazdir(){
         super.yazdir();
        System.out.println("Taşıtı kullanan soför ismi =" + soforIsmi);
    }
   
}

class MotorluKaraTasiti extends Karatasiti{
    int silindirSayisi;

    public MotorluKaraTasiti(int silindirSayisi, String soforIsmi, int tekerlekSayisi) {
        super(soforIsmi, tekerlekSayisi);
        this.silindirSayisi = silindirSayisi;
    }
   
      public void yazdir(){
         super.yazdir();
        System.out.println("Taşıtın silindir Sayısı " + silindirSayisi);
    }
   
   
}

class Otomobil extends MotorluKaraTasiti{
    int kapiSayisi;

    public Otomobil(int kapiSayisi, int silindirSayisi, String soforIsmi, int tekerlekSayisi) {
        super(silindirSayisi, soforIsmi, tekerlekSayisi);
        this.kapiSayisi = kapiSayisi;
    }
   
   
     public void yazdir(){
         super.yazdir();
        System.out.println("Otomobilin kapı sayısı " + kapiSayisi);
    }
   
}


public class Araba{
    public static void main(String[] args) {
       
        Otomobil otomobil = new Otomobil(4, 1600, "Osman", 4);
        otomobil.yazdir();
    }
}