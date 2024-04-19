package homework25;

public class MenuItemTest {
    public static void main(String[] args) {
        //создаем несколько элементов меню
        MenuItem coffee = new MenuItem("Coffee", MenuItemType.DRINK);
        MenuItem pizza = new MenuItem("Pizza", MenuItemType.DISH);
        MenuItem pasta = new MenuItem("Pasta", MenuItemType.DISH);
        MenuItem water = new MenuItem("Water", MenuItemType.DRINK);


        //выводим информацию о каждом элементе
        System.out.println(coffee.toString());
        System.out.println(pizza.toString());
        System.out.println(pasta.toString());
        System.out.println(water.toString());


    }
}
