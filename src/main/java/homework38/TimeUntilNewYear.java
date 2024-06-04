package homework38;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeUntilNewYear {
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
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
    }
}
