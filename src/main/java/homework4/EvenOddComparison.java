package homework4;
import java.util.Scanner;
public class EvenOddComparison {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println("Число: "+number+" является четным.");
        }else {
            System.out.println("Число: "+number+" является не четным.");
        }
        scanner.close();
    }
}
