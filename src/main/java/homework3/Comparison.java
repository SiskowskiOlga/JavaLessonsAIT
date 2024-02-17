package homework3;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Напишите программу, которая оценивает результаты теста.
        Пусть результат теста хранится в переменной score.
        Если score больше или равно 90, выведите "Отлично",
        если score между 70 и 89 – выведите "Хорошо",
        если между 50 и 69 – "Удовлетворительно",
        и "Неудовлетворительно" во всех остальных случаях.
         */
        System.out.println("Введите результат теста: ");
        int score = scanner.nextInt();
        if (score>=90){
            System.out.println("Отлично");
        } else if (score>=70 && score<=89) {
            System.out.println("Хорошо");
        } else if (score>=50 && score<=69) {
            System.out.println("Удовлетворительно");
        }else {
            System.out.println("Неудовлетворительно");
        }
    }
}







/*
        Напишите программу, которая проверяет, соответствует ли введенный возраст условиям для получения водительских прав. В разных странах возраст, когда можно начать учиться водить машину, может отличаться. Пусть в вашей программе минимальный возраст будет 16 лет, а максимальный – 75 лет.
        Программа должна выводить true, если возраст соответствует условиям, и false – если нет.


        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        boolean isAgeAppropriate = (age >= 16) && (age <= 75);
        System.out.println(isAgeAppropriate);
    }
}
*/








        /*
        Даны три целых числа x, y и z. Напишите программу, которая проверяет, лежит ли y между x и z.
        Ваша программа должна выводить true, если y находится между x и z, и false в противном случае.

        int x = 3;
        int y = 8;
        int z = 9;
        boolean result;
        if (y > x && y < z) {
            result = true;
            System.out.println(true);
        } else {
            System.out.println("false");
        }
        */










        /*
        *Напишите программу, которая сравнивает два введенных числа a и b. Программа должна выводить:

"a больше b", если a > b
"a меньше b", если a < b
"a равно b", если a и b равны

        System.out.println("Введите число a: ");
        int a = scanner.nextInt();

        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("a меньше b");

        } else {
            System.out.println("a равно b ");
       }
       }
        }
         */






