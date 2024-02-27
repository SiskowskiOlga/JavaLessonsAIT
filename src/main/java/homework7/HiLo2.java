package homework7;
import java.util.Scanner;
public class HiLo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gameChoce;
        do {
            int randomNumber = (int) (Math.random() * 100) + 1;
            //код генерации случайного числа
            int attempts = 0;
            int maxAttemps = 10; // урегулируем возможн. попыток

            System.out.println("Угодайте число от 1 до 100. У вас есть "
                    + maxAttemps + " попыток.");
            while (true) {
                System.out.println("Введите ваш вариант числа(1-100)");
                while (!scanner.hasNextInt()) {
                    //hasNextInt блокирует scanner.next(); если он вводит неправильное значение
                    System.out.println("Ошибка,введите число");
                    scanner.next();
                }
                int number = scanner.nextInt();
                if (number < 1 || number > 100) {
                System.out.println("Число должно быть в диапозоне 1.100");
                continue; // возврат
            }
            attempts++;
            if (number > randomNumber) {
                System.out.println(" Число слишком велико");
            } else if (number < randomNumber) {
                System.out.println("Число слишом маленькое");
            } else {
                System.out.println("Победа! Вы угодали " + randomNumber);
                break;
            }
            if (attempts >= maxAttemps) {
                System.out.println("Вы использовали все попытки. Игра закончена");
            }
        }
        System.out.println("Хотите еще раз поиграть?(y/n");
        gameChoce = scanner.next().toLowerCase().charAt(0);
    } while(gameChoce =='y');
    System.out.println("Конец игры! Спасибо за игру");
    scanner.close();

}

}

/*
Variant
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continueTheOperation;
        int guessNumber;
        String inputNumberStr = "";
        int inputNumber;
        boolean isFirst = true;
        boolean isContinue = true;
        boolean numberIsGuessed = false;
        boolean isDigit = true;
        boolean isMaxAttempts = false;
        char[] charDigit;
        int numberOfAttempts = 0;
        char maxAttemptsInput;
        int maxAttempts = 0;

        while (isContinue) {
            do {
                System.out.println("Выберите уровень сложности: ");
                System.out.println("1 - Easy : количество попыток = 30");
                System.out.println("2 - Middle : количество попыток = 20");
                System.out.println("3 - Hard : количество попыток = 10");
                System.out.println("4 - Monster : количество попыток = 5");
                maxAttemptsInput = scanner.next().charAt(0);

                switch (maxAttemptsInput) {
                    case '1':
                        maxAttempts = 30;
                        break;
                    case '2':
                        maxAttempts = 20;
                        break;
                    case '3':
                        maxAttempts = 10;
                        break;
                    case '4':
                        maxAttempts = 5;
                        break;
                    default:
                        System.out.println("Вы ввели чтото не то");
                        break;
                }
            } while (maxAttempts == 0);
            guessNumber = (int) ((Math.random() * (100) + 1));
            System.out.println(guessNumber);
            while (!numberIsGuessed && !isMaxAttempts) {
                isFirst = true;
                do {
                    if (isFirst) {

                        isFirst = false;


                    } else {
                        if (!isDigit) {
                            System.out.println("Вы ввели чтото не то! " + "Не надо так!😿");

                        } else {
                            System.out.println("Попробуйте еще раз");
                        }
                        isDigit = true;
                    }
                    System.out.print("Введите число от 1 до 100: ");
                    inputNumberStr = scanner.next().strip();
                    if (inputNumberStr.isEmpty()) {
                        isDigit = false;

                    } else {
                        charDigit = inputNumberStr.toCharArray();
                        for (int i = 0; i < inputNumberStr.length(); i++) {
                            if (!Character.isDigit(charDigit[i])) {
                                isDigit = false;
                            }
                        }
                    }
                } while (!isDigit);
                inputNumber = Integer.parseInt(inputNumberStr);

                numberOfAttempts++;
                if (inputNumber == guessNumber) {
                    System.out.print("Вы угодали число! " + "⭐😏");
                    System.out.println("\uD83D\uDE38");
                    System.out.println("Количество попыток: " + numberOfAttempts);
                    numberOfAttempts = 0;
                    numberIsGuessed = true;
                } else {
                    if (maxAttempts == numberOfAttempts) {
                        isMaxAttempts = true;
                        System.out.println("Вы использовали максимальное количество попыток: " + numberOfAttempts);
                        System.out.println("Вы проиграли!");
                        System.out.println("😢");
                    } else if (inputNumber == 0 || inputNumber > 100) {
                        System.out.println("Вы ввели число > 100 или 0");
                        numberOfAttempts--;
                    } else if (inputNumber < guessNumber) {
                        System.out.println("Слишком маленькое число!");
                    } else {
                        System.out.println("Слишком большое число!");

                    }
                }
            }
            isFirst = true;
            do {
                if (isFirst) {

                    System.out.println("Хотите сыграть еще раз? y/n");
                    isFirst=false;


                } else {
                    System.out.println("Вы ввели чтото не то");
                    System.out.println("Надо ввести \"y\" если хотите сыграть еще раз и ");
                    System.out.println("\"n\" если хотите выйти из игры!");
                }
                continueTheOperation = scanner.next().charAt(0);
            } while (!(continueTheOperation == 'y' || continueTheOperation == 'n'));
            if (continueTheOperation == 'n') {
                isContinue = false;
            } else {
                numberIsGuessed = false;
            }

        }

    scanner.close();
    }
}
 */
