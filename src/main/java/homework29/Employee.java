package homework29;
import java.util.HashMap;
import java.util.Objects;
public class Employee {
    private int employeeId;
    private String name;
    private String position;

    //у сотрудника есть список задач, мы их оформляем HashMap
    private HashMap<Integer, Task> employeeTask = new HashMap<>();


    // Конструктор

    public Employee(int employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;

    }

    // Методы для работы с задачами добавлять и удалять
    public void addTask(Task task) {
        employeeTask.put(task.getTaskId(),task);
    }

    public void removeTask(int taskId) {
        employeeTask.remove(taskId);

    }
    //метод вывода информации через toString
    public void displayEmployeeInfo(){
      System.out.println(toString());

    }

    // Геттеры и сеттеры

    public int getEmployeeId() {
        return employeeId;
    }

   //сеттер employeeId убираем, чтобы его не изменяли

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public HashMap<Integer, Task> getEmployeeTask() {
        return employeeTask;
    }

   //сеттер под задачи тоже не нужен

    //чтоб при необходимости можно было вызвать информацию

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", employeeTask=" + employeeTask +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmployeeId() == employee.getEmployeeId() ;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEmployeeId());
    }
}


