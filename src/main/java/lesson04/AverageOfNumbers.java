package lesson04;

public class AverageOfNumbers {
    /*объявляем три переменные типа float,
    присваиваем им значение, вычисляем и
    выводим среднее значение этих трех чисел
     */
    public static void main(String[]args){
        float numberOne=100.12f;
        float numberTwo=300.45f;
        float numberTree=400.56f;

        float sum= numberOne+numberTwo+numberTree;
        System.out.println(sum); //сначала посчитали общую сумму трех чисел
        float result=sum/3; //не выписываем всю математику, а сразу задаем
        System.out.println(result);

        System.out.println("----Double-------");

        double numberOneDouble=100.12;
        double numberTwoDouble=300.45;
        double numberTreeDouble=400.56;

        double sumDouble= numberOneDouble+numberTwoDouble+numberTreeDouble;
        System.out.println(sumDouble);
        double resultsumDouble=sumDouble/ 3;  //сначала посчита
        System.out.println(resultsumDouble);


    }
}
