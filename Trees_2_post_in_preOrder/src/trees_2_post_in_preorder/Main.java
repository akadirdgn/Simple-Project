package trees_2_post_in_preorder;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Uygulama uyg = new Uygulama();
        
        uyg.root = uyg.insert(uyg.root, 10);
        uyg.root = uyg.insert(uyg.root, 8);
        uyg.root = uyg.insert(uyg.root, 15);
        uyg.root = uyg.insert(uyg.root, 5);
        uyg.root = uyg.insert(uyg.root, 12);
        uyg.root = uyg.insert(uyg.root, 20);
        uyg.root = uyg.insert(uyg.root, 9);
        
        System.out.print("PreOrder Dolasma: ");
        uyg.preOrder(uyg.root);
        
        System.out.println("");
        System.out.println("***************--------***************");
        System.out.print("InOrder Dolasma: ");
        uyg.inOrder(uyg.root);
        
        
        System.out.println("");
        System.out.println("***************--------***************");
        System.out.print("PostOrder Dolasma: ");
        uyg.postOrder(uyg.root);
        
        System.out.println("");
        System.out.println("agacin yuksekligi: "+uyg.height(uyg.root));
    
        System.out.println("Agac size i: "+uyg.size(uyg.root));
    }
    
}
