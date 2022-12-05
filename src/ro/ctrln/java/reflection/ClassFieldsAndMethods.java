package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.ImperialStarDestroyer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassFieldsAndMethods {
    public static void main(String[] args) {
        System.out.println("Pachetul clasei ImperialStarDestroyer este: " + ImperialStarDestroyer.class.getPackage());

        System.out.println("Proprietatile declarate din clasa ImperialStarDestroyer sunt:");
        for (Field field : ImperialStarDestroyer.class.getDeclaredFields()) {
            System.out.println("\tfield: " + field.getName());
        }
        System.out.println("Proprietatile publice din clasa ImperialStarDestroyer sunt:");
        for (Field field : ImperialStarDestroyer.class.getFields()) {
            System.out.println("\tfield: " + field.getName());
        }
        System.out.println("Metodele definite din ImperialStarDestroyer sunt:");
        for (Method method : ImperialStarDestroyer.class.getDeclaredMethods()) {
            System.out.println("\tmethods: " + method.getName());
        }
        System.out.println("Metodele definite din ImperialStarDestroyer si din Battleship sunt:");
        for (Method method : ImperialStarDestroyer.class.getMethods()) {
            System.out.println("\tmethods: " + method.getName());
        }
    }
}
