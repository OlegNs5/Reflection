package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;
import ro.ctrln.java.inheritance.ImperialStarDestroyer;

public class ClassesInClasses {
    public static void main(String[] args) {
        System.out.println("Parintele ImperialStarDistroyer este: " + ImperialStarDestroyer.class.getSuperclass().getSimpleName());

        for (Class<?> characterClass : Character.class.getClasses()){
            System.out.println("\tClasele sunt: " + characterClass);
        }
        for (Class<?> battleshipInnerClass: Battleship.class.getDeclaredClasses()) {//cu .getDeclaredClasses putem vedea clasele private,publice si protected
            System.out.println("Clasele privata intetioare de la Battleship sunt: " + battleshipInnerClass );
        }
        System.out.println("Clasa in care este difinita escapePod este: " + Battleship.EscapePod.class.getEnclosingClass().getSimpleName());

        for (Class<?>  aClass : Battleship.class.getDeclaredClasses()){
            System.out.println("Enclosing class for aClass: "+ aClass.getSimpleName() + " " + "\tis:\t" +aClass.getEnclosingClass().getSimpleName());
        }
    }
}
