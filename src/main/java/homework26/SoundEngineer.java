package homework26;
/*
SoundEngineer: Должен иметь метод recordSound(), который выводит
сообщение о записи звука.
 */

public class SoundEngineer extends FilmStudioEmployee{
    public SoundEngineer(String name, int experienceYears) {
        super(name,"Sound Engineer", experienceYears);
    }
    public void recordSound(){
        String name;
        System.out.println(getName() + " is recording sound.");
    }
    @Override
    public void work() {
        System.out.println(getName() + " works on sound recording.");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
