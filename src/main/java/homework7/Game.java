package homework7;

import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = String.valueOf(0);

            int secretNumber = random.nextInt(100)+1; // загадываем число
            int attempts = 0;
            int guess = 0;
            System.out.println("Добро пожаловать в игру угодай число!");
            System.out.println("Угодайте число от 1 до 100.");
            while (guess!=secretNumber){
                System.out.println("Напишите ваш вариант числа: ");
                guess = scanner.nextInt();
                attempts++;
                if (guess > secretNumber) {
                    System.out.println("Число превышает угаданного числа ");

                } else if (guess < secretNumber) {
                    System.out.println("Число меньше чем угадываемое число ");

                } else {
                    System.out.println("Поздравляю!" + secretNumber + "за" + attempts + "попыток");
                }
                while (guess != secretNumber) ;
                System.out.println("хотите сыграть еще раз? (1. да, 2. нет)");
                playAgain = scanner.next();
            }while (playAgain.equalsIgnoreCase("yes"));
            System.out.println("спасибо за игру ");
            scanner.close();
        }
        public  static int generateSecretNumber(){
        return (int) (Math.random()*100)+1;
        }

        }

        //validInput = false;
//
//while (!validInput) {
//
//    System.out.println("Введите целое число от 0 до 100: ");
//    if (scanner.hasNextInt()) {
//        number = scanner.nextInt();
//        validInput = true;
//    } else {
//        System.out.println("Ошибка: Введено не верное значение.");
//        scanner.next();
//    }
//
//}// Закрытие контроля ввода 1