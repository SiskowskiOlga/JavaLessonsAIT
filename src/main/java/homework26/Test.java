package homework26;

public class Test {
    public static void main(String[] args) {
        Director director = new Director("Olya", "Director",10);
        director.work();
        director.director();

        CameraOperator cameraOperator = new CameraOperator("Volkan", "Operator",5);
        cameraOperator.work();
        cameraOperator.operateCamera();

        SoundEngineer soundEngineer = new SoundEngineer("Selina", "Sound Engineer", 3);
        soundEngineer.work();
        soundEngineer.recordSound();

        FilmStudioEmployee[] employees = new FilmStudioEmployee[4];
        employees[0] = new Director("Olya", "Director",5);
        employees[1] = new CameraOperator("Volkan", "Operator",5);
        employees[2] = new SoundEngineer("Selina", "Sound Engineer",6);

        VisualEffectsSpecialist vfxSpecialist = new VisualEffectsSpecialist("Eve", 6);
        vfxSpecialist.work();
        vfxSpecialist.createVisualEffects();

    }
}
