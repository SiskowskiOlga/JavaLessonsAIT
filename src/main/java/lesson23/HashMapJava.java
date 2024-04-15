package lesson23;
import java.util.HashMap;
import  java.util.Map;
public class HashMapJava {
    public static void main(String[] args){
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

        // выводит в паре
        System.out.println(hashMap.entrySet());

        //получаем размер элементов
        System.out.println(hashMap.size());

        //удаляем элемент
        hashMap.remove("Audi");
        System.out.println(hashMap.entrySet());

        //
        hashMap.get("BMW");
        System.out.println(hashMap.get("BMW"));



        //очищает полностью все в HashMap.clear();
        System.out.println(hashMap.entrySet());

        //for-keys
        System.out.println("-----for----");
        for(String autoname:hashMap.keySet()){
          System.out.println(hashMap.get(autoname));
        }

        //for-values
        System.out.println("---for-value---");
        for(String country: hashMap.values()){
            System.out.println(country);
        }

        //for-keys and for-values
        System.out.println("---for-keys----and----for-values---");
        for (Map.Entry<String, String> entry : hashMap.entrySet()){
          System.out.println("name-->" + entry.getKey()+ " country-->" + entry.getValue());
        }




    }
}
