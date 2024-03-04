package homework14;
import java.util.Scanner;
public class MyHobby {
    public static void main(String[] args) {
        /*
    Создать массив строк, содержащий список увлечений
    (например, «рисование», «программирование», «велоспорт»).
    Вы делаете все хобби из массива на экране*/

        // создаем массив со списком моих хобби
        String[] hobbys = {"медитация ", "рисование ", "дайвинг ", "программирование ", "путешествие"};
        for (String hobby : hobbys) { //вывод из массива хобби на экран
            System.out.print(hobby);
            System.out.println();
        }





        /*
        Напишите программу, которая ищет в массиве заданные хобби и
        выводит на экран сообщение о том, что оно есть в списке.
         */


        //объявляем поиск конкретного наименования хобби
        String findHobby = "еда";
        //задаем переменную для поиска хобби
        boolean find = false;
        // ищем хобби в нашем массиве
        for (String hobby : hobbys){
            if (hobby.equals(findHobby)){
                find = true;
                break;
            }
        }
        //выводим соответственное сообщение
        if (find) {
            System.out.println("Хобби \"" + findHobby + "\" найдено в списке.");

        }else   {
            System.out.println("хобби \"" + findHobby + "\" не найдено в списке.");
        }

        /*
        Используйте массив хобби (как в задаче 1),
        спросите пользователя: введите номер своего любимого хобби из списка.
        Вы ведете название экрана «Два хобби»*/

        //создаем объект сканер для считывания ввода с экрана
        Scanner scanner = new Scanner(System.in);
        //выводим список хобби с их номером последовательностью
        System.out.println("Пожалуйста, выберите ваше любимое хобби из ниже указанного списка:");
         for (int i = 0; i< hobbys.length; i++){
             System.out.println((i+1)+"."+hobbys[i]);
         }
         //просим пользователя указать номер любимого хобби
         System.out.println("Укажите номер вашего любимого хобби: ");
         int choice = Integer.parseInt(scanner.nextLine());

         //проверка указания правильного нумерования при выборе
        if (choice>=1 && choice <= hobbys.length){

            //выводим выбранное хобби на экпан
            System.out.println("Ваше любимое хобби: "+hobbys[choice-1]);
        }
        else {
            System.out.println("Номер указан не верно");
        }
        //запрашиваем у пользователя ввести названия нового хобби
        System.out.println("Введите пожалуйста наименование вашего нового хобби: ");
        String newHobby = scanner.nextLine();

        //создали новый массив с большим размером памяти
        String[]newHobbys = new String[hobbys.length +1];

        //переносим из имеющего массива элементы в новый массив
        for (int i = 0; i < hobbys.length; i++){
            newHobbys[i] = hobbys[i];
        }
        //добавляем новое хобби в новый массив
        newHobbys[newHobbys.length-1]= newHobby;

        //выводим новый список хобби на экран
         System.out.println("Объявленный список хобби");
         for (String hobby : newHobbys){
             System.out.println(hobby);
         }



         /*
         Создать два массива: один для хобби (как в задаче 1),
         второй для рейтинга каждого хобби (целые числа).
         Напишите программу, которая выводит хобби и их рейтинги в виде списка.
          */

        //создаем второй массив для рейтинга хобби
        int[]rating = {9,7,3,6,5,8,10};

        //выводим список хобби с их рейтингом
        System.out.println("Список хобби и их рейтин:");
        for (int i = 0; i<hobbys.length; i++){
            System.out.println(hobbys[i]+ ":" + rating[i]);
        }


    }

}




