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

/*
variant 2
import java.util.Scanner;

public class AmountCalc {
    //Калькулятор Суммы: Напишите программу, которая запрашивает у пользователя два числа и выводит их сумму.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите 2 числа");
        System.out.print("Первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("Второе число: ");
        double num2 = scan.nextDouble();
        scan.close();
        double sum = num1+num2;
        System.out.println("Сумма двух чисел " + num1 + " + " + num2 + " = " + sum);
    }

}

Variant
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        //Пользователь вводит число. Посчитать сумму всех его цифр
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber= scanner.nextInt();
        int sum =0;
        int numberLength = String.valueOf(inputNumber).length();
        for(int i=numberLength-1; i>=0;i--){
            int digit = inputNumber/(int)Math.pow(10,i) % 10;
            System.out.print(digit);
            if(i!=0){
                System.out.print(" + ");
            }
            sum+=digit;
        }
        System.out.println(" = " + sum);
     char ch = scanner.next().charAt(0);



    }
}
 */
