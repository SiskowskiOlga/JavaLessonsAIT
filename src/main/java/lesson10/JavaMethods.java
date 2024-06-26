package lesson10;

import static lesson10.Factorial.getFactorial;

public class JavaMethods {
    public static void main(String[] args) {
        printGreeting(); // вызвали имеющий метод
        printGreetingStudent("Anna");
        printGreetingStudent("Anna", 42.2);
        boolean checkResult = checkStudent("Anna");// название переменной одно, но разные параментры.
        System.out.println(checkResult);

        //checkGroupNumber(123);
        int factorial = getFactorial(5);
        System.out.println(factorial);
    }


    public static void printGreeting(){ //  без параментра пустой метод его еще не вызывали и нет значения в нутри
        System.out.println("Hallo Berlin!!!");
    }

    public static void printGreetingStudent(String studentName) { //содержит параменты в себе
        System.out.println("Hallo" + studentName);

    }


    //Oberloowing: ошибку выдает так как есть такой метод название уже,
    // но мы можем дать в нутрь различные реализации передав аргуметр еще и тогда нет ошибки
    public static void printGreetingStudent(String studentName, double groupNumber) {
        System.out.println("Hallo" + studentName + " your group " + groupNumber);

    }

    public static boolean checkStudent(String studentName) {
        //return studentName.equals("Anna");
        if (studentName.equals("Anna")) {
            return true;
        } else {
            return false;
        }


    }// Rekursia metod нужен при математ. функциях.../ факториал число вычисляем например

    public static boolean checkGroupNumber(double groupNumber) {
        System.out.println(groupNumber);
        //checkGroupNumber(groupNumber); //метод вызвал сам себя и мы не указали когда методу выходить, иначе будет
        //произойдет ошибка память заполнена бесконечный цикл
        if (groupNumber == 123) {
            return true;

        } else
            return false;

    }
    // расчет факториала
    public static int getFactorial(int number){
        if (number == 1){
            return  1;
        }else {
            return number * getFactorial((number -1));
        }
    }
}
