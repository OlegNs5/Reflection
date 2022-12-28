package ro.ctrln.java.generics;

import ro.ctrln.java.model.Person;
import ro.ctrln.java.model.Student;
import ro.ctrln.java.model.Teacher;

public class GenericListBoundUsage {
    public static void main(String[] args) {
        GenericListBound<Person> persons = new GenericListBound<Person>();
        GenericListBound<Student> students = new GenericListBound<Student>();
        GenericListBound<Teacher> teachers = new GenericListBound<Teacher>();

        persons.addElement(new Person());
        persons.addElement(new Student());
        persons.addElement(new Teacher());

        students.addElement(new Student());
//        students.addElement(new Person());
        teachers.addElement(new Teacher());


    }
}
