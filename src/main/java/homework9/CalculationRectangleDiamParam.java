package homework9;
import  java.util.Scanner;
public class CalculationRectangleDiamParam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста укажите длину прямоугольника: ");
        double length = scanner.nextDouble();
        System.out.println("Пожалуйста укажите ширину прямоугольника: ");
        double wight = scanner.nextDouble();
        double area = calculateArea(length, wight);
        System.out.println("Area: " + area);
        double perimeter = calculatePerimeter(length, wight);
        System.out.println("Perimeter: " + perimeter);
        scanner.close();
    }

    public static double calculateArea(double lengthOfFigure, double wightOfFigure){
        if(lengthOfFigure <= 0 || wightOfFigure <=0){
            System.out.println("ERROR");
            return  -1;
        }
        return  lengthOfFigure * wightOfFigure;
    }

    public static  double calculatePerimeter(double length, double wight){
        if(length <= 0 || wight <=0){
            System.out.println("ERROR");
            return  -1;
        }
        return  2 * (length + wight);
    }


}




