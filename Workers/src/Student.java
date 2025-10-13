public class Student extends Person {
    public String StudentId;
    public String Course;

    public Student(String name, int age, String studentId, String course) {
        super(name, age);
        StudentId = studentId;
        Course = course;
    }

    @Override
    public void ShowDetails(){
        System.out.println("StudentId: "+StudentId);
        super.ShowDetails();
        System.out.println("Course: "+Course);
    }

    public void Study(){
        System.out.println(Name+" is Studying "+Course+".");
    }
}
