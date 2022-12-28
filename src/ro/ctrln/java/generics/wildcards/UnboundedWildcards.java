package ro.ctrln.java.generics.wildcards;

import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.model.Person;

public class UnboundedWildcards {

    public static void main(String[] args) {
        GenericList<?> persons = new GenericList<Person>();

//        persons.addElement(new Object());
    }
}
