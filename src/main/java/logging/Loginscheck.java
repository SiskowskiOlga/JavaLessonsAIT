package logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loginscheck {
    private static final Logger LOGGER = LoggerFactory.getLogger(Loginscheck.class);


    public static void main(String[] args) {
        for(int i = 0;  i < 1000000; i++){
            int randomNumber = (int) (Math.random() * 100) + 1;
            //System.out.println(randomNumber);
            LOGGER.debug("Random number is " + randomNumber);
            if(randomNumber == 50){
                LOGGER.error("Random number is 50");
            }
        }
    }

}
