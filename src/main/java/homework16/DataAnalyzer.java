package homework16;
import java.util.Arrays;
public class DataAnalyzer {


    /*
    Создание функции суммирования
    создайте функцию sum,
    которая принимает переменное количество целочисленных аргументов и возвращает их целостность.
    Продемонстрируйте работу функции, передав ей различное количество аргументов.
     */
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;

    }

    /*
    Статистический Анализатор.

Реализовать функцию statistics,
принимающую переменное количество вещественных чисел (double) и выводящую на экран базовую статистику: минимальное значение, максимальное значение, среднее значение.
Для расчета используйте Varargs.
Обеспечьте рассмотрение случаев, когда аргументы не передаются (вы приводите сообщение).
 Попробуйте добавить в свою программу обработку ошибок,
 например, проверку отрицательных чисел при суммировании или при расчете статистики.

     */
    public static void statistics(double... numbers){
        if (numbers.length == 0){
            System.out.println("No numbers provided.");
            return;
        }
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        for (double num : numbers){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;

            }
            sum += num;
        }
        double average = sum / numbers.length;

        System.out.println("Minimal: " + min);
        System.out.println("Maximal: " + max);
        System.out.println("Average: " + average);
    }
    public static void main(String[]args){
        //примеры использования функций
        System.out.println("Sum of 1, 2, 3, 4, 5: " + sum(1,2,3,4,5));
        System.out.println("Sum of 10, 20, 30: " + sum(10, 20, 30));

        System.out.println("\nStatistics:");
        statistics(1.5, 2.7, 3.9, 4.1, 5.3);
        statistics(); //тестирование обработки случая без аргументов
    }

}
