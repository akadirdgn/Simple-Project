package vyodevmp3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VYOdevMP3 {
    Sarki head;


    public void muzikEkle(String sanatci,String tur,int sure) {
        Sarki yeniDugum = new Sarki(sanatci, tur, sure);
        if (head == null) {
            head = new Sarki(sanatci, tur, sure);
            return;
        }
        yeniDugum.next = null;
        Sarki sonDugum = head;
        while (sonDugum.next != null)
            sonDugum = sonDugum.next;
        sonDugum.next = yeniDugum;
        return;
    } 
     public void muzikSil(String sanatci) {
        if (head == null) {
            System.out.println("Bagli liste bos.");
            return;
        }

        if (head.sanatci.equals(sanatci)) {
            head = head.next;
            System.out.println(sanatci + " adli sarki silindi.");
            return;
        }

        Sarki aktif = head;
        Sarki onceki = null;

        while (aktif != null && !aktif.sanatci.equals(sanatci)) {
            onceki = aktif;
            aktif = aktif.next;
        }

        if (aktif == null) {
            System.out.println(sanatci + " adli sarki bulunamadi.");
            return;
        }

        onceki.next = aktif.next;
        System.out.println(sanatci + " adlı sarki silindi.");
    }
    
    public void muzikListele() {
    Sarki dugum = head;
    while (dugum != null) {
        System.out.println("Sanatçı: " + dugum.sanatci);
        System.out.println("Tür: " + dugum.tur);
        System.out.println("Süre: " + dugum.sure + " saniye");
        System.out.println();
        dugum = dugum.next;
    }
}

    public void yazdir() {
        Sarki dugum = head;
        while (dugum != null) {
            System.out.println(dugum.sanatci);
            System.out.println(dugum.tur);
            System.out.println(dugum.sure);
            dugum = dugum.next;
        }
    }

    public static class Sarki {
        String sanatci;
        String tur;
        int sure;
        Sarki next;

        Sarki(String sanatci,String tur,int sure) {
            this.sanatci = sanatci;
            this.tur = tur;
            this.sure = sure;
            next = null;
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        
        String sanatci;
        String sanatci1;
        String tur;
        int sure;
        
        VYOdevMP3 mP3 = new VYOdevMP3();
        
        
        
        String islemler = "Muzik eklemek icin 1'e\n"
                + "Muzik cikarmak icin 2'ye\n"
                + "Muzik siralamak icin 3'e\n"
                + "Oynatmak icin 4'e\n"
                + "Cikis icin 0'a basiniz...\n";
        
        System.out.print(islemler);
        System.out.println("*********------------------*********");

        while (true) {            
        System.out.print("Secim giriniz: ");
        int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Sarki suresini giriniz: ");
                    sure = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.print("Sanatciyi giriniz: ");
                    sanatci = scanner.nextLine();
                   
                    
                    System.out.print("Sarki turunu giriniz: ");
                    tur = scanner.nextLine();

                    mP3.muzikEkle(sanatci, tur, sure);
                    break;
                    
                case 2:
                    scanner.nextLine();
                    System.out.print("Silinecek sarkinin sanatcisini giriniz: ");
                    sanatci1 = scanner.nextLine();
                    mP3.muzikSil(sanatci1);
                    break;
                
                case 3:
                    mP3.yazdir();
                    System.out.println("Muzik caliyor...");
                    Thread.sleep(5000);
                    
                    break;
                    
                case 4:
                    mP3.muzikListele();
                    break;
                
                case 0:
                    System.out.print("Isleminiz sonlanmistir.\n");
                    System.exit(0);
            }
        }
        
    }
    
}
