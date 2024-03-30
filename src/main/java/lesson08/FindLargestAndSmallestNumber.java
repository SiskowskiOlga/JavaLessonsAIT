package lesson08;
import java.util.Scanner;
public class FindLargestAndSmallestNumber {

    /*
    создать программу, которая использует цикл While
    для чтения неопределенного количества чисел с консоли,
    (процесс останавливается когда вводится отрицательное число.)
    программа находит наибольшее и наименьшее число.
     */
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number>0){
            int min = number;
            int max = number;
            while (number>=0){
                if (number> max){
                    max = number;
                } if (number<min){
                    min = number;
                }
                System.out.println("Введите число");
                number = scanner.nextInt();
            }
            System.out.println("Min = "+min);
            System.out.println("Max = "+ max);
        }
        System.out.println("Программа завершена");
        int num;
        int min = 0;
        int max = 0;
        boolean isFirst = true;
        boolean numberPositiv = true;
        do {

            System.out.println("Введите число: ");
            num = scanner.nextInt();
            if (num < 0 ){
                numberPositiv = false;
                break;
            }
            if(isFirst) {
                min = num;
                max = num;
                isFirst =  false;
            }
            if(number > max){
                max = number;
            }
            else if (number < min){
                min = number;
            }
        }
        while (num >= 0 &&  numberPositiv);
        System.out.println("Программа завершена");


    }
}
