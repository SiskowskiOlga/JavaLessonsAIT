package lesson27;

public class Main {
    public static void main(String[] args) {
        Lipstick lipstick = new lesson27.Lipstick("Gloser", "Channel",45.90,"red");
        Mascara mascara = new Mascara("Water Mascara","Chanel",89.90,"3");
        lipstick.apply();
        mascara.apply();
    }
}
