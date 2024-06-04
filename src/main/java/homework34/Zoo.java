package homework34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    /*
    Задание 2: Система мониторинга для зоопарка Java
Цель: Разработать простую систему мониторинга для зоопарка с использованием логирования.

Описание задачи:

Создайте класс Zoo с методом checkAnimals(), который логирует информацию о состоянии каждого животного в зоопарке.
В классе Zoo создайте список объектов Animal. Каждое животное должно иметь уникальные характеристики.
Метод checkAnimals() должен проходить по списку животных и для каждого животного логировать его имя и текущую энергию.
Добавьте логирование ошибок, если какие-то данные о животном отсутствуют или некорректны.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Zoo.class);


    Map<String, Animal> animalMap = new HashMap<>();

    public void addAnimal(Animal animal) {
        if (animal == null) {
            LOGGER.error("Ошибка при добавлении животного, равно null");
        } else {
            animalMap.put(animal.getName(), animal);
        }
    }

    public void checkAnimals() {
        for (Animal animal : animalMap.values()) {
            LOGGER.info("Имя животного {}. Его энергия {}", animal.getName(), animal.getEnergy());
        }
    }


}
