package homework38;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DateTimeFormatting {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateTimeFormatting.class);
    /*
    Форматирование даты и времени
Задача: Создайте объект LocalDateTime для "2024-12-31T23:59".
Используйте класс DateTimeFormatter для форматирования этой даты и времени в формате "dd/MM/yyyy HH:mm:ss".
Выведите отформатированную строку на консоль.
     */
    public static void main(String[] args) {
        // Создали объект LocalDateTime для "2024-12-31T23:59"
        LocalDateTime dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);

        // Создали объект DateTimeFormatter для форматирования в "dd/MM/yyyy HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Форматирование LocalDateTime в строку
        String formattedDateTime = dateTime.format(formatter);

        // Вывод отформатированной строки на консоль
        System.out.println("Отформатированная дата и время: " + formattedDateTime);


        System.out.println("------Вариант с учителем------------");
        java.time.LocalTime localTimeMorning = java.time.LocalTime.of(7, 30);
        java.time.LocalTime localTimeEvening = java.time.LocalTime.of(20, 45);
        if (localTimeMorning.isBefore(localTimeEvening)) {
            LOGGER.info("Утро раньше вечера");
        }
        if (localTimeEvening.isAfter(localTimeMorning)) {
            LOGGER.info("Вечер позже утра");
        }
    }
}
