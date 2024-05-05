package homework29;

import java.util.HashMap;

public class Project {
    private int projectId;
    private String name;

    //список задач и список сотрудников
    private HashMap<Integer, Task> projectTasks = new HashMap<>();
    private HashMap<Integer, Employee> projectEmployees = new HashMap<>();

    //конструктор создали пустой проект и вручную добавлять задания и сотрудников
    public Project(int projectId, String name) {
        this.projectId = projectId;
        this.name = name;

    }

    // Конструктор когда известен список заданий и известны сотрудники
    public Project(int projectId, String name, HashMap<Integer, Task> projectTasks, HashMap<Integer, Employee> projectEmployees) {
        this.projectId = projectId;
        this.name = name;
        this.projectTasks = projectTasks;
        this.projectEmployees = projectEmployees;
    }

    // Методы для добавления задач
    public void addTask(Task task) {
        projectTasks.put(task.getTaskId(), task);
    }

    // Методы для добавления сотрудников
    public void addEmployee(Employee employee) {
        projectEmployees.put(employee.getEmployeeId(), employee);
    }

    //метод для удаления задачи
    public void removeTask(int taskId) {
        projectTasks.remove(taskId);
    }

    //метод для удаления сотрудника
    public void removeEmployee(int employeeId) {
        projectEmployees.remove(employeeId);
    }

    //геттер и сеттер, убрав сеттер projectId, projectTask, projectEmployee чтоб не могли изменять информацию
    public int getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //мы возвращаем новый хэшмап и заполняем его тасками, человек не получит доступ к
//нашему хэшмепу основному, мы возвращаем копию, тем самым защищаем оригинал списка
    public HashMap<Integer, Task> getProjectTasks() {
        return new HashMap<>(projectTasks);//всегда возвращать копии, а не оригинал
    }

    public HashMap<Integer, Employee> getProjectEmployees() {
        return new HashMap<>(projectEmployees);
    }

    //выводит информацию
    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", projectTasks=" + projectTasks +
                ", projectEmployees=" + projectEmployees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project projectEmployees)) return false;
        return getProjectEmployees() == projectEmployees.getProjectEmployees();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(projectId, name, projectTasks, projectEmployees);
    }
}