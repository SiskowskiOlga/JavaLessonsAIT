package lesson30;

public class User extends AccessCheck {
    public User() {
        super(1);
        //передаем присваиваем права доступа к 1 как параметр из метода AccessCheck
        //если изменим на 2 например, автоматически все права доступа изменятся по всем параметрам

    }

    @Override
    public String toString() {
        return "User{" +
                "level=" + level +
                '}';
    }
}
    /*
    @Override
    boolean canRead() {
        return false;
    }

    @Override
    boolean canRight() {
        return false;
    }

 */

