package homework38;
import java.time.LocalDate;
import java.time.Month;

public class Birthday {
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
    }
    }

