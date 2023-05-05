package BT2804;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(10,"Mo");
        hm.put(101,"Dia");
        hm.put(102,"Chat");
        for (Map.Entry<Integer,String> m:hm.entrySet())
        System.out.println(m.getKey() + " " + m.getValue());
        System.out.println(" before invoking remove method: " + hm);
        hm.remove(101);
        System.out.println(" After invoking remove method: " + hm);
    }
}
