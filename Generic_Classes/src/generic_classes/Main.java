package generic_classes;

public class Main {

    public static void main(String[] args) {
        
        Character[] charDizi = {'k','a','d','i','r'};
        Integer[] intDizi = {1,2,3,4};
        String[] stringDizi = {"Kadir","Memo","Baro","Miray"};
        
        
        generic<Character> char_1 = new generic<>();
        char_1.yazdir(charDizi);
        System.out.println("********-----------********");
        generic<Integer> int_1 = new generic<>();
        int_1.yazdir(intDizi);
        System.out.println("********-----------********");
        generic<String> string_1 = new generic<>();
        string_1.yazdir(stringDizi);
        
        System.out.println("");
        System.out.println("Generic method");
        yazdir(intDizi);
    }
    
    public static <E> void yazdir(E[] dizi){//genericMethod
        for(E e : dizi){
            System.out.println(e);
        }
    }
    
}
