package ro.ctrln.java.generics.wildcards;

import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.model.Person;
import ro.ctrln.java.model.Student;
import ro.ctrln.java.model.Teacher;

public class UpperBounded {
    public static void main(String[] args) {
        GenericList<? extends Person> persons =new GenericList<>();
        GenericList<? extends Person> students =new GenericList<Student>();
        GenericList<? extends Person> Teachers =new GenericList<Teacher>();

        students = getStudent();

        for (int i = 0; i< students.getSize();i++){
            Student student = (Student) students.getElement(i);
            System.out.println(student);
        }
//        persons.addElement(new Person("Joe","Doe",49,"engineer"));//wild (GenericList<? extends Person>) card il limiteaza
//        students.addElement(new Student("John","Sanders",23));//si aicea vedem ca wild ne limiteaza

        Person person = persons.getElement(0);
        Student student = (Student) students.getElement(0);//merge sa luam elementele din Student doar ca trebuie sa facem cast
    }

    private static GenericList<Student> getStudent() {
        GenericList<Student> students =new GenericList<Student>();
        students.addElement(new Student("John","Sanders",23));
        students.addElement(new Student("Emily","Blunt",25));
        students.addElement(new Student("Eliza","Jones",18));
        students.addElement(new Student("Ben","Franklin",30));

        return students;
    }
}
