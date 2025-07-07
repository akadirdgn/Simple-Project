/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackbaglilist;

/**
 *
 * @author kadir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackYapisi sY = new StackYapisi(5);
    
        sY.push(10);
        sY.push(20);
        sY.push(9);
        sY.push(10);
        sY.push(20);
        sY.push(9);
        
        sY.print();
    }
    
}
