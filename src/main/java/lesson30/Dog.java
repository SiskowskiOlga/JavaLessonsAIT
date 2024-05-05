package lesson30;
//наследуем класс Animal и реализуем класс makeSound,
// он становиться обязательным для реализации
public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гав гав !!!!!");

    }
}
