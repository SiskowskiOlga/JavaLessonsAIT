package homework38;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeUntilNewYear {
    private static final Logger LOGGER = LoggerFactory.getLogger( TimeUntilNewYear.class);
    /*
    Вычисление времени до нового года
Задача: Напишите программу, которая вычисляет, сколько дней,
часов и минут осталось до следующего Нового Года от текущей даты и времени.
     */
    public static void main(String[] args) {
        // Создали объект LocalDateTime для текущей даты и времени
        LocalDateTime now = LocalDateTime.now();

        // Создали объект LocalDateTime для следующего Нового Года
        LocalDateTime nextNewYear = LocalDateTime.of(now.getYear() + 1, 1, 1, 0, 0);

        // Вычисление разницы между текущей датой и временем и следующим Новым Годом
        Duration duration = Duration.between(now, nextNewYear);

        // Получение оставшихся дней, часов и минут
        long days = duration.toDays();
        long hours = duration.minusDays(days).toHours();
        long minutes = duration.minusDays(days).minusHours(hours).toMinutes();

        // Вывод результата на консоль
        System.out.println("До следующего Нового Года осталось:");
        System.out.println(days + " дней," + hours + " часов, "+ minutes + " минут.");



        System.out.println("------Вариант с учителем------------");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeNewYear = LocalDateTime.of(2025, 1, 1, 0, 0);
        long daysUntilTheNewYear = localDateTimeNow.until(localDateTimeNewYear, ChronoUnit.DAYS);
        LOGGER.info("Days left until the new year: " + daysUntilTheNewYear);


    }
}
