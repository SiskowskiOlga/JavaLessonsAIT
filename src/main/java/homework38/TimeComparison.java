package homework38;
import java.time.LocalTime;
public class TimeComparison {
    /* Сравнение времени:
    Создайте два объекта LocalTime: один для времени "07:30" утра, а другой для "08:45" вечера.
    Используйте методы isBefore и isAfter, чтобы определить, какое время раньше или позже, и выведите результат на консоль.
     */
    public static void main(String[] args) {
        // Создали объект LocalTime для времени "07:30" утра
        LocalTime morningTime = LocalTime.of(7, 30);

        // Создали объект LocalTime для времени "08:45" вечера
        LocalTime eveningTime = LocalTime.of(20, 45); // 20:45 - это 8:45 вечера в 24-часовом формате

        // Определение, какое время раньше или позже
        if (morningTime.isBefore(eveningTime)) {
            System.out.println("Время " + morningTime + " раньше, чем " + eveningTime);
        } else {
            System.out.println("Время " + morningTime + " позже, чем " + eveningTime);
        }

        if (eveningTime.isAfter(morningTime)) {
            System.out.println("Время " + eveningTime + " позже, чем " + morningTime);
        } else {
            System.out.println("Время " + eveningTime + " раньше, чем " + morningTime);
        }
    }
}
