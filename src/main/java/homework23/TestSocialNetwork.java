package homework23;
import java.util.ArrayList;
public class TestSocialNetwork {
    public static void main(String[] args) {
        // Создаем социальную сеть
        SocialNetwork socialNetwork = new SocialNetwork();

        // Создаем пользователей
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        // Добавляем пользователей в сеть
        socialNetwork.addUser(user1);
        socialNetwork.addUser(user2);

        // Создаем сообщество
        Community community = new Community("Java Developers");

        // Добавляем сообщество в сеть
        socialNetwork.addCommunity(community);

        // Добавляем пользователя в сообщество
        community.addMember(user1);

        // Поиск пользователя по имени
        System.out.println("Пользователи с именем Alice:");
        ArrayList<User> users = socialNetwork.findUsersByName("Alice");
        for (User user : users) {
            System.out.println(user);
        }

        // Просмотр сообщества по названию
        System.out.println("\nСообщество с названием Java Developers:");
        Community foundCommunity = socialNetwork.viewCommunityByName("Java Developers");
        System.out.println(foundCommunity.getName());
    }
}

