package konsultation;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerUtil {
    public static void main(String[] args) {
        for (int i = 0; i < 400; i++) {
            createFakeStudent();
        }

    }

    public static konsultation.FakerUtil.Student createFakeStudent() {
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

    public static class Student {
        private String firstname;
        private String secondname;
        private String address;
        private String phonenumber;

        //мышью правой кнопкой кликаем, выбераем Generate, Сonstructer


        public Student(String firstname, String secondname, String address, String phonenumber) {
            this.firstname = firstname;
            this.secondname = secondname;
            this.address = address;
            this.phonenumber = phonenumber;
        }

        //затем так же Getter
        public String getFirstname() {
            return firstname;
        }

        public String getSecondname() {
            return secondname;
        }

        public String getAddress() {
            return address;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public String toString() {
            return "Student{" + "firstname='" + firstname + '\'' + ", secondname='" + secondname + '\'' + ", address='" + address + '\'' + ", phonenumber='" + phonenumber + '\'' + '}';
        }
    }
}

