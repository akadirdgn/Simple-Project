package gramerodevi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cumle;
        
        System.out.print("Lutfen cumleyi giriniz: ");
        cumle = scanner.nextLine();
        
        StringTokenizer stringTokenizer = new StringTokenizer(cumle);
        
        String[] kelimeler = new String[10];
        int i = 0;
        
        while (stringTokenizer.hasMoreTokens()) {
            String kelime = stringTokenizer.nextToken();
            kelimeler[i] = kelime;
            i++;
        }
        
        
        if(i == 3){
            Islem islem = new Islem(kelimeler);
            islem.Kontrol();
        }
        else{
            System.out.println("HAYIR");
        }
        
    }
}