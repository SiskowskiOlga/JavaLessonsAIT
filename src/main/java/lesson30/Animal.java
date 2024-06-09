package lesson30;

//создали абстрактный класс
abstract class Animal {
    //создали абстрактный метод,
    // этот метод не имеет внутри себя реализацию в данный момент(пустой)
    abstract void makeSound();

    //конкретный метод обозначили, что он делает
    void sleep() {
        System.out.println("Спит");
    }


    void eat() {
        System.out.println("Ест");
    }
}

