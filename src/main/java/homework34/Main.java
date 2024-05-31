package homework34;

public class Main {
    public static void main(String[] args) {
        Animal manky = new Animal("Manky");
        Animal lowe = new Animal("Lowe");

        Zoo zoo = new Zoo();
        zoo.addAnimal(manky);
        zoo.addAnimal(lowe);
        zoo.addAnimal(null);

        zoo.checkAnimals();

        manky.eat();
        manky.sleep();
        manky.play();

        lowe.sleep();
        lowe.sleep();
        lowe.play();
        lowe.play();
        lowe.play();
        lowe.play();
    }
}
