package lesson30;

public class TestAnimal {
    public static void main(String[] args) {
        //вызываем реализации из Animal комбинируем,
        //вызывая конкретный метод и абстрактный метод
        //может вызывать наследуемые методы (абстрактный класс) и те которые переписываются (класс Dog)
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
