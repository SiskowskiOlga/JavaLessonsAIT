package mytest;
/* написать программу которая принимает числа в качестве входных данных и
выводит свою таблицу умножения до 10*/


import java.util.Scanner; //импортируем java.until.Scanner

public class MyTest01 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Input a number: ");
        int num1=in.nextInt();
        for (int i=0; i<10; i++){
            System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));
        }
    }
}



