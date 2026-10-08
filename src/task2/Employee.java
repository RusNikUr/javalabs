package task2;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department == null) {
            return name;
        }

        if (department.getHead() == this) {
            return name + " начальник отдела " + department.getName();
        }

        return name + " работает в отделе " + department.getName()
                + ", начальник которого " + department.getHead().getName();
    }
}
