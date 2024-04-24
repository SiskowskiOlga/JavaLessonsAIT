package homework26;
/*
2.  Разработайте специализированные подклассы:
Director: Должен иметь метод director(), который выводит сообщение о том, что
директор руководит съемочной группой.


Все подклассы должны переопределять метод work(), добавляя специфические
детали своей работы.
 */

public class Director extends FilmStudioEmployee {
    public Director(String name, int experienceYears) {
        super(name,"Director", experienceYears);
    }

    public void director() {

        System.out.println(getName() + " directs the film.");
    }



    @Override
    public void work() {

        System.out.println(getName()+" directs the film crew.");
    }
}
