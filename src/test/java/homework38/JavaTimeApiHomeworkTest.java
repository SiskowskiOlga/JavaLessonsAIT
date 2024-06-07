package homework38;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class JavaTimeApiHomeworkTest {
    @Test
    void testdifferenceDateDaysPositive(){
        JavaTimeApiHomework javaTimeApiHomework = new JavaTimeApiHomework();
        LocalDate localDateNow = LocalDate.of(2024,06,06);
        LocalDate lastBirthday = LocalDate.of(2020,06,06);
        Assertions.assertEquals(1461,
                javaTimeApiHomework.differenceDateDays(lastBirthday, localDateNow));
    }

    @Test
    void testdifferenceDateDaysThrowsException(){
        JavaTimeApiHomework javaTimeApiHomework = new JavaTimeApiHomework();
        LocalDate localDateNow = null;
        LocalDate lastBirthday = LocalDate.of(2020,06,06);
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> {
                    javaTimeApiHomework.differenceDateDays(lastBirthday, localDateNow);
                });
    }

}
