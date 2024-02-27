package homework7;

import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) { //автоматически созданная заглушка метода

        Scanner scan = new Scanner(System.in);
        // обьект scan класса Scanner получает данные с клавы с помощью объекта System.in
        //но она еще не запрашивает число у пользователя
        String playAgain = ""; // переменная для повтора игры
        do {
            /*
                цикл do-while позволяет повторить играть игру еще раз, после того как пользователь угадал число,
                 программа спрашивает хочет еще раз поиграть или нет.
                 */

            int randomNumber = (int) (Math.random() * 100 + 1); //генерация случайных чисел, угадывает пользователь.
        /*
         созд. переменную = Math.random => присвоили значение для генерации случ. номера.
         переменная  int=> нам нужно целое число, без дроби.
         умножаем на 100=> чтобы диапозон расширился до 100, +1 чтобы попало в диапозон от 1.0 до 100.00
         ; фиксируем конец работы
         */

            //System.out.println(theNumber); // выводит сгенирированное загаданное (theNumber)число на консоле

            int attempts = 0;
            int maaxAttempts = 10; // переменная хранит ответы пользователя

            while (attempts != maaxAttempts) {
                // пока значение переменной guess не равно != значению переменной theNumber:
                // цикл повторяет команды написанные сразу же после этой строки кода

            /*
        создаем цикл=> пользователь сможет произвести несколько попыток /угадок.
        While повторяет набор команд пока выполняется заданная условие.
        пишится перед тремя последними строками фигурными скобками кода
        Условие - угодал или нет число?
        выполняет запрос число до тех пор пока переменная guess не будет равна переменной theNumber
         */


                System.out.println("Угодайте число от 1 до 100. У вас "+ maaxAttempts+" попыток");

                attempts = scan.nextInt(); // примет переменную и сохранит значение
                //System.out.println(" Вы ввели число: "+ guess+".");

        /*
        создаем инструкцию =>if проверки чисел: больше, меньше и результат поверки выводим на консоль
        Инструкция if=> проверяет и решает сколько раз запускать блок команд на основе условия.
         */
                if (attempts < maaxAttempts)
                    System.out.println(attempts + " это число меньше угадываемого числа. Попробуйте еще раз.");

            /*
            инструкция else-if=> даёт возможность выбора в противном случае.
             */
                else if (attempts > maaxAttempts)
                    System.out.println(attempts + " это число больше угадываемого числа. Попробуйте еще раз.");
                 else
                    System.out.println(attempts + '!' + " Поздравляю! Вы угодали число!");
                }
                System.out.println("Хотите еще раз поиграть в игру? (да /нет)");
                playAgain = scan.next();



        } while (playAgain.equalsIgnoreCase("да"));
        System.out.println("Спасибо за игру! До свидания! ");
        scan.close();

        /*
        почему попытки не обнуляются? когда игра начинается заново? подумать....
         */

    }
}