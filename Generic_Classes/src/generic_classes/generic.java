package generic_classes;

public class generic<E> {//genericClasses
    
    public void yazdir(E[] dizi){
        
        for(E e : dizi){
            System.out.println(e);
        }
    }
}
