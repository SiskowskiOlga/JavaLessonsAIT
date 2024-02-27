package lesson10;

public class Factorial {
    public static int getFactorial(int number){
        if (number == 1){
            return  1;
        }else{
            return  number * getFactorial(number - 1);
    }
}
    }
