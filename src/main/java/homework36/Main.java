package homework36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import exceptions.InvalidStringLengthException;
import java.io.IOException;
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    //1 вариант
    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        StringValidator stringValidator = new StringValidator();
        ExceptionPropagation exceptionPropagation = new homework36.ExceptionPropagation();

        try {
            numberChecker.checkNumber("123");// для 1 варианта код

            //вторая задача
            stringValidator.validateStringLength("123456");
                    //выдает красным, проверяемое исключение, пишем catch
//третья задача
            exceptionPropagation.method1();

        } catch (NumberFormatException exception) {
            LOGGER.error(exception.getMessage());//вписали исключение ошибки
/*
у нас общий catch тогда мы можем обьединить этот код
 public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        try {
            numberChecker.checkNumber("123");
            numberChecker.checkerNumber2("44567");
        }
        catch (NumberFormatException exception) {
            LOGGER.error(exception.getMessage());
 */
        }
        //2 вариант
        //try {//исключение непроверяемое, обязанность его обрабатывать нет
            //numberChecker.checkNumber2("44567");
        //} catch (NumberFormatException exception) {
            //LOGGER.error(exception.getMessage());
        //}

        /*
        можно логгеры обьединять если они одинаковые
        catch (NumberFormatException | IOException | InvalidStringLengthException exception){
            LOGGER.error(exception.getMessage());

         */

        //вторая задача
        catch (InvalidStringLengthException exception){
            LOGGER.error(exception.getMessage());

        }
        //третья задача
        catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }
        finally {
            LOGGER.info("End of program");
        }
    }
}

