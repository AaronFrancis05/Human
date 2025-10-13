public class Manager extends Employee {
    public String Department;

    public Manager(String name, int age, String employeeId, int salary, String department) {
        super(name, age, employeeId, salary);
        Department = department;
    }
}
