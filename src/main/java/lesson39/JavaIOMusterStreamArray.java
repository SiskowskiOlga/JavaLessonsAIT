package lesson39;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOMusterStreamArray {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOMusterStreamArray.class);

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("mypasswords.txt")){
            byte[] data = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(data)) != -1){
                String text = new String(data, 0, bytesRead);
                System.out.print(text);
            }
        }
        catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }
    }

}
