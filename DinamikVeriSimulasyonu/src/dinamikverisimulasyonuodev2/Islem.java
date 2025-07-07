package dinamikverisimulasyonuodev2;

public class Islem {
    Node[] dizi;
    int boyut;
    
    public Islem(int lenght) {
        dizi = new Node[lenght];
        boyut = 0;
    }
    
    public void ekle(int x,int y){
        Node sayi = new Node(x, y);
        dizi[boyut] = sayi;
        boyut++;
        
    }
    public void sirala(){
         for (int i = 0; i < boyut - 1; i++) {
            for (int j = 0; j < boyut - i - 1; j++) {
                if (dizi[j].x > dizi[j + 1].x) {
                    Node temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }
    public void yazdir(){
        System.out.println("x    y");
        System.out.println("------");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i].x);
            System.out.println("    "+dizi[i].y);
        }
        System.out.println("***********-------------***********");
    }
    
    
}
