package lesson27;

public class Mascara extends  CosmeticProduct{
    private String volumeEffect;

    public Mascara(String productName, String brand, double price, String volumeEffect) {
        super(productName, brand, price);
        this.volumeEffect = volumeEffect;
    }

    @Override
    public void apply() {
        System.out.println("Apply the " + productName + " mascara by " + brand + " for " + volumeEffect + " volume effect.");
    }

    @Override
    public String toString() {
        return "Mascara{" +
                "volumeEffect='" + volumeEffect + '\'' +
                '}';
    }
}
