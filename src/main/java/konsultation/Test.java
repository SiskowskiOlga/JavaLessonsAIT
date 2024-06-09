package konsultation;

public class Test {
    static String name = "Max";

    public static void main(String[] args) {

        //строка-->число
        String numberString = "34";
        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt - 4);

        //число-->строка
        //Integer.toString()
        //String.valueOf()
        int ageInt = 49;
        String ageString = String.valueOf(ageInt);
        System.out.println(ageString.concat(" years"));

        char charA = 97;
        char b = 'b';
        System.out.println(charA);
        System.out.println(name);

        JavaFor java = new JavaFor();



    }

}
