package lesson27;

public class Lipstick extends CosmeticProduct{
    private String color;

    public Lipstick(String productName, String brand, double price, String color) {
        super(productName, brand, price);
        this.color = color;
    }

    @Override
    public void apply() {
        System.out.println("Apply the " + productName + " lipstick by " + brand + " in " + color + " color.");
    }

    @Override
    public String toString() {
        return "Lipstick{" +
                "color='" + color + '\'' +
                '}';
    }
}






