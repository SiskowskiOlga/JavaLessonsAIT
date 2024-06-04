package lesson30;
//наследуем ей класс Animal
public class Cat extends  Animal{

//реализуем метод makeSound
    @Override
    void makeSound() {
        System.out.println("Мяу мяу!!!");

    }
}
