package trees_3_elemansilme;

public class Main {

    public static void main(String[] args) {
        
        Uygulama uyg = new Uygulama();
        
        uyg.root = uyg.insert(uyg.root, 10);
        uyg.root = uyg.insert(uyg.root, 8);
        uyg.root = uyg.insert(uyg.root, 15);
        uyg.root = uyg.insert(uyg.root, 5);
        uyg.root = uyg.insert(uyg.root, 12);
        uyg.root = uyg.insert(uyg.root, 20);
        uyg.root = uyg.insert(uyg.root, 9);
        
        uyg.inOrder(uyg.root);
        
        uyg.root = uyg.delete(uyg.root, 15);
        
        System.out.println("****************");
        uyg.inOrder(uyg.root);
    }
    
}
