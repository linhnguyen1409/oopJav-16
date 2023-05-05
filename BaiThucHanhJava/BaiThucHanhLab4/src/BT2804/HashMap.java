package BT2804;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSLT" , "Co so lap trinh");
        hashMap.put("C++" , "C++");
        hashMap.put("C#" , "C Sharp");
        hashMap.put("PHP" , "PHP");
        hashMap.put("Java" , "Java");
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
