package homework38;
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
public class NextBirthdayDayOfWeek {
    /*
    Определение дня недели
Задача: Напишите программу, которая определяет день недели для вашего следующего дня рождения.
Используйте LocalDate и метод getDayOfWeek(). Выведите результат на консоль.
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

        // Определение дня недели для следующего дня рождения
        DayOfWeek dayOfWeek = nextBirthday.getDayOfWeek();

        // Вывод результата на консоль
        System.out.println("Ваш следующий день рождения будет в: " + dayOfWeek);
    }
}
