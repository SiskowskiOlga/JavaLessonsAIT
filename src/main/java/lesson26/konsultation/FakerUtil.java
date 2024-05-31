package lesson26.konsultation;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerUtil {
    // составляем фыйковый список, например информацию про людей

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { //4 это сколько фейковых списков сделать
            createFakeStudent();
        }

    }

    public static Student createFakeStudent() {
        Faker faker = new Faker(new Locale("de-De"));
        String firstname = faker.name().firstName();
        String secondname = faker.name().lastName();
        String address = faker.address().fullAddress();
        String phonenumber = faker.phoneNumber().phoneNumber();

        Student studentOne = new Student(firstname, secondname, address, phonenumber);
        System.out.println(studentOne.toString());
        System.out.println(faker.funnyName().name());

        return studentOne;

    }
}




