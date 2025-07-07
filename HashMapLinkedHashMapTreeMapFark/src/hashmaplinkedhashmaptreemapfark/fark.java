package hashmaplinkedhashmaptreemapfark;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class fark {
    public static void mapYazdir(Map<Integer,String> map){
        map.put(5, "Java");
        map.put(100, "C");
        map.put(25, "C++");
        map.put(35, "Python");
        
        /*for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Anahtar: "+key+" Deger: "+value);
            
        }*/
        
        /*System.out.println(map.keySet());//anahtarlar basılır
        
        for (Integer i : map.keySet()) {
            
            System.out.println("anahtar: "+ i + " deger: "+map.get(i));
            
        }*/
        
        Collection<String> values = map.values();//sadece değer yazdırma collection ile
        
        for (String value : values) {
            System.out.println("Deger: "+value);
        }

        
    }
    
            
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        
        System.out.println("*****------*****");
        System.out.println("HashMap");//karışık
        fark.mapYazdir(hashMap);
        
        System.out.println("*****------*****");
        System.out.println("LinkedHashMap");//sıraya göre 
        fark.mapYazdir(linkedHashMap);
        
        System.out.println("*****------*****");
        System.out.println("TreeMap");//key e göre sıralar
        fark.mapYazdir(treeMap);
    }
    
}
