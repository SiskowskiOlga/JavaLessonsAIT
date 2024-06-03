package konsultation;
import lombok.extern.slf4j.Slf4j;
import java.util.logging.Logger;

@Slf4j
public class TestUser {
    public static void main(String[] args) {
       User user = new User();
        user.setName("Alex");
        user.setAge(21);

        log.info(user.toString());
        
        System.out.println(user.toString());

    }
}
