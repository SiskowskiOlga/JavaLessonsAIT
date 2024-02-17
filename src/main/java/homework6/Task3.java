package homework6;

import java.util.Scanner;
public class Task3 {
    public  static void main(String[]args){
        /* таблицу умножения

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Введите число:");
        int number = scanner.nextInt();
        for (int i = 1; i<=10; i++){
            int result = i* number;
            System.out.println(i + "*"+ number+"="+result);
        }
//2 вариант
        int numberOne = 1;
        int numberTwo = number;
        while (numberOne<=10){
            int result = numberOne * numberTwo;
            System.out.println(numberOne+"*"+numberTwo+"="+result);
            numberOne++;
        }

        //3 вариант
        numberOne=1;  //обнулили переменную,
        // иначе берет значение с верху задания

        do{
            int result = numberOne*numberTwo;
            System.out.println(numberOne+"*"+numberTwo+"="+result);
            numberOne++;
        }
        while (numberOne<=10);

        }
    }