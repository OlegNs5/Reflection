package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.ImperialStarDestroyer;

import java.lang.reflect.Constructor;

public class ClassContructors {
    public static void main(String[] args) {
        System.out.println("Contructorii declarati clasei ImperialStarDestroyer sunt:");
        for (Constructor constructor : ImperialStarDestroyer.class.getDeclaredConstructors()){
            System.out.println("\tconstructors: "+constructor);
        }
        System.out.println("Contructorii publici clasei ImperialStarDestroyer sunt:");
        for (Constructor constructor : ImperialStarDestroyer.class.getConstructors()){
            System.out.println("\tconstructors: "+constructor);
        }
    }
}
