package evrensel;

public class Canli extends  Evrensel{
    String cins;
    
    
    public Canli(String cins, String ad, int yas) {
        super(ad, yas);
        this.cins = cins;
    }
    
    
    public void canliBilgileri(){
        System.out.println("Ad: "+ad);
        System.out.println("Yas: "+yas);
        System.out.println("Cins: "+this.cins);
    }

   
    
}
