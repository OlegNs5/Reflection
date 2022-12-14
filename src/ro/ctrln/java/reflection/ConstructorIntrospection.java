package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ConstructorIntrospection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (Constructor constructor : Battleship.class.getConstructors()) {
            System.out.println("Contructorii din Battleship sunt: " + constructor);
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\tParameter - name: " + parameter.getName() + ", de tipul, " + parameter.getType() + ".");
            }
        }
        Constructor<Battleship> battleshipConstructor = Battleship.class.getConstructor(String.class, int.class);

        Battleship battleship = battleshipConstructor.newInstance("TieFighter", 1000);
        System.out.println("Instantierea unui obiect cu Reflection API"+ battleship);

        Battleship battleship1 = battleship.getClass().newInstance();
        Battleship battleship2 = Battleship.class.newInstance();
        System.out.println(battleship1);
        System.out.println(battleship2);
    }
}
