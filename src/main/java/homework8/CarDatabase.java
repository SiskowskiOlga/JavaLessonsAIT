package homework8;

import java.util.Scanner;

public class CarDatabase {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите марку автомобиля:");
        String carBrand = scanner.next().trim(); //трим срезает буквы
        System.out.println("Введите четырехзначный год выпуска:");
        String countryOfOriginal;
        String carInfo;
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int year = scanner.nextInt();
        switch (carBrand.toLowerCase()) {// лучше его применять toLowerCase  ===> переводит case в маленькие буквы и приводит в стандарт написания
            // carBrand.equalsIgnoreCase("Ford"){  ===> игнолирует как бы не написали слово
            case "ford":
                countryOfOriginal = "США";
                if (year > 1990) {
                    carInfo = "Огромные внедорожники, дешевый бензин";
                } else {
                    carInfo = "Эпоха гибридов, Tesla, ИИ в авто";
                }
                break;
            case "volvo":
                countryOfOriginal = "Швеция";
                carInfo = year > 2002 ? "Выход модели: XC 90" : "покупали модель S 60 "; // знак ? означает ===>
                break;
            default:
                countryOfOriginal = "не найдена";
                carInfo = "Нет информации";
                break;

        }
        printCarDate(countryOfOriginal, carInfo);
    }

    public static void printCarDate(String country, String info) {
        System.out.println("Страна производитель: " + country);
        System.out.println("Дополнительная информация: " + info);
    }
}
