package lesson16;

public class JavaMethods {
    public static void main(String[] args) {
        printNames("Anna");
        printNames("Max", "Olga");


    }

    public int sum(int a, int b) {

        return a + b;
    }

    public static double sum(double a, double b) {

        return a + b;
    }

    static int yearSalary = 0; //параметр переменная

    //метод складывает основную зарплату и передает в переменную
    public static int addSalary(int monthSalary) {
        return yearSalary = yearSalary + monthSalary;

    }

    //если еще дополнительно работает к зарплате
    public static int addSalary(int monthSalary, int smallSalary) {
        return yearSalary = yearSalary + monthSalary + smallSalary;
    }

    // ... --->не знаем точно сколько хотим передать параметров с ... передаём любое количество переменных
    static void printNames(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }


}
