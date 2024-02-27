package homework9;
import java.util.Scanner;
public class RectanglePerimetersAndArea {
    //метод вычисления площади прямоугольника
    public static double calculateArea(double length, double width){
        //формула вычесления
        return  length * width;
    }
    //метод вычисления периметра прямоугольника
    public static double CalculatePerimeter(double length, double width){
        // формула вычесления
        return 2*(length+width);

    }
    //считывает значения прямоугольника, вычисляет и выводит результат
    public static  void  main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the width and length of your rectangle: ");

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area: "+ (length*width));
        System.out.println("Perimeter: " + (2*(length+width) ));
        scanner.close();



    }

}
