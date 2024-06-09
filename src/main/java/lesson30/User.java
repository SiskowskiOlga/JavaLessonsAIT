package lesson30;

public class User {
    public User() {

        //передаем присваиваем права доступа к 1 как параметр из метода AccessCheck
        //если изменим на 2 например, автоматически все права доступа изменятся по всем параметрам

    }

    @Override
    public String toString() {
        return "User{" +
                "level=" +
                "} " + super.toString();

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

