package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap {

    
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
        hashMap.put(10, "JAVA");
        hashMap.put(30,"Python");
        hashMap.put(50, "PHP");
        hashMap.put(60,"C");
        hashMap.put(70,"C");//true aynı ama key farklı
        hashMap.put(60,"C");//false key aynı
        hashMap.put(10, "C++");//jAVAYI SİLER C++ EKLER
        
        System.out.println(hashMap);//hepsini yazar
        
        System.out.println(hashMap.get(10));//key e göre stringi verir
        System.out.println(hashMap.get(100));//null
        
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Anahtar: "+key+" Deger: "+value);
            
        }
        
    }
    
}
