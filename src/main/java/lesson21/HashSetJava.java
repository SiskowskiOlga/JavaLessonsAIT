package lesson21;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetJava {
    public static void main(String[] args) {
        HashSet<String> hashSetCars = new HashSet<>();
        hashSetCars.add("Audi");
        hashSetCars.add("BMW");
        hashSetCars.add("VW");

        //попытка добавить дупликат,
        //сохраняются лишь уникальные элементы
        hashSetCars.add("Audi");

        //Проверка наличия элемента
        if(hashSetCars.contains("Audi")){
            System.out.println("Найден элемент");
        }

        //удаление элемента
        hashSetCars.remove("VW");

        System.out.println();

        //Итерация по элементам
        for(String car: hashSetCars){
            System.out.println(car);
        }

        Iterator<String> iterator = hashSetCars.iterator();
        while (iterator.hasNext()){
            String car = iterator.next();
            if(car.equalsIgnoreCase("Audi")){
                iterator.remove();
                System.out.println("removed !!!");
            }
        }

        for(String car: hashSetCars){
            System.out.println(car);
        }

    }

}
