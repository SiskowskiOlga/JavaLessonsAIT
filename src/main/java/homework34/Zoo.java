package homework34;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Zoo {
    private static final Logger logger = Logger.getLogger(Zoo.class.getName());
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void checkAnimals() {
        for (Animal animal : animals) {
            try {
                if (animal.getName() == null || animal.getName().isEmpty()) {
                    throw new IllegalArgumentException("Invalid animal name");
                }
                if (animal.getEnergy() < 0) {
                    throw new IllegalArgumentException("Invalid animal energy");
                }

                // Логируем информацию о животном
                logger.log(Level.INFO, "Animal: {0}, Energy: {1}", new Object[]{animal.getName(), animal.getEnergy()});

            } catch (IllegalArgumentException e) {
                // Логируем ошибку, если данные о животном некорректны
                logger.log(Level.SEVERE, "Error with animal data: " + e.getMessage(), e);
            }
        }
    }
}

