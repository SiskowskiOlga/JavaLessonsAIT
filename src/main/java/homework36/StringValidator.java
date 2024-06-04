package homework36;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class StringValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringValidator.class);
   /*
Задание: Создание и выбрасывание собственного исключения
Описание
Напишите метод, который проверяет длину строки и выбрасывает собственное исключение, если длина строки меньше 5 символов.

Задачи
Создайте класс InvalidStringLengthException, расширяющий Exception.
Создайте класс StringValidator.
Напишите метод validateStringLength, который принимает строку и выбрасывает InvalidStringLengthException, если длина строки меньше 5 символов.
В методе main вызовите validateStringLength и обработайте исключение с помощью блока try-catch.
Ожидаемый результат
При вводе корректного номера: сообщение о приготовлении выбранного напитка.
При вводе некорректного номера или нецелого числа: соответствующее сообщение об ошибке.
В любом случае сообщение о завершении программы в блоке finally.
    */
    public void validateStringLength(String stringToValidate)throws exceptions.InvalidStringLengthException {
        LOGGER.info("Validating string length " + stringToValidate);
        //логгируем что входит сюда
        if (stringToValidate.length()< 5){
            //указываем на ошибку
            LOGGER.error("Invalid string length");
            //и выбрасываем в throw если длина строки меньше 5 символов
            throw new exceptions.InvalidStringLengthException("String length is less than 5");
//если не выбросить throws на верх, то будет красным ошибка, так как это проверяемое исключение
        }
        else {//можно без слова else
            LOGGER.info("String length is greater than 5 = " + stringToValidate.length());


        }
    }
}
