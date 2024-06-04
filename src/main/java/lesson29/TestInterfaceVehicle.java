package lesson29;

public class TestInterfaceVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eBike = new ElectricBike();

        car.start();
        eBike.start();
        car.stop();
        eBike.stop();

        car.displayVehicleStatus();

        ElectricVehicle electricBike = new ElectricBike();
        electricBike.charge();
        eBike.displayVehicleStatus();



    }

}
