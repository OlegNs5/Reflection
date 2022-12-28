package ro.ctrln.java.model;

public class Student extends Person {

    public Student() {}

    public Student(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Student(firstName: " + getFirstName() + ", lastName: " + getLastName() + ", age: " + getAge() + "}";
    }
}
