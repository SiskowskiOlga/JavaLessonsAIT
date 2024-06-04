package logging;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class Looginscheck {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Looginscheck.class);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 100 + 1);
            //теперь мы не пишем System.out.println(randomNumber);
            //а пишем
            LOGGER.info("Random number is " + randomNumber);
            if (randomNumber == 50){
              LOGGER.error("Random number is 50");
              throw  new RuntimeException("Random number is 50");
            }
        }
    }

}
