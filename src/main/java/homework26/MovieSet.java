package homework26;
import java.util.ArrayList;
public class MovieSet {


    public static void main(String[] args) {
        ArrayList<FilmStudioEmployee> filmStudioEmployees = new ArrayList<>();
        //создали новых сотрудников
        Director director = new Director("Löwe","Direktor", 10);
        SoundEngineer soundEngineer = new SoundEngineer("Lakes", "Sound Engineer", 6);
        CameraOperator cameraOperator = new CameraOperator("Maximilan", "Kameraman", 15);
        FinancialDirector financialDirector = new FinancialDirector("Johnson", "Financial Director",7);
        filmStudioEmployees.add(director);
        filmStudioEmployees.add(soundEngineer);
        filmStudioEmployees.add(cameraOperator);
        filmStudioEmployees.add(financialDirector);

        for(final FilmStudioEmployee filmStudioEmployee : filmStudioEmployees) {
            filmStudioEmployee.work();
        }

    }

}



