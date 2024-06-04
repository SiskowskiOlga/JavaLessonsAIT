package homework38;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZoneConversion {
    /*
    Изменение времени с учетом часового пояса
Задача: Создайте объект ZonedDateTime для текущей даты и времени в вашем локальном часовом поясе. Затем измените этот объект, чтобы он отражал время в часовом поясе Токио.
Выведите оба значения времени на консоль.
     */
    public static void main(String[] args) {
        // Создали объект ZonedDateTime для текущей даты и времени в локальном часовом поясе
        ZonedDateTime localDateTime = ZonedDateTime.now();

        // Изменение объекта, чтобы он отражал время в часовом поясе Токио
        ZonedDateTime tokyoDateTime = localDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        // Создание форматтера для красивого вывода
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

        // Вывод обоих значений времени на консоль
        System.out.println("Локальное время: " + localDateTime.format(formatter));
        System.out.println("Время в Токио: " + tokyoDateTime.format(formatter));
    }
}
