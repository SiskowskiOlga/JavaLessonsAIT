package lesson10;
import  java.util.Scanner;
public class FileExtension {
    /*
    написать программу которая принимает на вход расширения файла.
    например: pdf, docx, jpg и выводит тип файла(документ, изображение, т д).
    используйте switch-case для обработки разных расширения
     */
    static Scanner scanner = new Scanner(System.in);
    public  static void main(String[]args){

        System.out.println("Введите расширение файла (например pdf, docx, jpg: ");
        String file = scanner.next().toLowerCase();
        String fileTyp = switch (file){
            case "pdf" ->" Dokument (PDF)";
                case "docx" -> "Документ (Word)";
                case "jpg" -> "Изображение (JPG)";
            default -> "Неизвестный тип файла";
        };
        System.out.println("Тип файла для расширения. " + file + ":" + fileTyp);
    }
}
