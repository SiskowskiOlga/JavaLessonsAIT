package lesson10;

public class MetodIsEven {
    public static void main(String[]args){
        boolean result = isEven(13);// меняем значение переменной и получаем ответ
        System.out.println(result);
    }
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
            // return number % 2 == 0 можно и так написать в одну строку код
        }
        else {
            return  false;
        }
    }
}
