package konsultation;
import java.util.EnumSet;
import  java.util.EnumMap;

public class TestEnum {
    private static konsultation.Day dayOfWeek = konsultation.Day.MONDAY;
    private static konsultation.AccessLevel accessLevel = konsultation.AccessLevel.WRITE;
    private static EnumSet<konsultation.Day>weekend = EnumSet.of(konsultation.Day.SATURDAY, konsultation.Day.TUESDAY);
    private static EnumMap<konsultation.Day,String>dayStringEnumMap=new EnumMap<>(konsultation.Day.class);

    public static void main(String[] args) {
        weekend.add(konsultation.Day.FRIDAY);
        weekend.add(konsultation.Day.TUESDAY);
        System.out.println(weekend);

        dayStringEnumMap.put(konsultation.Day.FRIDAY,"Super!!!");
        dayStringEnumMap.put(konsultation.Day.MONDAY,"Kaka");
        dayStringEnumMap.put(konsultation.Day.SATURDAY, "Cool!");

        System.out.println(konsultation.HttpStatus.NOT_FOUND.getMessage());





       if (dayOfWeek.equals(konsultation.Day.MONDAY)){
           System.out.println("Monday");
           System.out.println(konsultation.Operations.MULTIPLY.apply(100,50));
       }
       if (accessLevel.isAdmin()){
           //Method to change file
           System.out.println("File was changed");
        }
        else{
            System.out.println("Low access level");
        }


        //вызываем нужный день
        checkDayOfWeek(dayOfWeek);
//статический=> из нутри из статического метода вызываем напрямую;
// иначе мы не будем видеть метод


    }
    public static void checkDayOfWeek(konsultation.Day day){
        switch (day){
            case MONDAY :
                System.out.println(day.name()+ " " + day.getDescription());
                break;
            case TUESDAY:
                System.out.println(day.name() + " " + day.getDescription());
                break;
            case FRIDAY:
                System.out.println(day.name() + " " + day.getDescription());
                break;
            default:
                System.out.println(day.name() + " " + day.getDescription());
                break;

        }

            }

        }


