package dinamikverisimulasyonuodev2;

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
                    array[i] = word;
                    i++;
                }
            }
            
            int[] array2 = new int[i];
            
            for(int j = 0; j < i; j++){
                int sayi = Integer.parseInt(array[j]);
                array2[j] = sayi;
            }
            
            Islem islem = new Islem(i);
            
            for (int k = 0; k < i; k++) {
                islem.ekle(array2[k], k);
            }
            islem.yazdir();
            
            islem.sirala();
            islem.yazdir();
            
            
            
            bufferedReader.close();
            fileReader.close();
            
        } catch (Exception exception) {
            System.out.println("Dosya Bulunamadi!");
        }
        
    }
    
}
