package homework26;

public class VisualEffectsSpecialist extends FilmStudioEmployee {
    public VisualEffectsSpecialist(String name, int experienceYears) {
        super(name, "Visual Effects Specialist", 3);

    }

    public void createVisualEffects() {
        System.out.println(getName() + " creates visual effects for the film.");

    }

    @Override
    public void work() {
        System.out.println(getName() + " works on visual effects.");
    }
}
