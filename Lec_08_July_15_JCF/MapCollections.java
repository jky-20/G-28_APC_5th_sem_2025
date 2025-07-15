package Lec_08_July_15_JCF;

import java.util.HashMap;

public class MapCollections {
    public static void main(String[] args) {
        
        String m1 = "Taj Mahal";
        String m2 = "Char Minar";
        String m3 = "Red Fort";
        String m4 = "India Gate";

        String c1 = "Delhi";
        String c2 = "Hydrabad";
        String c3 = "Agra";

        HashMap<String,String> hmap = new HashMap<>();
        hmap.put(m2, c2);
        hmap.put(m1, c3);
        hmap.put(m3, c1);
        hmap.put(m4, "Delhi");

        System.out.println(hmap.get("Red Fort"));   // outputs Delhi
        
        String place = hmap.get("Beta Zone");   // returns null
        
        hmap.getOrDefault("Beta Zone", "Chitkara U");

        // check if key or Value exists or not
        hmap.containsKey("Qutub Minar");
        hmap.containsValue("Delhi");

        // getting all keys or values
        hmap.keySet();
        hmap.values();
        hmap.entrySet();

        for(String key : hmap.keySet()){
            System.out.println(key);
        }
        for(var entry : hmap.entrySet()){
            entry.getKey();
            entry.getValue();
        }
    }
}
