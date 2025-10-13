public class Employee extends Person {
    public String EmployeeId;
    public int Salary;

    public Employee(String name, int age, String employeeId, int salary) {
        super(name, age);
        EmployeeId = employeeId;
        Salary = salary;
    }
}
