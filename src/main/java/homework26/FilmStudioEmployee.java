package homework26;

public class FilmStudioEmployee {
    /*
    Задание:
1.  Создайте базовый класс FilmStudioEmployee:
Добавьте базовые свойства, такие как name, position, и experienceYears.
Добавьте метод work(), который выводит информацию о том, что сотрудник что-то
делает (например, "Alice works on her current task.").
2.  Разработайте специализированные подклассы:
Director: Должен иметь метод direct(), который выводит сообщение о том, что
директор руководит съемочной группой.
CameraOperator: Должен иметь метод operateCamera(), выводящий
информацию о том, что оператор управляет камерой.
SoundEngineer: Должен иметь метод recordSound(), который выводит
сообщение о записи звука.
Все подклассы должны переопределять метод work(), добавляя специфические
детали своей работы.
3.  Создание класса MovieSet:
Добавьте метод simulateDayOfWork(), который принимает массив сотрудников
FilmStudioEmployee и заставляет каждого из них выполнять свои специфические
задачи.
Задачи для выполнения:
Имплементируйте все классы, учитывая их специализации.
Создайте тестовый сценарий в методе main, где создаются объекты каждого класса и
помещаются в массив. Затем используйте simulateDayOfWork() для демонстрации
работы каждого сотрудника.
Подумайте, как можно расширить модель, добавив новые типы сотрудников или
дополнительные методы в существующие классы

     */

    private String name;
    private String position;
    private int experienceYears;

    public FilmStudioEmployee(String name, String position, int experienceYears) {
        this.name = name;
        this.position = position;
        this.experienceYears = experienceYears;
    }
    public void work(){
        System.out.println(name + " works on her current task.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {

        this.experienceYears = experienceYears;
    }
    @Override
    public String toString() {
        return "FilmStudioEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }


}

