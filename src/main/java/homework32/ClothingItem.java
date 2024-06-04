package homework32;

public class ClothingItem {
   /* Задание: Параметризированные тесты в JUnit по теме "Одежда"
    Описание:
    В этом задании вам предстоит создать параметризированные тесты для класса, который управляет коллекцией одежды. Вам нужно будет использовать JUnit для написания тестов и проверки корректности методов класса ClothingManager. Класс ClothingManager должен содержать методы для добавления, удаления и поиска одежды по различным параметрам.

            Требования:
    Создать класс ClothingItem:

    Поля:
    String name - название одежды
    String type - тип одежды (например, "Футболка", "Джинсы", "Куртка")
    String size - размер одежды (например, "S", "M", "L", "XL")
    double price - цена одежды
    Конструктор, геттеры и сеттеры
    Создать класс ClothingManager:

    Поля:
    List<ClothingItem> clothingItems - список одежды
    Методы:
    void addClothingItem(ClothingItem item) - добавляет одежду в коллекцию
    boolean removeClothingItem(String name) - удаляет одежду по названию и возвращает true, если удаление прошло успешно, иначе false
    List<ClothingItem> findClothingByType(String type) - возвращает список одежды по указанному типу
    List<ClothingItem> findClothingBySize(String size) - возвращает список одежды по указанному размеру
    ClothingItem findCheapestItem() - возвращает самый дешевый элемент одежды
    Создать параметризированные тесты с использованием JUnit 5:

    Написать тесты для проверки методов класса ClothingManager с различными параметрами.
    Использовать аннотации @ParameterizedTest, @ValueSource, @CsvSource и другие, чтобы проверить различные сценарии.

*/
    private String name;
    private String type;
    private String size;
    private double price;
    //созданы поля, конструктор, геттеры и сеттеры.

    public ClothingItem(String name, String type, String size, double price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}