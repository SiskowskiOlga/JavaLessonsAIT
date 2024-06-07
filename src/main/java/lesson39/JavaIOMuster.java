package lesson39;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import lesson38.JavaTimeTasks;


public class JavaIOMuster {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOMuster.class);


    public static void main(String[] args) {


        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("mypasswords.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
                //LOGGER.info(new String(Character.toChars(data)));
                System.out.print(new String(Character.toChars(data)));
            }
        }
        catch (FileNotFoundException exception){
            LOGGER.error("File not found", exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error("I/O error", exception.getMessage());
        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                LOGGER.error("I/O error", e);
            }
        }

    }

}


