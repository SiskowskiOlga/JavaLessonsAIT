package homework31;

public class Student {
    String name;
    int grade;//оценки
    //генерируем конструктор и геттеры

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

}
