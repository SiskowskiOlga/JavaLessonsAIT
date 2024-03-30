package lesson04;

public class FahrenheitToCelsius {
    /*
    Объявите переменную для температуры в градусах Фаренгейта.
    Напишите код для перевода этой температуры в
    градусы Цельсия и вывода результата.
    Сначала следует отнять от температуры, измеренной в Фаренгейта 32,
     а полученное значение умножить на 5,
      после чего разделить его на 9.
      Полученный результат и станет показателем температуры по Цельсию
     */
    public static void main(String[] args) {
        double tempFar = 120;
        double tempCel = ((tempFar - 32) * 5) / 9;
        System.out.println("Far. " + tempFar);
        System.out.println("Cels. " + tempCel);

    }
}
