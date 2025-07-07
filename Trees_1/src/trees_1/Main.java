/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trees_1;

/**
 *
 * @author kadir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Uygulama uyg = new Uygulama();
        
        uyg.root = uyg.insert(uyg.root, 10); 
        uyg.root = uyg.insert(uyg.root, 15); 
        uyg.root = uyg.insert(uyg.root, 8); 
        uyg.root = uyg.insert(uyg.root, 20); 
        uyg.root = uyg.insert(uyg.root, 4); 
        uyg.root = uyg.insert(uyg.root, 12); 
        
        System.out.println("Kokun datasi: "+uyg.root.data);
        System.out.println("Kokun sag datasi: "+uyg.root.right.data);
        System.out.println("Kokun sol datasi: "+uyg.root.left.data);
        System.out.println("Kokun solunun solunun datasi: "+uyg.root.left.left.data); 
        
        
    }
    
}
