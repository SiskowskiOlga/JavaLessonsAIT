package lesson28;
/*
Создайте класс `Person` с защищенным атрибутом `name` и методом `display()`,
который выводит имя. Создайте класс `Student`, который наследует `Person`,
добавляет новый атрибут `studentId` и переопределяет `display()` для показа `name` и `studentId`.
 */

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }


    public void display() {
        System.out.println("Name: " + name);
    }
}
