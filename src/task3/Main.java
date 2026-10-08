package task3;

public class Main {
    public static void main(String[] args) {
        Department it = new Department("IT");

        Employee petrov = new Employee("Петров");
        Employee kozlov = new Employee("Козлов");
        Employee sidorov = new Employee("Сидоров");

        petrov.setDepartment(it);
        kozlov.setDepartment(it);
        sidorov.setDepartment(it);

        it.setHead(kozlov);

        // Вывод сотрудников (как в задании 2)
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println();

        // Новое: список всех сотрудников отдела через ссылку на сотрудника
        System.out.println("Сотрудники отдела " + it.getName() + ":");
        for (Employee e : petrov.getDepartment().getEmployees()) {
            System.out.println(e.getName());
        }
    }
}
