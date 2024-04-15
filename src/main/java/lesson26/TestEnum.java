package lesson26;
import java.util.EnumSet;
import  java.util.EnumMap;
import java.net.http.HttpHeaders;
public class TestEnum {
    private static Day dayOfWeek = Day.MONDAY;
    private static AccessLevel accessLevel = AccessLevel.WRITE;
    private static EnumSet<Day>weekend = EnumSet.of(Day.SATURDAY, Day.TUESDAY);
    private static EnumMap<Day,String>dayStringEnumMap=new EnumMap<>(Day.class);

    public static void main(String[] args) {
        weekend.add(Day.FRIDAY);
        weekend.add(Day.TUESDAY);
        System.out.println(weekend);

        dayStringEnumMap.put(Day.FRIDAY,"Super!!!");
        dayStringEnumMap.put(Day.MONDAY,"Kaka");
        dayStringEnumMap.put(Day.SATURDAY, "Cool!");

        System.out.println(lesson26.HttpStatus.NOT_FOUND.getMessage());





       if (dayOfWeek.equals(Day.MONDAY)){
           System.out.println("Monday");
           System.out.println(Operations.MULTIPLY.apply(100,50));
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
    public static void checkDayOfWeek(Day day){
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


