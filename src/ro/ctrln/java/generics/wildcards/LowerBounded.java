package ro.ctrln.java.generics.wildcards;

import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.model.Person;
import ro.ctrln.java.model.Student;
import ro.ctrln.java.model.Teacher;

public class LowerBounded {
    public static void main(String[] args) {
        GenericList<? super Student> students = new GenericList<Person>();
        GenericList<? super Teacher> teachers= new GenericList<Person>();
        GenericList<? super Person> persons = new GenericList<>();

        students.addElement(new Student("James","Franklin",23));
        teachers.addElement(new Teacher("Jimmy", "Reynolds",41));
//        teachers.addElement(new Person("Jimmy", "Reynolds",41,"Teacher"));

        //Putem adauga obiecte din clase copii pentru clasa Person sau din clasa Person
        persons.addElement(new Person());
        persons.addElement(new Student());
        persons.addElement(new Teacher());

//        Person personFromLists = persons.getElement(0);
        Object personFromList = persons.getElement(0);

    }
}
