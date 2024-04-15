package lesson09;

public class Person {
    // Модификатор
    private int age = 20;                          //создали класс персон, вложили данные этого персонажа
    private String name = "Olga";
    private String pass = "Deutschland";
    private String colorOfEye = "Blue";
    private String sex = "Female";
    private String pincode = "12345";
    public  int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getPass(){
        return pass;
    }
    public String getColorOfEye(){
        return colorOfEye;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age){
        this.age = age;
    }

}
