package BT1205;
import java.util.Set;
import java.util.Map.Entry;

import BT2804.character;

public class Slide106 {
    public static void main(String[] args) {
        TreeMap<Integer, character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');
        Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac erntry co trong setTreeMap: ");
        System.out.println(setTreeMap);
    }
}
