package homework4;
import java.util.Scanner;
public class AverageScoreCalculate {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу оценку по первому предмету: ");
        double number1 = scanner.nextInt();
        System.out.println("Введите вашу оценку по второму предмету: ");
        double number2 = scanner.nextInt();
        System.out.println("Введите вашу оценку по третьему предмету: ");
        double number3 = scanner.nextInt();
        System.out.println("Введите вашу оценкку по четвертому предмету: ");
        double number4 = scanner.nextInt();
        System.out.println("Введите вашу оценку по пятому предмету: ");
        double number5 = scanner.nextInt();
        double average = (number1+number2+number3+number4+number5)/5;
        System.out.println("Средний балл: "+average);
        scanner.close();
    }

}
