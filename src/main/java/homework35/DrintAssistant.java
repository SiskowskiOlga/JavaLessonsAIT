package homework35;
import exceptionshandling.ErrorCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DrintAssistant {
    /*
    Вам нужно создать программу, которая будет симулировать процесс приготовления напитков. В программе будет массив с названиями доступных напитков. Пользователь вводит номер напитка, который он хочет приготовить. Ваша задача — обработать возможные исключения, которые могут возникнуть при неправильном вводе данных.

Задачи
Создайте массив с названиями напитков (например, "Кофе", "Чай", "Сок").
Запросите у пользователя ввод номера напитка, который он хочет приготовить.
Используйте блок try-catch, чтобы обработать следующие возможные исключения:
Ввод нецелого числа (NumberFormatException).
Ввод номера, который выходит за пределы массива (ArrayIndexOutOfBoundsException).
Если введен корректный номер, выведите сообщение о том, что напиток готовится.
Используйте блок finally, чтобы вывести сообщение о завершении программы независимо от результата.
Ожидаемый результат
При вводе корректного номера: сообщение о приготовлении выбранного напитка.
При вводе некорректного номера или нецелого числа: соответствующее сообщение об ошибке.
В любом случае сообщение о завершении программы в блоке finally.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DrintAssistant.class);


    private static String [] drinks = {"Кофе", "Чай", "Сок"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте номер напитка 1-кофе, 2-чай, 3-сок");
        int drinkNumber = 0;
        try {
            drinkNumber = Integer.parseInt(scanner.nextLine());
            String drink = drinks[drinkNumber-1];
            LOGGER.info("Пользователь выбрал напиток {}. Напиток готовится.", drink);
        }
        catch (NumberFormatException exception){
            LOGGER.error("Неверный формат ввода напитка. Exception: {} ", exception.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException exception){
            LOGGER.error("Выход за пределы массива, неправильный номер напитка напитка. Exception: {} ", exception.getMessage());
        }
        finally {
            LOGGER.info("Завершение работы программы");
            scanner.close();
        }

    }

}
