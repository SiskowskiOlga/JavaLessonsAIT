package lesson30;

abstract class AccessCheck {

    protected int level;

    public AccessCheck(int level) {   //сделали конструктор
        this.level = level;
    }
    //напишем метод
     public boolean canReadFiles(){
        return this.level >= 1;
     }

    //два абстрактных метода
   //abstract boolean canRead();
    //abstract boolean canRight();
}
