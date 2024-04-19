package homework26;

public class Test {
    public static void main(String[] args) {
        Director director = new Director("Olya", 10);
        director.work();
        director.director();

        CameraOperator cameraOperator = new CameraOperator("Volkan", 7);
        cameraOperator.work();
        cameraOperator.operateCamera();

        SoundEngineer soundEngineer = new SoundEngineer("Selina", 8);
        soundEngineer.work();
        soundEngineer.recordSound();

        FilmStudioEmployee[] employees = new FilmStudioEmployee[4];
        employees[0] = new Director("Olya", 10);
        employees[1] = new CameraOperator("Volkan", 7);
        employees[2] = new SoundEngineer("Selina", 8);

        VisualEffectsSpecialist vfxSpecialist = new VisualEffectsSpecialist("Eve", 6);
        vfxSpecialist.work();
        vfxSpecialist.createVisualEffects();

    }
}
