package exceptionshandling;
import homework34.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ErrorCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorCalculator.class);

    private static Animal animal = null;

    public static void main(String[] args) {
        //divide(10, 10);
        //badMethod();
        try {
            divideNumbers(10, 0);
        }
        catch (ArithmeticException exception){
            LOGGER.error(exception.getMessage());
        }



    }

    static void badMethod() {
        LOGGER.info("I'm bad method");
        badMethod();
    }
    public static int divideNumbers(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Не дели на ноль !!!!");
            }
            return a / b;
        }

    public static void divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            animal.getEnergy();
        }
        //catch (ArithmeticException | NullPointerException exception){
        catch (ArithmeticException exception) {
            LOGGER.error("Divide by zero");
            LOGGER.error(exception.getLocalizedMessage());
        } catch (NullPointerException exception) {
            LOGGER.error("Animal is null");
            LOGGER.error(exception.getLocalizedMessage());
        } catch (Exception exception) {
            LOGGER.error("An unknown exception occurred");
            LOGGER.error(exception.getLocalizedMessage());
        } finally {
            LOGGER.info("a = {}, b = {} Result: {}", a, b, result);
            LOGGER.info("Divide was finished");
        }


    }

        }


