package swinguninotortalaması;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Client {
    
    public static void main(String[] args) {
        
        int vize1,vize2;
        int final1;
        
        String svize1 = JOptionPane.showInputDialog("Lutfen 1. vize notunuzu giriniz: ");
        vize1 = Integer.parseInt(svize1);
        
        while (vize1 < 0 || vize1 >  100) {            
                svize1 = JOptionPane.showInputDialog(null,"Lutfen 1. vize notunuzu giriniz: ","Vize1",JOptionPane.WARNING_MESSAGE);
                vize1 = Integer.parseInt(svize1);
        }
        
        String svize2 = JOptionPane.showInputDialog("Lutfen 2. vize notunuzu giriniz: ");
        vize2 = Integer.parseInt(svize2);
        
        while (vize2 < 0 || vize2 >  100) {            
                svize2 = JOptionPane.showInputDialog(null,"Lutfen 2. vize notunuzu giriniz: ","Vize2",JOptionPane.WARNING_MESSAGE);
                vize2 = Integer.parseInt(svize2);
        }
        
        String sfinal = JOptionPane.showInputDialog("Lutfen final notunuzu giriniz: ");
        final1 = Integer.parseInt(sfinal);
        
        
        while (final1 < 0 || final1 >  100) {            
                sfinal = JOptionPane.showInputDialog(null,"Lutfen final notunuzu giriniz: ","Final",JOptionPane.WARNING_MESSAGE);
                final1 = Integer.parseInt(sfinal);
        }
        
        double result = vize1*0.2 + vize2*0.2 + final1*0.6;
        
        String message = "";
        
        if(result > 50)
            message += "Tebrikler dersten geçtiniz";
        else
            message += "Kaldiniz";
        
        
        ImageIcon ii = new ImageIcon("C:\\Users\\kadir\\Documents\\GitHub\\KadirProject\\SwingUniNotOrtalaması\\src\\Img\\depositphotos_395049852-stock-illustration-education-or-knowledge-line-outline.jpg");
        
        JOptionPane.showMessageDialog(null,message,"Sonuc acıklama",JOptionPane.INFORMATION_MESSAGE,ii);
        
        
        
    }
    
}
