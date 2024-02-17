package lesson05;

public class Operators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 10;
        //оператор равенства ---> ==
        boolean isEqual = (numberOne == numberTwo);
        System.out.println(isEqual);

        int numberTree = 50;
        int numberFour = 60;

        //оператор неравенства ---> !=
        System.out.println(numberTree!=numberFour);

        //оператор больше --->  >
        System.out.println(numberTree>numberFour);




        //оператор меньше ---->  <
        System.out.println(numberTree<numberFour);

        //оператор больше или равно--->  >=
        System.out.println(numberOne>=numberTwo);

        //оператор меньше или равно---> <=
        System.out.println(numberOne<=numberTwo);

        //сравнение строки ---> .equals
        String nameOne = "Mustermann";
        String nameTwo = "Musterman";
        System.out.println(nameOne.equals(nameTwo));
        // вариант написания
        boolean isEqualNameOneNameTwo = nameOne.equals(nameTwo);
        System.out.println(isEqualNameOneNameTwo);

        // условный оператор ---> if / else
        int age = 20;
        int salary = 10000;
        boolean hasPass = true;
        boolean hasCredit;
        //bank1
        if (age>=21 && salary>2000 && hasPass==true){
            System.out.println("Positiv");
            hasCredit = true;
        }
        else {
            System.out.println("Negative");
            hasCredit = false;
        }
        System.out.println("Credit:" + hasCredit);
        //bank2
        if(age>=21|| salary>3000)
        {
            hasCredit = true;
        }else {
            hasCredit = false;
        }
        System.out.println("Credit2: "+hasCredit);

        /*
         &&
        false false ==> false
        false true ==> false
        true false ==> false
        true true ==> true

         ||
         false false ==> false
         false true ==> true
         true false ==> true
         true true ==> true

         */

        int numberA = 40;
        int numberB = 20;
        boolean checkResault = false;
        if (numberA>10|| numberB>15){ //false||true -->true
            checkResault = true;
        }
        if (numberA>10 && numberB>15) //false && true -->false
            checkResault = false;
        /* условия при всех true
            мы присвоили переменной = false.*/
        System.out.println("checkResault-->"+ checkResault);

        double accountBalance = 2000000.0;
        boolean accountActive = false;
        double amoundWithdraw = 6000.0;
        boolean transactionSuccess = false;
        //fals                                                 ||true

        if (accountActive && accountBalance>=amoundWithdraw || accountBalance>=1000000) {
            accountBalance = accountBalance - amoundWithdraw; //переписали значения баланса
            transactionSuccess = true;
            System.out.println("Transaction: " + transactionSuccess + "Balance: " + accountBalance);
        }
           else {
               System.out.println("ERROR!!!" + transactionSuccess);

        }

    }
}