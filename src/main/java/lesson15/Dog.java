package lesson15;

public class Dog {
    //этот класс содержит только шаблон для создания собаки
    String name;
    String color;
    String breed;
    boolean canBarks;
    boolean serviceDag;

    public Dog(String name, String color, String breed, boolean canBarks, boolean serviceDag) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.canBarks = canBarks;
        this.serviceDag = serviceDag;
    }

    //сгенерировали геттеры,
    // они будут возвращать значения которые имеет объект собак
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isCanBarks() {
        return canBarks;
    }

    public boolean isServiceDag() {
        return serviceDag;
    }
}



