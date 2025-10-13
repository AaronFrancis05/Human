public class Student extends Person {
    public String StudentId;
    public String Course;

    public Student(String name, int age, String studentId, String course) {
        super(name, age);
        StudentId = studentId;
        Course = course;
    }
}
