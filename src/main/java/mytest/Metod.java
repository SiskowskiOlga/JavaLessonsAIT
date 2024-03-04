package mytest;
import java.util.Scanner;
public class Metod {
    public static void main(String[]args){
        //тип данных что лежит в этих переменных
        //именно массив String[]
        String[]users = {"Anna", "Emil","Sofia","Nick"};// объявили массив с 4я элементами/ размер памяти

        printArray(users);
        //System.out.println("task is finisch");

        String name = inputName();
        System.out.println(name + (checkName(users,name)? " es gibst" : "es gibst nict"));
    }
    public static String inputName(){
        System.out.println("Input name for checking: ");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }

    public static void printArray(String[]users){
        for (int i = 0; i < users.length; i++){   //перебираем строку
            System.out.print(i + "-" + users[i] + " ");
        }
        System.out.println();
    }
    public static boolean checkName(String[]array, String name){

        for (int i = 0; i< array.length; i++){// перебираем строку элементов
            if (array[i].equals(name)){// сравниваем строчки элементов
                return true; //если есть то уходим
            }
        }
        return false;
    }
}
