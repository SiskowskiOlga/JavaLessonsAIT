package homework38;
import lesson38.JavaTimeTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeApiHomework {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaTimeApiHomework.class);


    public static void main(String[] args) {
        /*
        Напишите программу, которая создает объект LocalDate для сегодняшней даты,
        а затем создает другой объект LocalDate для даты вашего следующего дня рождения.
        Выведите обе даты на консоль.
         */
        System.out.println("-------Task01------------");
        LocalDate localDateNow = LocalDate.now();
        LOGGER.info("Date now: " + localDateNow);
        LocalDate localDateOfMyNextBitrhday = LocalDate.of(2024, 10, 23);
        LOGGER.info("Date of my next BirthDay: " + localDateOfMyNextBitrhday);

        /*
        Создайте два объекта LocalTime: один для времени "07:30" утра, а другой для "08:45" вечера.
         Используйте методы isBefore и isAfter, чтобы определить,
         какое время раньше или позже, и выведите результат на консоль.
         */
        System.out.println("-------Task02------------");
        LocalTime localTimeMorning = LocalTime.of(7, 30);
        LocalTime localTimeEvening = LocalTime.of(20, 45);
        if (localTimeMorning.isBefore(localTimeEvening)) {
            LOGGER.info("Утро раньше вечера");
        }
        if (localTimeEvening.isAfter(localTimeMorning)) {
            LOGGER.info("Вечер позже утра");
        }

        /*
        Используя класс Period, рассчитайте разницу в днях,
        месяцах и годах
        между текущей датой и датой вашего последнего дня рождения. Выведите эту информацию на консоль.
         */
        System.out.println("-------Task03------------");
        LocalDate lastBirthday = LocalDate.of(2023, 8, 22);
        LocalDate today = LocalDate.now();
        Period day = Period.between(today, lastBirthday);
        LOGGER.info(day.toString() + " Only Days below last birthday" + day.getDays());
        LOGGER.info("The difference in days between the current date and your last birthday -> {}", day);
        long until = lastBirthday.until(today, ChronoUnit.DAYS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} DAYS", until);
        until = lastBirthday.until(today, ChronoUnit.MONTHS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} MONTHS", until);
        until = lastBirthday.until(today, ChronoUnit.YEARS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} YEARS", until);

        /*
        Создайте объект LocalDateTime для "2024-12-31T23:59".
        Используйте класс DateTimeFormatter для форматирования этой даты и времени
        в формате "dd/MM/yyyy HH:mm:ss". Выведите отформатированную строку на консоль.
         */
        System.out.println("-------Task04------------");
        LocalDateTime localDateTime1 = LocalDateTime.parse("2024-12-31T23:59");
        LOGGER.info("localDateTime1: " + localDateTime1);
        String formattedLocalDateTime1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(localDateTime1);
        LOGGER.info("formattedLocalDateTime1: " + formattedLocalDateTime1);

        /*
        Напишите программу, которая вычисляет,
        сколько дней, часов и минут осталось до следующего
        Нового Года от текущей даты и времени.
         */
        System.out.println("-------Task05------------");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeNewYear = LocalDateTime.of(2025, 1, 1, 0, 0);
        long daysUntilTheNewYear = localDateTimeNow.until(localDateTimeNewYear, ChronoUnit.DAYS);
        LOGGER.info("Days left until the new year: " + daysUntilTheNewYear);

        /*
        Напишите программу, которая определяет день недели для вашего
         следующего дня рождения. Используйте LocalDate и метод getDayOfWeek().
         Выведите результат на консоль.
         */
        LocalDate nextBirthday = LocalDate.of(2024, 8, 22);
        DayOfWeek dayOfWeekNextBirthday = nextBirthday.getDayOfWeek();
        LOGGER.info(dayOfWeekNextBirthday.toString());

        /*
        Создайте объект ZonedDateTime для текущей даты и времени в вашем локальном часовом поясе.
        Затем измените этот объект, чтобы он отражал время в часовом поясе Токио.
        Выведите оба значения времени на консоль.
         */
        System.out.println("-------Task07------------");
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        LOGGER.info("zonedDateTimeNow " + zonedDateTimeNow);
        ZonedDateTime zonedDateTimeTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        LOGGER.info("zonedDateTimeTokyo " + zonedDateTimeTokyo);


        LOGGER.info("Zoned date time local -> {}", zonedDateTimeNow);
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        zonedDateTimeTokyo = zonedDateTimeNow.withZoneSameInstant(tokyo);
        LOGGER.info("Zoned date time Tokyo -> {}", zonedDateTimeTokyo);
    }

    //---------3----------
    public static long differenceDateDays(LocalDate lastBirthday, LocalDate today) {
        if(lastBirthday == null || today == null) {
            throw new IllegalArgumentException("Wrong parameter, is null");
        }
        long until = lastBirthday.until(today, ChronoUnit.DAYS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} DAYS", until);
        return until;
    }
}


