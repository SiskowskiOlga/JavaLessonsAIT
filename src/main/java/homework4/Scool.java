package homework4;
import java.util.Scanner;
public class Scool {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите часы и минуты");
        int hour = scanner.nextInt();
        if (hour>=0&&hour<24){
            int minute = scanner.nextInt();
            if (minute>=0&&minute<60){
                if (hour<8 || hour>=30 || hour==12&&minute>45){
                    if(hour==13&&minute<=30){
                    }
                    System.out.println("Обед");
                }else {
                    System.out.println("Свободное время");
                }
            }else {
                if (minute<=45){
                    System.out.println("Урок");
                }else{
                    System.out.println("Перемена");
                }
            }
        }
    }
}

/*
variant
import java.util.Scanner;

public class Lessons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сколько сейчас часов (00-23) ");
        int hours = scan.nextInt();
        System.out.print("Введите сколько сейчас минут(00-59):");
        int minutes = scan.nextInt();
        scan.close();
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            if (hours == 12 && minutes == 45) {
                System.out.println("Последний урок закончился, началось свободное время");
            } else if (hours == 13 && minutes == 0) {
                System.out.println("Свободное время закончилось, начался обед");
            }
            //Время обеда
            else if (hours == 13 && minutes < 30) {
                System.out.println("Идет обед");
            } else if (hours == 13 &&  minutes==30) {
                System.out.println("Обед закончился, началось свободное время. Можно идти домой");
            }
            //Учебное время
            else if (hours >= 8 && hours < 12 || hours == 12 && minutes < 45) {
                if (minutes < 45 && minutes > 0)
                    System.out.println("Идет урок");
                else if (minutes == 0 && hours != 8) {
                    System.out.println("Перемена закончилась, начался урок");
                } else if (minutes == 0)
                    System.out.println("Cвободное время закончилось, начался первый  урок");

                else if (minutes > 45)
                    System.out.println("Сейчас перемена");
                else {
                    System.out.println("Урок закончился, началась перемена");
                }

            } else
                System.out.println("Cвободное время");
        } else
            System.out.println("Вы ввели неправильно время!");
    }
}
 */
