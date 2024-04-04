package lesson23;
import java.util.HashMap;
public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Deutschland");
        hashMap.put("BMW", "Deutschland");
        hashMap.put("Lada", "Russland");

        if (hashMap.containsKey("Audi")){
            System.out.println("Aidi was found");
        }
        if (hashMap.containsValue("Deutschland")){
            System.out.println("Deutschland was found");
        }
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}
