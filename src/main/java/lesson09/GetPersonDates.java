package lesson09;
import  lesson09.Person;
public class GetPersonDates {
    //создали второй класс, чтобы получать сюда данные из других классов
    public static void main(String[]args){
        Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.getColorOfEye());
        System.out.println(person.getAge());
        
    }
}
