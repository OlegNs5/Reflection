package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;

public class ClassIntrospection {
    public static void main(String[] args) {
      Class<Battleship> battleshipOne = Battleship.class;
      Class battleshipTwo = new Battleship().getClass();

        System.out.println("battleshipOne - Numele clasei este: " + battleshipOne.getSimpleName());
        System.out.println("battleshipOne - Numele clasei (canonice) este: " + battleshipOne.getCanonicalName());
        System.out.println("battleshipOne - Numele clasei (canonice) este: " + battleshipOne.getName());//.getCanonicName este = .getName

    }

}
