package homework4;
import java.util.Scanner;

public class Tax {

    /*
        создать программу для расчетов налога, который зависит от категории товара и региона покупателя.
        налог на электронику 10%, на одежду 5%.
        если покупатель из региона А, применяется дополнительный налог.
         */
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите категорию товара: одежда- 1, электроника- 2:");
        int category = scanner.nextInt();
        System.out.println("Введите ваш регион, А или любой другой:");
        char region = scanner.next().charAt(0);
        double taxRate;
        if (category==1){
            taxRate = 0.05;
        } else if (category==2) {
            taxRate=0.10;
        }else {
            System.out.println("Пожалуйста выберите верную категорию товара: ");
            return;
        }
        if (region=='A'){
            taxRate += 0.02;
        }
        System.out.println(" ВВедите стоимость товара: ");
        double price = scanner.nextDouble();
        double tax = price * taxRate;
        System.out.println("Сумма налога: "+ tax);
        scanner.close();
    }
}
