package homework5;

import java.util.Scanner;
/*
написать программу которая запросит ввести ваш возраст
и определит к какой возрастной категории вы относитесь
 */

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам полных лет?");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Ошибка!!! Пожалуйста введите сколько вам полных лет: ");
        }
        if (age >= 0 && age <= 3) {
            System.out.println("Вы относитесь к возрастной категории: раниий детский возраст");
        } else if (age > 3 && age <= 7) {
            System.out.println("Вы относитесь к возрастной категории: дошкольный возраст");
        } else if (age > 7 && age <= 11) {
            System.out.println("Вы относитесь к возрастной категории: младший школьный возраст");
        } else if (age > 11 && age <= 18) {
            System.out.println("Вы относитесь к возрастной категории: подрасковый возраст");
        } else if (age > 18 && age <= 25) {
            System.out.println("Вы относитесь к возрастной категории: молодёжный возраст");
        } else if (age > 25 && age <= 60) {
            System.out.println("Вы относитесь к возрастной категории: взрослый возраст");
        } else if (age > 65) {
            System.out.println("Вы относитесь к возрастной категории: пожилой возраст");

        }
    }
}
