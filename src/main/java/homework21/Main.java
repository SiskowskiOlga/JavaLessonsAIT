package homework21;
import java.util.HashSet;
public class Main {
    // метод фильтрация объектов недвижимости по типу
    public static HashSet<Property> filterByType(HashSet<Property> properties, String type) {
        HashSet<Property> filteredSet = new java.util.HashSet<>();
        for (Property property : properties) {
            if (property.type.equals(type)) {
                filteredSet.add(property);
            }
        }
        return filteredSet;
    }

    // Метод сравнения двух наборов объектов недвижимости
    public static HashSet<Property> compareSets(HashSet<Property> set1, HashSet<Property> set2) {
        HashSet<Property> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    //Создание HashSet и добавление объектов недвижимости
    public static void main(String[] args) {
        HashSet<Property> properties = new HashSet<>();
        properties.add(new Property("Адрес 1", "Квартира"));
        properties.add(new Property("Адрес 2", "Дом"));
        properties.add(new Property("Адрес 3", "Коммерческая недвижимость"));
        properties.add(new Property("Адрес 1", "Квартира")); // Дубликат

        System.out.println("HashSet содержит следующие объекты недвижимости:");
        for (Property property : properties) {
            System.out.println(property);

        }
        // фильтрируем по типу недвижимости
        HashSet<Property> filteredProperties = filterByType(properties, "Квартира");
        System.out.println("\nФильтрация по типу 'Квартира':");
        for (Property property : filteredProperties) {
            System.out.println(property);
        }
        //Сравнение двух наборов объектов недвижимости
        HashSet<Property> set1 = new HashSet<>();
        set1.add(new Property("Адрес 1", "Квартира"));
        set1.add(new Property("Адрес 2", "Дом"));

        HashSet<Property> set2 = new HashSet<>();
        set2.add(new Property("Адрес 2", "Дом"));
        set2.add(new Property("Адрес 3", "Коммерческая недвижимость"));

        HashSet<Property> difference = compareSets(set1, set2);
        System.out.println("\nРазница между двумя наборами недвижимости:");
        for (Property property : difference) {
            System.out.println(property);
        }
    }
}

