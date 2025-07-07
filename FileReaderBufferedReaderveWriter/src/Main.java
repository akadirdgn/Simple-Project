
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("text.tx")))) {
            
            while (scanner.hasNextLine()) {
                
                String CS = scanner.nextLine();
                
                String[] cs = CS.split(",");
                cs = CS.split(" ");
                
                while (cs[i] != null) {
                    System.out.println(cs[i]);
                    i++;
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir hata oluştu....");
        }
       

        
    }
}
