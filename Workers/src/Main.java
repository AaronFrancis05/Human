public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Maxwell John",45,"Emp01",500000);
        emp1.ShowDetails();
        emp1.Work();

        System.out.println();
        Manager Mg1 = new Manager("Ssetuba Ian",50,"Emp02",1000000,"Sales");
        Mg1.ShowDetails();
        Mg1.Work();
        Mg1.ConductMeetings();

        System.out.println();
        Student Std1 = new Student("Darren Fletcher",35,"Std01","BSSE");
        Std1.ShowDetails();
        Std1.Study();
    }
}
