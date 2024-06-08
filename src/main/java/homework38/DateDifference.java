package homework38;
import homework38.Birthday;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DateDifference {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateDifference.class);
    /*Разница между двумя датами
    Используя класс Period, рассчитайте разницу в днях, месяцах и годах между текущей датой и датой вашего последнего дня рождения.
    Выведите эту информацию на консоль.
     */
    public static void main(String[] args) {
        // Создали объект LocalDate для сегодняшней даты
        LocalDate today = LocalDate.now();

        // день и месяц рождения
        int birthDay = 23; // День рождения
        Month birthMonth = Month.OCTOBER; // Месяц рождения

        // Создали объект LocalDate для последнего дня рождения
        LocalDate lastBirthday = LocalDate.of(today.getYear(), birthMonth, birthDay);

        // Если день рождения в этом году еще не наступил, отнимаем 1 год
        if (lastBirthday.isAfter(today)) {
            lastBirthday = lastBirthday.minusYears(1);
        }

        // Расчет разницы с помощью класса Period
        Period period = Period.between(lastBirthday, today);

        // Вывод разницы на консоль
        System.out.println("Разница между сегодняшней датой и вашим последним днем рождения:");
        System.out.println("Годы: " + period.getYears());
        System.out.println("Месяцы: " + period.getMonths());
        System.out.println("Дни: " + period.getDays());


        System.out.println("-------Вариант с учителем------------");
        LocalDate lastBirthday2 = LocalDate.of(2023, 10, 23);
        LocalDate today2 = LocalDate.now();
        Period day = Period.between(today, lastBirthday);
        LOGGER.info(day.toString() + " Only Days below last birthday" + day.getDays());
        LOGGER.info("The difference in days between the current date and your last birthday -> {}", day);
        long until = lastBirthday.until(today, java.time.temporal.ChronoUnit.DAYS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} DAYS", until);
        until = lastBirthday.until(today, java.time.temporal.ChronoUnit.MONTHS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} MONTHS", until);
        until = lastBirthday.until(today, java.time.temporal.ChronoUnit.YEARS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} YEARS", until);

    }
}
