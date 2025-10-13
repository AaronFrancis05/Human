public class Person {
    public String Name;
    public int Age;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public void ShowDetails() {
        System.out.println("Name " + Name);
        System.out.println("Age " + Age);
    }

    public void Work() {
        System.out.println(Name + " " + "is doing some work");
    }
}
