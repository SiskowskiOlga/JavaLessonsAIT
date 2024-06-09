package lesson26;

public class ChangeTypes {
    public static void main(String[] args) {
        int number = 3000;
        String numberString = String.valueOf(number);

        Integer numberTwo = Integer.valueOf(numberString);// объектный большой интежер
        int numberThree = Integer.parseInt(numberString); //приметивный маленький интежер

        System.out.println(numberString);
        System.out.println(numberTwo);
        System.out.println(numberThree);

    }
}

