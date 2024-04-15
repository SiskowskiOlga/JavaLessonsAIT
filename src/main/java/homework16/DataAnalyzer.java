package homework16;

import java.util.Arrays;

public class DataAnalyzer {


    /*
    Создание функции суммирования
    создайте функцию sum,
    которая принимает переменное количество целочисленных аргументов и возвращает их целостность.
    Продемонстрируйте работу функции, передав ей различное количество аргументов.
    Добавить в свою программу обработку ошибок, например, проверку отрицательных чисел при суммировании.
     */
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num < 0){
                System.out.println("Ошибка, вы ввели отрицательное число.");
                return 0;//в случае ошибки возврат 0
            }
            sum += num;
        }
        return sum;

    }
    public static void main(String[] args) {
        sum(10,30);
        //примеры использования функций
        System.out.println("Сумма чисел: " + sum(10, 65, 3, 49, 5));
        System.out.println("Сумма чисел: " + sum(11, 94, 30));
        System.out.println("Сумма чисел c ошибкой: " + sum(1, -21, 34,-4));


    }

}
