package homework5;
import java.util.Scanner;
public class KnowledgeTesting {
/*

 */
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            int score=0;
            System.out.println("Вы изучаете программирование? 1. Да 2. Нет");
            String answer1 = scanner.nextLine();
            if ((answer1.equals("Да"))){
                score=score+1;
            }
            System.out.println("Выберите правильный ответ:" +
                    "А. Public Class age{" +
                    "B. public class Age;" +
                    "C. public class Age{" );
            String answer2 = scanner.nextLine();
            if ((answer2.equals("C"))){
                score=score+1;
            }
            System.out.println("Напишите кусочек кода который будет выводить: Привет мир!");
            String answer3 = scanner.nextLine();
            if ((answer3.equals("System.out.println(´/Привет мир!/´);"))){
                score=score+1;
            }
            if (score>=2){
                System.out.println("Вы хорошо знаете программирование!!!");
            }else {
                System.out.println("Вам нужно учиться больше!!!");
            }
        }
    }
