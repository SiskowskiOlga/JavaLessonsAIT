package homework7;

import java.util.Scanner;

public class Calculator {
    /*
    Калькулятор операций
Цель: Разработать программу на Java, которая использует циклы и условные операторы для выполнения арифметических операций с вводимыми пользователем числами.
Программа должна предложить пользователю выбрать операцию (сложение, вычитание, умножение, деление) и ввести два числа, с которыми будет проведена операция.
После вывода результата программа должна спросить пользователя, хочет ли он продолжить выполнение операций.
Если пользователь отвечает утвердительно, программа должна снова предложить выбрать операцию и ввести числа.

Часть 1: Ввод данных
Запросить у пользователя выбор операции.
Запросить у пользователя ввод двух чисел.
Часть 2: Выполнение операции
Использовать условные операторы (if, else if, else) для определения выбранной операции.
Выполнить выбранную арифметическую операцию с введенными числами.
Вывести результат операции.
Часть 3: Цикл выполнения
Использовать цикл (while или do-while), чтобы повторять выполнение операций, пока пользователь не решит выйти.
После вывода результата спросить пользователя, хочет ли он продолжить выполнение операций.
Если пользователь отвечает утвердительно, повторить процесс. Если отрицательно — завершить программу.
Дополнительное условие
Убедитесь, что программа обрабатывает деление на ноль, выводя сообщение об ошибке и предлагая пользователю повторить ввод чисел для операции.
Давайте создадим более сложное задание, которое будет включать работу с циклами и условными операторами в Java,
углубляя понимание этих конструкций и требуя от студентов более сложного решения без использования массивов.




     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 0;
        do {
            System.out.println("Выберите операцию: 1. Сложение, 2. Вычетание, 3. Умножение, 4. Деление");
            int operation = scanner.nextInt();
            System.out.println("Введите два числа для произведения операции: ");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            double result = 0;


            if (operation == 1) {
                result = number1 + number2;
            } else if (operation == 2) {
                result = number1 - number2;

            } else if (operation == 3) {
                result = number1 * number2;
            } else if (operation == 4) {
                if (number2 != 0) { //делить в математике на 0 нельзя
                    result = number1 / number2;
                } else {
                   System.out.println("Ошибка! деление на ноль недопустимо");
                    continue; //перезапуск
                }

            } else {
                System.out.println("Ошибка: неверная операция.");
                continue;
            }
            System.out.println(" Результат: " + result);
            System.out.println("Хотите продолжить выполнение операций? (1. Да / 2. Нет)");
            choice = scanner.next().charAt(0);
        } while (choice  == '1') ;
        scanner.close();
    }
}