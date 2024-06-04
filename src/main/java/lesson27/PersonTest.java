package lesson27;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student("Olav",44,"23-56",3.5);
        System.out.println(student.toString());

        Teacher teacher = new Teacher("Lermann",50, "Mathe",20);
        System.out.println(teacher.toString());
    }
}
