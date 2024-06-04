package homework38;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class DateDifference {
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
    }
}
