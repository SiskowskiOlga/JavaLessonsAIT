package homework6;
import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        //пользователь вводит число, посчитать сумму всех
        //натуральных чисел которые идут до него включительно

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int res = 0;
        while (num>=1){
            res = res+num;
            num--;
        }
        System.out.println("Сумма всех натуральных чисел "+ res);

    //2  вариант
    System.out.println("Введите число: ");
    int sum = 0;
    int n = scanner.nextInt();
    for(int i = 1; i<=n; i++){
        sum+= i;
    }
    System.out.println(sum);

    //3 вариант

    int number;
    sum=0;
    res = 0;
    System.out.println("Введите число");
    number= scanner.nextInt();
    while (number!=0){
        sum=number;
        System.out.println("sum "+ sum);
        number--;
        System.out.println("number "+ number);
        res+=sum;
        System.out.println("res "+res);
    }
    System.out.println("ответ: "+res);


}

    }

