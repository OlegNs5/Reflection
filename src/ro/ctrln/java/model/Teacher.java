package ro.ctrln.java.model;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String firstName, String lastName, int age, String job) {
        super(firstName, lastName, age, job);
    }
    public Teacher(String firstName, String lastName, int age) {
        super(firstName, lastName, age, "teacher");
    }

    @Override
    public String toString() {
        return "Teache{firstName: "+ getFirstName() + ", lastName: " + getLastName()+ ", age: "+ getAge()+ ", job: "+ getJob()+"}";
    }
}
