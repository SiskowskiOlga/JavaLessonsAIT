package homework6;

import java.util.Scanner;

public class Task2 {
    //пользователь вводит число. посчитать сумму всех его цифр.
    // например число 1234 результат будет 10
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (; num > 0; num /= 10) {
            System.out.println("num = " + num);
            System.out.println("sum = " + sum);
            System.out.println("------");
            sum += num % 10;
        }

        //2 вариант

        System.out.println("Введите число");
        int inputNumber = scanner.nextInt();
        sum=0;
        int numberLength = String.valueOf(inputNumber).length();
        for (int i=numberLength-1; i>=0; i--){
            int digit = inputNumber/(int) Math.pow(10,i)%10;
            System.out.println(" ="+sum);



            System.out.println("Введите число");
            inputNumber=scanner.nextInt();
            String numberString = String.valueOf(inputNumber);
            int result=0;
            for (i = 0; i<numberString.length(); i++){
                String digitString = String.valueOf(numberString.charAt(i));
                int digitInt = Integer.valueOf(digitString);
                result = result + digitInt;
            }
            System.out.println(result);
        }
    }
}
