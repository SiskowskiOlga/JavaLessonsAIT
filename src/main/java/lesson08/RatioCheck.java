package lesson08;
import java.util.Scanner;
public class RatioCheck {

    //пока не напишем 0 программа не начнет считать сумму

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            sum += n;
            n = scanner.nextInt();
        }
        System.out.println("ответ : " + sum);


 /*
    Пользователь вводит число. Программа должна проанализировать это число на четность,
    на целостность числа, на парность, на знак или это цифра.
     */
        double number = scanner.nextDouble();

        System.out.println(number % 2 == 0 ? "Четное" : "Нечетное");
        System.out.println(number % 1 == 0 ? "Целое" : "Нецелое");

        System.out.println(number > 0 ? "Положительное" : (number < 0 ? "Отрицательное" : "Ноль"));

        System.out.println(number % 1 == 0 && number >= 0 && number <= 9 ? "Цифра" : "Число");


        //это простой вариант
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
