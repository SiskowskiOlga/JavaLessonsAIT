package lesson30;
//создаем класс Car который наследник абстрактного класса Vahicle
public class Car extends Vehicle{
  //используем конструктор абстрактного класса, при создании конструктора нашего класса
  //мы передаем в него параметр brand и идет вызов конструктора класса Vehicle

    public Car(String brand) {
        super(brand);
    }
    //метод start он абстрактный, значить класс Car должен его реализовать
    @Override
    void start() {
        //(дать ему в коде жизнь)
        System.out.println("Car"+getBrand()+" is running");

    }
}
