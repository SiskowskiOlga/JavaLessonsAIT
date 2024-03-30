package lesson06;
import  java.util.Scanner;
public class SchoolLessonSchedule {
    /*
    на основе расписания уроков в школе написать что сейчас: пауза, уроки, свободное время или обед.
   */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите время чтобы определить режим в школе на данный период времени");
        System.out.println("Введите час");
        int hour = scanner.nextInt();
        System.out.println("Введите минуты");
        int minutes = scanner.nextInt();
        System.out.println("Вы ввели " + hour + ":" + minutes);
        scanner.close();
        boolean lesson = (hour >= 8 && hour <= 12) && (minutes >= 1 && minutes <= 44);
        boolean startLesson = hour == 8 && minutes == 0;
        boolean pause = (hour >= 8 && hour <= 11) && (minutes >= 46 && minutes <= 59);
        boolean pauseChangeFreeTime = hour == 12 && minutes == 45;
        boolean lessonChangePause = (hour >= 8 && hour <= 12) && (minutes == 45);
        boolean pauseChangeLesson = (hour >= 9 && hour <= 12) && (minutes == 0);
        boolean dinner = (hour == 13) && (minutes >= 1 && minutes <= 29);
        boolean pauseChangeDinner = hour == 13 && minutes == 0;
        boolean dinnerChangeFreeTime = hour == 13 && minutes == 30;
        boolean freeTime = (hour < 25 && minutes < 60) || hour >= 12 && (minutes >= 46 && minutes <= 59);

        if (startLesson) {
            System.out.println("Начало первого Урока");
        } else if (pauseChangeFreeTime) {
            System.out.println("Заканчивается последний Урок и начинается Свободное Время 15мин");
        } else if (lesson) {
            System.out.println("Урок");
        } else if (pause) {
            System.out.println("Перемена");
        } else if (lessonChangePause) {
            System.out.println("Сейчас заканчивается Урок и начинается Пауза 15мин");
        } else if (pauseChangeLesson) {
            System.out.println("Сейчас заканчивается Пауза и начинается Урок 45мин");
        } else if (pauseChangeDinner) {
            System.out.println("Заканчивается Свободное Время и начинается Обед 30мин");
        } else if (dinnerChangeFreeTime) {
            System.out.println("Обед заканчивается и начинается Свободное время");
        } else if (dinner) {
            System.out.println("Обед");
        } else if (freeTime) {
            System.out.println("Свободное время");
        } else {
            System.out.println("ERROR!!! Вы ввели не корректное ВРЕМЯ");
        }


    }
}
