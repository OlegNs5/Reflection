package ro.ctrln.java.reflection;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.abstraction.Trooper;
import ro.ctrln.java.inheritance.Starship;
import ro.ctrln.java.inner.OuterClass;

import java.lang.reflect.Modifier;

public class ClassAccessModifiers {
    public static void main(String[] args) {
        System.out.println("Modificatorii de acces pentru classa GenericList sunt: "+ Modifier.toString(GenericList.class.getModifiers()));
        System.out.println("Modificatorii de acces pentru interfata Starship sunt: "+ Modifier.toString(Starship.class.getModifiers()));
        System.out.println("Modificatorii de acces pentru clasa Trooper sunt: "+ Modifier.toString(Trooper.class.getModifiers()));
        System.out.println("Modificatorii de acces pentru clasa String sunt: "+ Modifier.toString(String.class.getModifiers()));
        System.out.println("Modificatorii de acces pentru clasa interioara sunt: "+ InnerClass.class.getDeclaredClasses());


    }
}
