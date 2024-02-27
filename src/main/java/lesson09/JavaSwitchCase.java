package lesson09;

public class JavaSwitchCase {
    public static void main(String[] args) {
        /*
        String expression; //обьявляем переменную, даем значение
         switch (expression){
            case "value1"://код для выполнения если expression =="value"
                break;
            case "value2":break;
            case "value3":break;
            default: //код для выполнения если expression не соответствует не одному case

        }

        Классика написания:

       int day =3;
       String dayString;
        switch (day){
            case 1: dayString = "Montag"; break;
            case 2: dayString = "Dienstag";break;
            case 3: dayString = "Mittwoch";break;
            default:dayString = "Restliche Tagen";break;


        }
        System.out.println(dayString);

    }*/

        // Современный вариант :
        String day = switch (4) { //меняя значение переменной, получаем ответы
            case 1, 2, 3, 4 -> "Arbeitstagen";
            case 6, 7 -> "Wochenende";
            default -> "Fehler!!!";
        };
        System.out.println(day);
    }
}





