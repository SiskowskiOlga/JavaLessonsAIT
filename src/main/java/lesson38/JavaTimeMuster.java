package lesson38;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class JavaTimeMuster {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 05, 20);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTimeNew = LocalTime.of(13, 45, 00);//указали сразу с значением
        System.out.println(localTimeNew);
        LocalDateTime localDateTime = LocalDateTime.of(2024, 05, 22, 12, 34);
        System.out.println(localDateTime);

        LocalDateTime localDateTimeNew = LocalDateTime.of(2024,1,1,12,45);
        ZoneOffset zoneOffset = ZoneOffset.of("+2:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTimeNew,zoneOffset);
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime3 = LocalDateTime.of(2024,9,12,12,00,34);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime3,zoneId);
        System.out.println(zonedDateTime);

        MonthDay monthDay = MonthDay.of(java.time.Month.APRIL,20);
        System.out.println(monthDay);
        YearMonth yearMonth = YearMonth.of(2024, java.time.Month.APRIL);
        System.out.println(yearMonth);
        Year year = Year.of(2024);
        System.out.println(year);

        LocalDate localDate4 = LocalDate.of(2024,01,01);
        System.out.println(localDate4);
        localDate4 = localDate4.plusDays(24);
        System.out.println(localDate4);
        localDate4 = localDate4.plusDays(36);
        System.out.println(localDate4);
        localDate4 = localDate4.minusDays(20);
        System.out.println(localDate4);

        if (LocalDate.now().isAfter(localDate4)){
            System.out.println("is after now");
        }
        else {
            System.out.println("is not after now");
        }
        LocalDate date = LocalDate.parse("2024-02-02");
        System.out.println(date);
        LocalDateTime localDateTimeToParse = LocalDateTime.parse("2024-02-02,12:30:00");
        System.out.println(localDateTimeToParse);

        String format = java.time.format.DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.FULL).withLocale(java.util.Locale.GERMAN).format(LocalDate.of(2024,12,12));
        System.out.println(format);

        LocalDate startLocalDate = LocalDate.parse("2024-02-02");
        LocalDate endLocalDate = LocalDate.parse("2024-12-02");
        long until = startLocalDate.until(endLocalDate, ChronoUnit.MONTHS);
        System.out.println(until);








    }
}
