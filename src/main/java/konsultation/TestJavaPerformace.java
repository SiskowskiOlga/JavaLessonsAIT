package konsultation;
import lesson09.Person;
public class TestJavaPerformace {
    static int i = 0;

    public static void main(String[] args) {
        while (true) {
            i = i*20000;
            System.out.println(i);
            Person person = new Person();
            person.setAge(i);
            System.out.println("Age" + person.getAge());
            i++;
        }
    }

}
