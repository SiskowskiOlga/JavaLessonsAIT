package homework27;

public class Employee {
    /*
    Задание: Разработка и рефакторинг системы руководителя
Цель задания
Ваша задача — создать систему управления информацией о сотрудниках компании с использованием прекращения инкапсуляции.
Система обеспечивает безопасный доступ к данным сотрудников, позволяет регистрировать,
обновлять и извлекать информацию о каждом сотруднике.

Описание системы
Система должна состоять из следующих компонентов:

КлассEmployee :

Атрибуты :
employeeId(int) — уникальный идентификатор сотрудника.
name(String) — имя сотрудника.
department(Строка) — отдел, в котором работает сотрудник.
salary(двойной) — заработная плата сотрудника.
Методы:
Конструктор для создания всех атрибутов.
Геттеры и сеттеры для всех атрибутов,
при этом сеттер employeeId должен предотвратить изменение ID после его первоначальной установки.
Метод displayInfo(), который выводит информацию о сотруднике.
Класс EmployeeManager :

Атрибуты :
employees(Список) — список всех сотрудников.
Методы:
addEmployee(Employee employee)— добавление нового сотрудника в систему,
при этом ранее, что сотрудник с таким ID ещё не зарегистрирован.
updateEmployee(int employeeId, String name, String department, double salary)— обновляет данные сотрудника.
removeEmployee(int employeeId)— восстановлен сотрудник по ID.
findEmployeeById(int employeeId)— возвращает сотруднику его удостоверение личности.
displayAllEmployees()— выводит информацию обо всех сотрудниках.
Задачи
Разработка:

Реализуйте класс Employee с наклейками полей, методов и инкапсуляции.
Создать класс EmployeeManager, который будет управлять списком сотрудников с использованием коллекций.
Рефакторинг и инкапсуляция:

Убедитесь, что все аспекты управления данными сотрудников защищены и инкапсулированы.
Проверьте, что классы корректно обрабатывают ошибочные сценарии,
такие как попытка добавления сотрудника с уже существующим идентификатором.
Тестирование:

Напишите несколько тестовых случаев с использованием JUnit или другого программного обеспечения для тестирования на Java,
чтобы проверить работоспособность вашей системы.
     */
    private final int employeeId;
    private String name;
    private String department;
    private double salary;

    //создаем конструктор позволяет задавать данные нового сотрудника

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {

        return employeeId;
    }
    public String getName() {

        return name;
    }public void setName(String name) {

        this.name = name;
    }
    public String getDepartment() {return department;
    }
    public void setDepartment(String department) {this.department = department;
    }
    public double getSalary() {return salary;
    }public void setSalary(double salary) {
        this.salary = salary;
    }
    public String displayInfo() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department +
                '}';
    }

}
