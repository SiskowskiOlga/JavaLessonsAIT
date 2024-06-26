package homework28;
/*
Задача: Создание модели данных для галереи

Цель: Разработать систему классов и интерфейсов на языке Java для управления коллекцией, отображающую искусство в галерее.

Описание задания:

ИнтерфейсArtwork : Этот интерфейс должен определять базовые методы, которые должны быть реализованы в каждом произведении искусства. Методы включают:

displayInfo(): Выводит информацию о производстве искусства.
getCreator(): Возвращает имя создателя произведения.
Классы проявления искусства :

Painting: Класс, реализующий интерфейс Artwork. Должен оставить дополнительные поля, такие как краски (масляная, акварель и т.д.) и размерные изображения.
Sculpture: Класс, реализующий интерфейс Artwork. Должен хранить материальные скульптуры (бронза, мрамор и т.д.) и вес.
КлассArtGallery :

Этот класс должен управлять коллекцией живого искусства. Должен иметь методы для удаления, удаления и восстановления произведений искусства по тем или иным критериям (например, по имени художника).
Дополнительная функция :

Реализовать метод displayAllArtworks()в классе ArtGallery, который выводит информацию обо всех произведениях искусства в галерее.
Добавьте возможность фильтрации по типу (картины, скульптуры).
Задание:

Создайте все классы и интерфейсы в соответствии с описанием.
Демонстрационный класс должен создавать экземпляры ArtGallery, создающие в нем несколько экземпляров искусства, а затем выводить о них информацию.

 */
public interface Artwork {
    // Создаем интерфейс для определения базовых методов.
    // 1. метод для информации о произведении искусства.
    // 2. метод для получения имени кто произвел.
    void displayInfo();
    String getCreator();
}
