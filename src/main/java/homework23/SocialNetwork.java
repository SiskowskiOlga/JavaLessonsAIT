package homework23;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class SocialNetwork {

    private HashMap<Integer, User> users;
    private HashMap<String, Community> communities;

    public SocialNetwork() {
        this.users = new HashMap<>();
        this.communities = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void removeUser(int userId) {
        users.remove(userId);
    }

    public User getUser(int userId) {
        return users.get(userId);
    }

    public void addCommunity(Community community) {
        communities.put(community.getName(), community);
    }

    public void removeCommunity(String communityName) {
        communities.remove(communityName);
    }

    public Community getCommunity(String communityName) {
        return communities.get(communityName);
    }

    // Поиск пользователя по имени
    public ArrayList<User> findUsersByName(String name) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : users.values()) {
            if (user.getName().equals(name)) {
                result.add(user);
            }
        }
        return result;
    }

    // Просмотр сообщества по названию
    public Community viewCommunityByName(String name) {
        return communities.get(name);
    }
}
