package homework38;
import java.time.LocalDate;
import java.time.Month;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Birthday {
    private static final Logger LOGGER = LoggerFactory.getLogger(Birthday.class);
    /* Создание дат:
    Напишите программу, которая создает объект LocalDate для сегодняшней даты,
    а затем создает другой объект LocalDate для даты вашего следующего дня рождения.
    Выведите обе даты на консоль.
     */
    public static void main(String[] args) {
        // Создали объект LocalDate для сегодняшней даты
        LocalDate today = LocalDate.now();

        // день и месяц рождения
        int birthDay = 23; // День рождения
        Month birthMonth = Month.OCTOBER; // Месяц рождения

        // Создали объект LocalDate для следующего дня рождения
        LocalDate nextBirthday = LocalDate.of(today.getYear(), birthMonth, birthDay);

        // Если день рождения в этом году уже прошел или сегодня, добавляем 1 год
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        // Вывод обеих дат на консоль
        System.out.println("Сегодняшняя дата: " + today);
        System.out.println("Следующий день рождения: " + nextBirthday);

        System.out.println("-------Вариант с учителем------------");
        LocalDate localDateNow = LocalDate.now();
        LOGGER.info("Date now: " + localDateNow);
        LocalDate localDateOfMyNextBitrhday = LocalDate.of(2024, 10, 23);
        LOGGER.info("Date of my next BirthDay: " + localDateOfMyNextBitrhday);
    }
    }

