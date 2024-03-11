package homework16;

/*
Статистический анализатор.

Реализовать функцию statistics, принимающую переменное количество вещественных чисел (double) и
выводящую на экран базовую статистику: минимальное значение, максимальное значение, среднее значение.
Для расчета используйте Varargs.
Обеспечьте рассмотрение случаев, когда аргументы не передаются (вы приводите сообщение).
Попробуйте добавить в свою программу обработку ошибок, например, проверку отрицательных чисел при расчете статистики.

 */

public class Statistic{
    public static void statistics(double... numbers){
        if (numbers.length == 0){
            System.out.println("Аргументы не переданны.");
            return;
        }
        double min = numbers[0];
        double max = numbers[0];
        double sum = 0;

        for (double num : numbers){
            if (num < 0){
                System.out.println("Ошибка, вы ввели отрицательное число.");
                return;
            }


            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
            sum += num;
        }



        double average = sum / numbers.length;
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);

    }

    public static void main(String[] args) {
        statistics(4.5, 34.5, 98.7);
        statistics(10.4, 59.9);
        statistics(-10.0);
        statistics();
    }
}
