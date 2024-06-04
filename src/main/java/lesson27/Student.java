package lesson27;

public class Student extends Person{
    private String educationTime;
    private double avarageDegree;

    public Student(String name, int age, String educationTime, double avarageDegree) {
        super(name, age);
        this.educationTime = educationTime;
        this.avarageDegree = avarageDegree;
    }

    public String getEducationTime() {

        return educationTime;
    }

    public double getAvarageDegree() {

        return avarageDegree;
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("Student ---> ");
        stringBuffer.append("educationTime='").append(educationTime).append('\'');
        stringBuffer.append(", avarageDegree=").append(avarageDegree);
        return stringBuffer.toString();



}
    }
