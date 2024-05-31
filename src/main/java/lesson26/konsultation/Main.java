package lesson26.konsultation;

import java.util.ArrayList;


/*
создайте List для строк и добавьте в него
следующие элементы "Java" "python" выведите содержимое в списка
 */
public class Main {

    public static void main(String[] args) {
        // Создание ArrayList для строк
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов в список
        list.add("Java");
        list.add("Python");

        // Вывод содержимого списка
        System.out.println("Содержимое списка:");
        for (String element : list) {
            System.out.println(element);
        }





    /*
    Имея `ArrayList` с элементами "Red", "Green", "Blue", "Yellow", удалите "Green" и "Yellow" из списка.
    Выведите итоговый список на экран.
     */


        // Создаем ArrayList с элементами "Red", "Green", "Blue", "Yellow"
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Удаляем "Green" и "Yellow" из списка
        colors.remove("Green");
        colors.remove("Yellow");

        // Выводим итоговый список на экран
        System.out.println("Итоговый список:");
        for (String color : colors) {
            System.out.println(color);
        }


                /*
                Дан `ArrayList` с элементами 1, 2, 3, 4, 5.
                Выведите на экран третий элемент списка.
                */


        // Создаем ArrayList с элементами 1, 2, 3, 4, 5
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Выводим на экран третий элемент списка (с индексом 2)
        int thirdElement = numbers.get(2);
        System.out.println("Третий элемент списка: " + thirdElement);



      /*
                 Имея `ArrayList` с элементами "Monday", "Tuesday", "Wednesday", замените "Wednesday" на "Sunday".
                 Выведите итоговый список на экран.

                 */

        ArrayList<String> day = new ArrayList<>();
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");

        day.set(2, "Sunday");
        System.out.println(day);





        /*
Создайте `ArrayList` с элементами 4, 1, 3, 5, 2.
Выведите на экран минимальный и максимальный элементы
*/
        numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        int numberMin = numbers.get(0);
        int numberMax = numbers.get(0);
        for (Integer number : numbers) {

            if (number > numberMax) {
                numberMax = number;
            }
            if (number < numberMin) {
                numberMin = number;
            }
        }
        System.out.println("numberMax: " + numberMax + " " + " numberMin: " + numberMin);



        /*
        Создайте ArrayList с именем "names" и
        добавьте в него следующие имена: "Alice", "Bob", "Charlie", "David".
Выведите на экран содержимое списка "names" с использованием цикла for-each.
Добавьте новое имя "Eva" в конец списка "names".
Вставьте имя "Frank" на позицию с индексом 2 в списке "names".
Удалите имя "David" из списка.
Проверьте, существует ли имя "Charlie" в списке "names", и выведите соответствующее сообщение.
Очистите список "names" от всех элементов.
         */


        // Создала ArrayList "names" и добавила имена
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Вывожу содержимое списка с использованием цикла for-each
        System.out.println("Содержимое списка names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Добавила новое именя "Eva" в конец списка
        names.add("Eva");

        // Вставила имея "Frank" на позицию с индексом 2 в список имен
        names.add(2, "Frank");

        // Удалила имя "David" из списка имен
        names.remove("David");

        // Проверяю есть ли имя "Charlie" в списке имен
        if (names.contains("Charlie")) {
            System.out.println("Имя Charlie существует в списке names.");
        } else {
            System.out.println("Имя Charlie не существует в списке names.");
        }
       // System.out.println(names);
       // boolean isName=false;
        //for(int i=0;i<names.size();i++){
           // if(names.get(i).equals("Charlie")){
               // System.out.println("Имя Charlie есть в списке, оно находится под индексом " + i);
                //isName=true;
           // }
        //}
       // if(!isName){
            //System.out.println("Имени Charlie нет в списке!");
      //  }

        // Очищаем список имен от всех элементов
        names.clear();

        // Выводим сообщения о том, что список имен пуст
        System.out.println("Список names очищен. Размер списка: " + names.size());



    }

}

















