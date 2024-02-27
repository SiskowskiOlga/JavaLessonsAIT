package homework8;

public class LoopFor {
    public static void main (String[]args){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        for (int i = 20; i > 0; i = i -2){
            System.out.println(i);
        }
        int i = 0, y = 10;
        for (; i < 10 && y > 0; i++, y--){
            System.out.println(i + "" + y);
        }
    }
}
