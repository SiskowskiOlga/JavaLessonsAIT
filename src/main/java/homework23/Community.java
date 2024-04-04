package homework23;
import java.util.HashSet;
public class Community {
    private String name;
    private HashSet<User> members;

    public Community(String name) {
        this.name = name;
        this.members = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getMembers() {
        return members;
    }

    // Добавление участника
    public void addMember(User user) {
        members.add(user);
    }

    // Удаление участника
    public void removeMember(User user) {
        members.remove(user);
    }

    @Override
    public String toString() {
        return "Community{" +
                "name='" + name + '\'' +
                '}';
    }
}
