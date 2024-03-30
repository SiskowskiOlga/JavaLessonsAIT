package lesson04;

public class DayOfWeek {
    /* День недели имеет сой порядковый номер от 1 до 7, где понедельник это - 1,
        вторник - 2 и т.д.
         */
    public static void main(String[] args) {
        int age = 47;
        String name = "Asamat";

        int dayOfWeek = 6;

        //сегодня воскресенье, задаем ему номер 7
        int today = 7;
        boolean result = dayOfWeek <= today;

        System.out.println(" В свои " + age + "годов " + name + " прилежно выполняла домашнее задание в свой выходной день.");
        System.out.println("А выходной ли сегодня день? " + result);

    }
}
