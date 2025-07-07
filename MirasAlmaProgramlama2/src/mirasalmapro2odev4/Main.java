package mirasalmapro2odev4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Dosya ismini giriniz: ");
        String fileIsim = scanner.nextLine();
        
        try {
            File file = new File(fileIsim);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            int i = 0;
            String satir;
            String[] gecis;
            String[] array = new String[50];
            
            while ((satir = bufferedReader.readLine()) != null) {                
                gecis = satir.split("[\\s,:]+");
                
                for(String word : gecis){
                    if (!word.isEmpty()) { 
                        array[i] = word;
                        i++;
                    }
                }
            }
            
            bufferedReader.close();
            fileReader.close();
            
            Islem islem = new Islem(array);
            islem.kontrol();
            
        } catch (Exception exception) {
            System.out.println("Dosya Bulunamadi!");
        }

    }
    
}