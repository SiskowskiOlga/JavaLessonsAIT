package lesson15;

public class DogRegistration {
    public static void main(String[] args) {
        Dog dogBulldog = new Dog("Bully", "white", "Bulldog", true, true);
        Dog dogMops = new Dog("Hatiko", "black", "Mops", false, false);

        //храним объекты в хранилище {} и
        // через цикл for можем вытащить всю информацию перебирая эти объекты
        Dog[] registration = {dogMops, dogBulldog};
        for (Dog dog : registration) {
            System.out.println("Name of Dogs is: " + dog.getName());
        }

        System.out.println("Color of Mops is: " + dogMops.getColor());
        System.out.println("Name of Bulldog is: " + dogBulldog.getName());
        //запрашиваем какого цвета мопс через get /возврат
    }
    /*dog создали новую собаку по конструктору шаблона который обязаны выполнить если хотим создать собаку,
     а новый dogMops создаем после =
     мы должны в () передать параметры из шаблона собаки
     */


}
