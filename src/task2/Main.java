package task2;

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

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }
}
