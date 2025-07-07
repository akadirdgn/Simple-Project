import java.util.Scanner;

public class PalindromOdev {
    
    public static boolean palindromKontrol(String kelime) {
        
        if (kelime.length() <= 1) {
            return true;
        }

        if (kelime.charAt(0) == kelime.charAt(kelime.length()-1)) {
            kelime = kelime.substring(1,kelime.length()-1);
            return palindromKontrol(kelime);
        } 
        else{
            return false;
        }
    
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelime giriniz: ");
        String kelime = scanner.nextLine();

        if(palindromKontrol(kelime)){
            System.out.println("Palindrom kelimedir...");
        }
        else{
            System.out.println("Palindrom kelime degildir...");
        }
        
    }
    
}