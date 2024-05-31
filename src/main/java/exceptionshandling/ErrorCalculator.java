package exceptionshandling;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ErrorCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorCalculator.class);
    private static homework34.Animal animal = null;

    public static void main(String[] args) {
        divide(10, 0);

    }

    //предотвращаем исключения ошибок
    public static void divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            animal.getEnergy();

        } catch (ArithmeticException exception) {//ждем это исключение, деление на 0 нельзя
            LOGGER.error("Divide by zero"); //мы можем прописать индивид. код действия
            LOGGER.error(exception.getLocalizedMessage());

//catch (ArithmeticException | NullPointerException exception){
            //два вида ошибок обрабатываем в одном блоке  catch
            // если реакция на ошибка одинаковые
        } catch (NullPointerException exception) {//Попытка получить от пустого/несуществ. животного
            LOGGER.error("Animal is null");//Мы можем прописать индив. дальнейшее действие код
            LOGGER.error(exception.getLocalizedMessage());
        } catch (Exception exception) {//улавливаем все ошибки
            LOGGER.error("An unknown exception occurred");//здесь мы не знаем где была ошибка
            LOGGER.error(exception.getLocalizedMessage());
        } finally {//код будет выполнен в любом случае, через или без ошибки
            LOGGER.info("a - {}, b - {} Result: {}", a, b, result);
            LOGGER.info("Divide was finished");
        }
    }
}
