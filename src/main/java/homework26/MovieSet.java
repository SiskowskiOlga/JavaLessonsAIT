package homework26;

public class MovieSet {
    public static void simulateDayOfWork(FilmStudioEmployee[] employees) {
        for (FilmStudioEmployee employee : employees) {
            employee.work();
            if (employee instanceof Director) {
                ((Director) employee).director();
            } else if (employee instanceof CameraOperator) {
                ((CameraOperator) employee).operateCamera();
            } else if (employee instanceof SoundEngineer) {
                ((SoundEngineer) employee).recordSound();
            }
            simulateDayOfWork(employees);
        }

    }
}

