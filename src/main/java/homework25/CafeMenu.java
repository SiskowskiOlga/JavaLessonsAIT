package homework25;

public class CafeMenu {
    public static void main(String[] args) {
        //создаем несколько элементов меню
        MenuItem coffee = new MenuItem("Coffee", MenuItemType.DRINK);
        MenuItem pizza = new MenuItem("Pizza", MenuItemType.DISH);
        MenuItem pasta = new MenuItem("Pasta", MenuItemType.DISH);
        MenuItem water = new MenuItem("Water", MenuItemType.DRINK);

        //выводим информацию о каждом элементе
        System.out.println(coffee);
        System.out.println(pizza);
        System.out.println(pasta);
        System.out.println(water);
    }
}
