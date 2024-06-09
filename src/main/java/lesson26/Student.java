package lesson26;

public class Student {

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

