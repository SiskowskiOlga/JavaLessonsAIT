package homework34;

public class Animal {
    /*
    Задание 2: Система мониторинга для зоопарка Java
Цель: Разработать простую систему мониторинга для зоопарка с использованием логирования.

Описание задачи:

Создайте класс Zoo с методом checkAnimals(), который логирует информацию о состоянии каждого животного в зоопарке.
В классе Zoo создайте список объектов Animal. Каждое животное должно иметь уникальные характеристики.
Метод checkAnimals() должен проходить по списку животных и для каждого животного логировать его имя и текущую энергию.
Добавьте логирование ошибок, если какие-то данные о животном отсутствуют или некорректны.
     */
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
}
