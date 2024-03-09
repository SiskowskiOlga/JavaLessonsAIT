package homework15;

public class ZooUtil {
    private static String[] animalSpecies = {"Lowe", "Elephant", "Affe"};
    private static String[] animalSounds = {"Rrrr", "Tututu", "Aaaaa"};

    public static void main(String[] args) {
        printAnimalSounds(animalSpecies, animalSounds);

        System.out.println("-----");
        findAnimalSound("Lowe", animalSpecies, animalSounds);

    }

    public static void printAnimalSounds(String[] animals, String[] sounds) {
        for (int i = 0; i < animals.length; i++) {
            String animalString = animals[i];
            String animalSoundString = sounds[i];
            System.out.println(animalString + " " + animalSoundString);
        }
    }


    public static void findAnimalSound(String animal, String[] animals, String[] sounds) {
        boolean found = false;
        for (int i = 0; i < animals.length; i++) {
            if (animal.equals(animals[i])) {
                String sound = sounds[i];
                System.out.println(sound);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tier " + animal + " würde nicht gefunden");
        }

    }
}









