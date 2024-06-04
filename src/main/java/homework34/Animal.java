package homework34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Animal {
    private static final Logger LOGGER = LoggerFactory.getLogger(Animal.class);

    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        this.energy = 100;
        LOGGER.info("Новое животное {}", this.name);


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


    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat() {
        energy = energy + 20;
        LOGGER.info("Животное {} поело и его энергия теперь {}.", name, energy);
    }

    public void sleep() {
        energy = energy + 30;
        LOGGER.info("Животное {} поспало и его энергия теперь {}.", name, energy);
    }

    public void play() {
        energy = energy - 40;
        if (energy > 0) {
            LOGGER.info("Животное {} поиграло и его энергия теперь {}.", name, energy);
        } else {
            LOGGER.warn("Животное {} устало и нуждается в отдыхе. Его энергия {}.", name, energy);
            energy = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

}
