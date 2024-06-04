package lesson38;
import konsultation.BankAccountValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaTimeTasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaTimeTasks.class);

    public static void main(String[] args) {
        /*
        Создание и вывод даты
        **Задача**: Создайте объект `LocalDate`
        для вашего дня рождения и выведите его на консоль в формате "гггг-мм-дд".
         */
        LocalDate localDate = LocalDate.of(1992,8,22);
        LOGGER.info(localDate.toString());

        /*
        Прибавление времени
        **Задача**: Используя текущее время, создайте объект `LocalTime`
        и добавьте к нему 90 минут. Выведите результат на консоль.
         */
        LocalTime localTime = LocalTime.now();
        LOGGER.info(localTime.toString());
        localTime = localTime.plusMinutes(90);
        LOGGER.info(localTime.toString());

        /*
        Разница между датами
        **Задача**: Создайте два объекта `LocalDate`: один для первого дня текущего года и другой для сегодняшнего дня.
        Используйте `Until`, чтобы вычислить разницу
        между этими датами в годах, месяцах и днях. Выведите результат на консоль.
         */
        LocalDate localDateStart = LocalDate.of(2024,1,1);
        LOGGER.info(localDateStart.toString());
        LocalDate localDateNow = LocalDate.now();
        LOGGER.info(localDateNow.toString());
        long until = localDateStart.until(localDateNow, ChronoUnit.DAYS);
        LOGGER.info(String.valueOf(until));
        until = localDateStart.until(localDateNow,ChronoUnit.MONTHS);
        LOGGER.info(String.valueOf(until));
        until = localDateStart.until(localDateNow,ChronoUnit.YEARS);
        LOGGER.info(String.valueOf(until));

        /*
        Форматирование даты
        **Задача**: Создайте объект `LocalDate` для случайной даты и
            отформатируйте его в виде строки в формате "дд.мм.гггг". Выведите эту строку на консоль.
         */
        LocalDate localDateRandom = LocalDate.of(2020,03,8);
        String localDateRandomFormated = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.GERMAN).format(localDateRandom);
        String localDateRandomIndividualFormated = DateTimeFormatter.ofPattern("yyyy*dd*MM").format(localDateRandom);
        LOGGER.info(localDateRandomFormated);
        LOGGER.info(localDateRandomIndividualFormated);

        /*
        Создайте объект `ZonedDateTime` для текущего момента времени в часовом поясе GMT (Лондон).
        Преобразуйте его в часовой пояс EST (Нью-Йорк)
        и выведите оба объекта на консоль для сравнения.
         */
        ZonedDateTime zonedDateTimeNowGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        LOGGER.info(zonedDateTimeNowGMT.toString());
        zonedDateTimeNowGMT = ZonedDateTime.now(ZoneId.of("America/New_York"));
        LOGGER.info(zonedDateTimeNowGMT.toString());


    }

}
