package mp3odevbaglilist;

import java.util.Scanner;

public class SarkiList {
    Node head = null;
    Node tail = null;
    Node temp = head;
    Node temp2 = head;
    
    Scanner scanner = new Scanner(System.in);
    
    String sarkiAdi;
    String sanatciAdi;
    String tur;
    int sure;
    
    void sarkiEkle(){
        System.out.print("Sarki adini giriniz: ");
        sarkiAdi = scanner.nextLine();
        System.out.print("Sanatci adini giriniz: ");
        sanatciAdi = scanner.nextLine();
        System.out.print("Sarki turu giriniz: ");
        tur = scanner.nextLine();
        System.out.print("Sarki suresi giriniz: ");
        sure = scanner.nextInt();
        scanner.nextLine();
        
        Node sarkiNode = new Node(sarkiAdi, sanatciAdi, tur, sure);
        
        if(head == null){
            head = sarkiNode;
            tail = sarkiNode;
            head.next = null;
            System.out.println("Eklendi1");
        }
        
        else{
            sarkiNode.next = null;
            tail = sarkiNode;
            tail.next = sarkiNode;
            System.out.println("Eklendi");
        }
        
    }
    
    void sarkiSil(){
        System.out.print("Silmek istediginiz sarki adi: ");
        sarkiAdi = scanner.nextLine();
        
        if(head == null){//if /else if / else if  bastan sildi
            System.out.println("Silinecek sarki yok!");
        }
        
        else if( head.next == null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi.");
        }
        
        else if(head.sarkiAdi.equals(sarkiAdi)){
            head = head.next;
            System.out.println(sanatciAdi+" adli sarki silindi.");
        }
        
        else if(tail.sarkiAdi.equals(sarkiAdi)){//sondan sil
            temp = head;
            temp2 = head;
            
            while (temp.next != head) {                
                temp2 = temp;//sondan birönceki
                temp = temp.next;//son
            }
            temp2.next = null;
            tail = temp2; 
            System.out.println(sanatciAdi+" adli sarki silindi.");
        }
        
        else{
            temp = head;
            temp2 = head;
                
            int j=0;
            while(temp2.sarkiAdi.equals(sarkiAdi)){
                temp2=temp;
                temp = temp.next; 
                j++;
            }
            
            temp2.next=temp.next;
            System.out.println("Aradaki sarki silini");
            
        
        }
    }
}
