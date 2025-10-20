public class Manager extends Employee {
    public String Department;

    public Manager(String name, int age, String employeeId, int salary, String department) {
        super(name, age, employeeId, salary);
        Department = department;
    }

    @Override
    public void ShowDetails() {
        super.ShowDetails();
        System.out.println("Department: " + Department);
    }

    public void ConductMeetings() {
        System.out.println(Name + " is conducting a meeting in the " + Department + " department");
    }
}
