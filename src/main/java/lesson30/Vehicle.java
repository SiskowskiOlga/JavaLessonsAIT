package lesson30;

abstract class Vehicle {
    //содержит в себе переменную и
    //инициализируется через конструктор
   private String brand;
//конструктор абстрактного класса
    public Vehicle(String brand) {
        this.brand = brand;
    }
    //абстрактный метод
    abstract void start();

    //конкретный метод пишем теперь
    public void  stop(){
      System.out.println("Vehicle stopped");
    }
    public String getBrand(){
        return brand;
    }
}
