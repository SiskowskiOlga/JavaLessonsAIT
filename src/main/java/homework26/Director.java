package homework26;
/*
2.  Разработайте специализированные подклассы:
Director: Должен иметь метод director(), который выводит сообщение о том, что
директор руководит съемочной группой.


Все подклассы должны переопределять метод work(), добавляя специфические
детали своей работы.
 */

public class Director extends FilmStudioEmployee {
    public Director(String name,String position, int experienceYears) {
        super(name,position, experienceYears);
    }

    public void director() {

        System.out.println(getName() + " is a director.");
    }
    @Override
    public String toString() {
        return "Director{} " + super.toString();
    }




    @Override
    public void work() {
        super.work();
        System.out.println("Director makes Casting");
    }
}
