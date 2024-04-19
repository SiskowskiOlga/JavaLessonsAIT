package homework26;
/*
CameraOperator: Должен иметь метод operateCamera(), выводящий
информацию о том, что оператор управляет камерой.
 */

public class CameraOperator extends FilmStudioEmployee{
    public CameraOperator(String name, int experienceYears) {
        super(name,"Camera Operator", experienceYears);
    }
    public void operateCamera(){
        System.out.println(getName() + " is operating the camera." );
    }
    @Override
    public void work() {
       System.out.println(getName()+ " operates the camera.");
    }

}
