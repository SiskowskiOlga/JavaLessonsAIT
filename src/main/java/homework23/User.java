package homework23;
import java.util.HashSet;
public class User {

        /*Задание: Разработка модели социальной сети на Java
        Цель:
        Создайте упрощенную модель социальной сети,
        используя набор основных Java: Array, ArrayList, HashSet, и HashMap.
        Задачи:
        Пользователи и Друзья (Использование ArrayList и HashSet):

        Создайте класс User, который должен сохранять информацию о пользователе: имя (String), уникальный идентификатор (int) и
        список друзей (используйте HashSet для хранения объектов User, представляя друзей пользователя).
        Реализовать методы добавления и удаления друзей пользователя.
        Сообщения (Использование ArrayList):

        Создайте класс Message, который содержит информацию о сообщении: отправитель User,
        текст сообщения (String) и время отправки (LocalDateTime).
        В классе User, поле заголовка, которое будет хранить список сообщений (ArrayList<Message>), отправленных пользователем.
        Лайки и Сообщества (Использование HashMap):

        В классе Message, реализуйте систему лайков. Использовать HashSet<User>для хранения пользователей, которым понравилось сообщение.
        Создать классную группу Community, представляя сообщество или в социальной сети. Он должен сохранить название сообщества (String) и
        перечислить его участников (HashSet<User>).
        Используйте HashMap<String, Community>для хранения всех сообществ в социальных сетях, где ключ — это название сообщества.
        Поиск (Использование HashMap):

        Реализовать функцию поиска пользователей по имени. Используйте HashMap<Integer, User>для хранения всех пользователей свои идентификаторы в качестве ключей.
        Добавьте функцию просмотра сообществ по названию.
        Дополнительные требования:
        Все классы должны иметь геттеры и сеттеры для своих полей.
        Реализуйте методы toString()для удобства отладки и получения информации о пользователях, сообщениях и сообществах.
        Создайте тестовый класс с помощью main метода, в котором вы выбираете работу ваших моделей: создание пользователей, добавление их в друзья, отредактирование сообщений, использование лайков, создание и управление сообществами.*/

    private int userId;
    private String name;
    private HashSet<User> friends;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.friends = new HashSet<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getFriends() {
        return friends;
    }

    //добавление друга
    public void addFriend(User friend) {
        friends.add(friend);
    }

    //удаление друга
    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}






