public class Employee extends Person {
    public String EmployeeId;
    public int Salary;

    public Employee(String name, int age, String employeeId, int salary) {
        super(name, age);
        EmployeeId = employeeId;
        Salary = salary;
    }

    @Override
    public void ShowDetails() {
        System.out.println("Employee Details");
        System.out.println("EmployeeID: " + EmployeeId);
        super.ShowDetails();
        System.out.println("Slary: " + Salary);
    }

    @Override
    public void Work() {
        System.out.println(Name + " is working as an Employee.");
    }
}
