package hashtable1;

public class Uygulama {
    Node dizi[];
    int size;

    public Uygulama(int size) {
        this.size = size;
        dizi = new Node[size];
        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = new Node();
        }
    }
    
    int keyIndexUret(int key){
        return key % size;
    }
    
    void Ekle(int key,String isim){
        int index = keyIndexUret(key);
        
         Node eleman = new Node(key,isim);
         Node temp = dizi[index];
        
         while (temp.next != null) {   //sonaEkle         
            temp = temp.next;
        }
        temp.next = eleman;
         
        System.out.println(eleman.isim+" eklendi.");
    }
    
    void sil(int key){
        int indis = keyIndexUret(key);
        Node temp = dizi[indis];
        Node temp2 = dizi[indis];
        
        if(temp.next == null){
            System.out.println(key+" numarali kayit yok");
        }
        else if(temp.next.next == null && temp.next.key == key){
            System.out.println(key+" silindi.**");
            temp.next = null;
        }
        else{
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
                
                if(temp.key == key){
                    System.out.println(temp.isim+" silindi.");
                    temp2.next = temp.next;
                }
            }
        }
        
    }
    void yazdir(){
        Node temp,temp2;
        for (int i = 0; i < dizi.length; i++) {
            temp = dizi[i];
            temp2 = dizi[i];
            
            while (temp.next != null) {                
                temp2 = temp;
                temp = temp.next;
                System.out.print(temp.isim+" ->");
            }
            System.out.println("");
        }    
    }
    
    
}
