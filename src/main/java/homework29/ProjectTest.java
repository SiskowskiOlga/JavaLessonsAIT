package homework29;

public class ProjectTest {
    public static void main(String[] args) {
// Пример использования
        Employee employeeMichael = new Employee(1, "Michail", "Developer");
        Task task = new Task(1, "Intellij settings", "03.05.2024");
        //employeeMichael.addTask(task);

        Project project = new Project(1, "Banking App");//создали проект
        project.addTask(task);//добавили задание в проект
        project.addEmployee(employeeMichael);//добавили сотрудника
        employeeMichael.addTask(task);//передаем сотруднику задание
        System.out.println(project);


        //через геттер мы внесли вредоносное задание и оно осталось в моем хэшзэт,
        // если мы в коде не закрыли через new в коде, чтобы при запросе выдавало только новую копию,
        //без всякой основной информации.
        Task removeDoku = new Task(2,"Delete project doku","02.05.2024");

        project.getProjectTasks().put(removeDoku.getTaskId(),removeDoku);
        System.out.println(project);

        Employee badEmployee = new Employee(2,"Alex","haker");
        project.getProjectEmployees().put(badEmployee.getEmployeeId(),badEmployee);
        System.out.println(project);
    }
}







