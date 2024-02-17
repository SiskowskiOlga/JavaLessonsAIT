package homework6;
import java.util.Scanner;
public class Task4 {
    public static void main(String[]args){
       // пирамидку нарисавать
        //высота пирамиды вводится с клавы
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту треугольника: ");
        int n = scanner.nextInt();
        if (n<=0){
            System.out.println("ERROR!!!");
        }else{
            String up = "";
            String down = "";
            String temp = "";
            for (int i = 1; i<=n; i++){
                temp += i;
                up += temp +"\n";
                if (i!=n){
                    down=temp +"\n"+down;
                }
            }
            System.out.println(up+down);
        }


    }
}
