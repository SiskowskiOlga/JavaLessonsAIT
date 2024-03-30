package lesson03;

public class Variables {
    //-128 bis 127    1bait
    static byte age;

    //-32768 bis 32767    2bait
    static short price = 1000;

    //-2147483648 bis 2147483647   4bait
    static int number = 500;

    //-9223372036854775808 bis 922337203685477807   8bait
    static long bigNumberPeople = 34344323465433L;

    //дробные числа с плавающей точкой
    static  float euroPreis = 0.85f;
    static double dollarPreis = 0.885;

    //символы
    static  char charLetter = 'A';

    //логические да/нет
    static  boolean result;

    //текст
    static String text = "Hello Java";

    public static void main(String[]args){
        age = 27;
        System.out.println("Возраст "+ true + age);
        System.out.println(number + number);
        System.out.println(number - number);
        System.out.println(number * 2);
        System.out.println(number / 2);
        System.out.println(number);
    }



}
