package homework6;
// напечатать в консоле парные числа четные от 1 до 20
public class Main {
    public  static void main(String[]args){

        // mit While
        int i = 2;
        while (i<=20){
            if (i % 2 == 0){
                System.out.println(i+" ");
            }
            i++;
        }

        System.out.println(" ");

        // mit for
        for (i =1; i <=20; i++){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            }
        // mit do while
        i = 1;
        do {
            if (i % 2 == 0){
                System.out.println(i +" ");
            }
            i++;

        }while (i <= 20);

}

    }

