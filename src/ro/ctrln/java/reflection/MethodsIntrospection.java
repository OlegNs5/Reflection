package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;

import java.lang.reflect.*;
import java.security.Policy;

public class MethodsIntrospection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Battleship battleship = new Battleship();

        System.out.println("Methodele din clasa battleship: ");
        for (Method method : Battleship.class.getDeclaredMethods()) {
//            System.out.println("\tnumele metodei: " + method.getName() + " ARE modificatorii de access: "+ Modifier.toString(method.getModifiers()));
        }
        Method setBattleshipNameMethod = battleship.getClass().getMethod("setBattleshipName",String.class);

//        System.out.println(setBattleshipNameMethod.getParameters());
        for (Parameter parameter : setBattleshipNameMethod.getParameters()){
            System.out.println("\tNume parametru= "+  parameter.getName() + ", Tipul parametrului= " + parameter.getType()+";");
        }
        battleship.setBattleshipName("InitialName");
        System.out.println("Numele initial al BattleShip este: "+battleship.getBattleshipName());

        setBattleshipNameMethod.invoke(battleship, "Nume cu reflection API");
        System.out.println(battleship.getBattleshipName());
    }
}
