package lesson30;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Motorcycle"+getBrand()+" start");
//дали жизнь коду, обозначив через getBrand и указали что выводить
    }
}
