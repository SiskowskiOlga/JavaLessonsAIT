package lesson29;
import java.util.List;
public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.charge();
        smartphone.connect();

        Chargeale nokia = new Smartphone();
        nokia.charge();

        Connectable nokiaPhone = new Smartphone();
        nokiaPhone.connect();

        GPSable nokiaPro = new Smartphone();
        nokiaPro.getLocation();

    }

}
