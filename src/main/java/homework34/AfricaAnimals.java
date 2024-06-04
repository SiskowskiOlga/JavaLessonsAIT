package homework34;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfricaAnimals {
    /*
    Задание 1: Логирование состояний животного
Цель: Создать класс Animal с методами, которые логируют различные действия и состояния животного.

Описание задачи:

Создайте класс Animal с приватным полем name (имя животного) и energy (энергия животного, изначально 100).
Добавьте методы eat(), sleep(), и play(). Каждый метод должен изменять уровень энергии (energy) и логировать соответствующее сообщение:
eat(): увеличивает энергию на 20. Логирует сообщение "Животное [имя] поело и его энергия теперь [энергия]."
sleep(): увеличивает энергию на 30. Логирует сообщение "Животное [имя] поспало и его энергия теперь [энергия]."
play(): уменьшает энергию на 40. Логирует сообщение "Животное [имя] поиграло и его энергия теперь [энергия]. Если энергия опускается ниже 0, логируется предупреждение о том, что животное устало и нуждается в отдыхе."
Создайте основной класс с методом main, где создается объект Animal и вызываются его методы в различном порядке.
Технические детали:

Используйте SLF4J и Logback для реализации логирования.
Настройте Logback для сохранения логов в файл и отображения в консоли.
ChatGPT
Для создания класса Animal с методами, логирующими различные действия и состояния животного, мы будем использовать библиотеку SLF4J для интерфейса логирования и Logback как реализацию логирования.
     */
    private static final Logger logger = LoggerFactory.getLogger(AfricaAnimals.class);
    private String name;
    private int energy;

    public AfricaAnimals(String name) {
        this.name = name;
        this.energy = 100;
    }

    public void eat() {
        energy += 20;
        logger.info("Животное {} поело и его энергия теперь {}.", name, energy);
    }

    public void sleep() {
        energy += 30;
        logger.info("Животное {} поспало и его энергия теперь {}.", name, energy);
    }

    public void play() {
        energy -= 40;
        if (energy < 0) {
            logger.warn("Животное {} поиграло и его энергия теперь {}. Животное устало и нуждается в отдыхе.", name, energy);
        } else {
            logger.info("Животное {} поиграло и его энергия теперь {}.", name, energy);
        }
    }

    public static void main(String[] args) {
        AfricaAnimals animal = new AfricaAnimals("Тигр");

        animal.eat();
        animal.play();
        animal.sleep();
        animal.play();
        animal.play();
    }
}
