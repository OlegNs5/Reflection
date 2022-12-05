package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.FalconHeavy;

import java.lang.reflect.Type;

public class ClassInterfaces {
    public static void main(String[] args) {
        for (Type interfaceImplemented : FalconHeavy.class.getGenericInterfaces()){
            System.out.println("Interfetele implimentate in FalconHeavy sunt: " + interfaceImplemented);
        }
    }
}
