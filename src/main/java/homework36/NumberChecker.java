package homework36;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class NumberChecker {
    /*
    Задание: Выбрасывание непроверяемого исключения при некорректном входном значении
Описание
Напишите метод, который проверяет, является ли строка числом, и выбрасывает NumberFormatException,
если строка не может быть преобразована в число.

Задачи
Создайте класс NumberChecker.
Напишите метод checkNumber, который принимает строку и выбрасывает NumberFormatException,
если строка не является числом.
В методе main вызовите checkNumber и обработайте исключение с помощью блока try-catch.
     */
    private static final Logger LOGGER =LoggerFactory.getLogger(NumberChecker.class);

    //1 вариант:
public void checkNumber(String numberToCheck) {
    LOGGER.info("Checking number: " + numberToCheck);// получаем число которое проверяем
    try {
        int result = Integer.parseInt(numberToCheck);//так ка отсюда мы можем улететь в
        //NumberFormatException, эту часть мы оборачиваем в catch блок
        //вылавливаем сохраняя и логируем ошибку и выдаем с указанием
    LOGGER.info("Result of checking number: " + result);
    }
    catch (NumberFormatException exception) {
        LOGGER.error(exception.getMessage());
        throw new NumberFormatException("Invalid number: " + numberToCheck);
    }
}
    //2 вариант
    public void checkNumber2(String numberToCheck) throws NumberFormatException {
    //мы можем в throws несколько форматов исключения ошибок вписать через запятую.
        // Все exception которые могут прилететь. Но в методе main он эти другие исключения не увидит,
        // так как там мы прописали только один вариант в catch, тогда нам надо написать на все варианты в main catch.
        LOGGER.info("Checking number: " + numberToCheck);// получаем число, которое проверяем
        int result = Integer.parseInt(numberToCheck);//так ка отсюда мы можем улететь в
        //NumberFormatException, эту часть мы передаем в throws
        //(заранее предупреждаем что в случае этой ошибки, действуем так), вылавливаем сохраняя и логируем ошибку и выдаем с указанием
        LOGGER.info("Checking result: " + result);
    }




}

