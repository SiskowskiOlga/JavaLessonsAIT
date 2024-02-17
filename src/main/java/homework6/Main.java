package homework6;
// напечатать в консоле парные числа четные от 1 до 20
public class Main {
    public  static void main(String[]args){
        int odd = 2;
        while (odd<20){
            if (odd % 2 == 0){
                System.out.println(odd);
            }
            odd = odd+2;
        }

        System.out.println("---2-----");

        odd = 2;
        while (odd<=20){
            System.out.println(odd);
        odd = odd+2;
    }

        System.out.println("---3----");

        for (int i = 2; i<=20; i = i+2){
            System.out.println(i);

        }

}

    }

