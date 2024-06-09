package homework39;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class CharacterCount {
    /*
     Чтение файла и подсчёт символов на Java
Цель задания: Написать программу на Java, которая использует FileInputStream для чтения текстового файла и
подсчитывает количество вхождений каждого символа.

Описание задания:

Создайте текстовый файл с некоторым содержимым. Например, файл может содержать простой текст,
такой как стихотворение или короткую статью.
Напишите программу, используя FileInputStream, которая открывает этот файл,
читает его содержимое по одному символу за раз и подсчитывает, сколько раз каждый символ встречается в тексте.
Выведите результаты в консоль в формате: символ и количество его вхождений.
Обработайте возможные исключения, такие как FileNotFoundException и IOException.
Пример вывода:

a - 15
b - 3
c - 7
     */
    public static void main(String[] args) {
        // Замените "input.txt" на путь к вашему файлу
        String filePath = "input.txt";
        Map<Character, Integer> charCountMap = new HashMap<>();//хранит количество вхождений каждого символа.

        try (FileInputStream fis = new FileInputStream(filePath)) {//используется для чтения файла.
            int character;
            while ((character = fis.read()) != -1) {
                char ch = (char) character;
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
                //Вывод результатов происходит через итерацию по Map.
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
