package homework23;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Massage {
    private User sender;
    private String text;
    private LocalDateTime sendTime;
    private HashSet<User> likes;

    public void Message(User sender, String text) {
        this.sender = sender;
        this.text = text;
        this.sendTime = LocalDateTime.now();
        this.likes = new HashSet<>();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public HashSet<User> getLikes() {
        return likes;
    }

    // Добавление лайка
    public void addLike(User user) {
        likes.add(user);
    }

    // Удаление лайка
    public void removeLike(User user) {
        likes.remove(user);
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", text='" + text + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
