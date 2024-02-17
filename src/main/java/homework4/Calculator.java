package homework4;
import java.util.Scanner;
/*
Написать прошрамму которая запрашивает у пользователя
два числа и выводит их сумму.
 */
public class Calculator {
    public static  void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Введите первое число: ");
        int firstNumber  = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("Сумма чисел: "+sum);
        scanner.close();
    }

}
