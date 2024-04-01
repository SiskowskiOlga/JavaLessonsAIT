package homework21;
import java.util.HashSet;
/*
Задача 1: Уникальные объекты недвижимости
Цель: Написать программу, которая будет использоваться HashSet для хранения уникальных объектов недвижимости.
Каждый объект недвижимости должен быть представлен классом Property,
содержать как минимум два поля: address(адрес) и type(тип, например, квартира, дом, коммерческая недвижимость).

Задачи:

Создать класс Property с полями address и type.
Реализовать hashCode и equals обеспечить уникальность объектов Property на HashSetоснове их адресов и типов.
Создайте HashSet и добавьте в него несколько объектов недвижимости, включая дубликаты.
Выведите требование HashSet на экране, чтобы заметить, что дубликаты были постепенно исключены.
Задача 2: Фильтрация по типу недвижимости
Цель: вызвать HashSet метод write, который фильтрует набор объектов недвижимости по заданному типу и возвращает новый HashSetс объектами указанного типа.

Задачи:

Используйте класс Property из задач 1.
Написать метод filterByType, который принимает HashSet<Property>и String typeвозвращает HashSet<Property>, включает только объекты недвижимости заданного типа.
Про исходный метод работы filterByType, созданный HashSetс помощью различных типов недвижимости и вывода результатов фильтра.
Задача 3: Сравнение наборов недвижимости
Цель: Написать программу, которая включает в себя два HashSetобъекта недвижимости и определяет, какие объекты представлены в первом наборе, но отсутствуют во втором.

Задачи:

Используйте класс Property из задач 1.
Создайте два HashSet<Property>объекта недвижимости с разными объектами.
Напишите метод compareSets, который принимает два HashSet <Property> и возвращает HashSet<Property>, последовательно объекты, которые есть в первом наборе, но отсутствуют во втором.
О переходе к методу работы compareSets выведите результат на экран.
 */
public class Property {
    //создала класс и объекты недвижимости
    private String address;
    String type;
    public Property(String address, String type){
        this.address = address;
        this.type = type;
    }
// Переопределение методов hashCode и equals для обеспечения уникальности объектов Property в HashSet
    public int hashCode(){
        return address.hashCode()+ type.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass()!= obj.getClass())return false;
        Property property = (Property) obj;
        return address.equals(property.address)&& type.equals(property.type);

    }
    public String toString(){
        return "Property{" + "address='" + address + '\'' + ", type='" + type + '\'' + '}';

    }
}
