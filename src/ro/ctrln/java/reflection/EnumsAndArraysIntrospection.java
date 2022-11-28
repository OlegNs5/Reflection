package ro.ctrln.java.reflection;

public class EnumsAndArraysIntrospection {

    enum Owners {PERSONS,COMPANY}

    public static void main(String[] args) {
        Class personClass = OwnerType.PERSON.getClass();
        System.out.println("Numele clasei OwnerType.PERSON este: " + personClass.getName());
        System.out.println("Numele clasei OwnerType.PERSON este: " + personClass.getCanonicalName());
        System.out.println("Numele clasei OwnerType.PERSON este: " + personClass.getSimpleName());

        Class personsClass = Owners.PERSONS.getClass();
        System.out.println("Numele clasei Owners.PERSONS(Name) este: " + personsClass.getName());
        System.out.println("Numele clasei Owners.PERSONS(CanonicalName) este: " + personsClass.getCanonicalName());
        System.out.println("Numele clasei Owners.PERSONS (SimpleName)este: " + personsClass.getSimpleName());

        int[] ints = new int[10];
        System.out.println("Numele vectorului 'ints' este: " +ints.getClass().getName());
        System.out.println("Numele vectorului 'ints' este: " +ints.getClass().getCanonicalName());
        System.out.println("Numele vectorului 'ints' este: " +ints.getClass().getSimpleName());

        Class doubleClass = double.class;
        double[] doublesClass = new double[10];
        System.out.println("Numele lui doubleClass(Name) este: "+doubleClass.getName());
        System.out.println("Numele lui doubleClass(CanonicalName) este: "+doubleClass.getCanonicalName());
        System.out.println("Numele lui doubleClass (SimpleName) este " + doubleClass.getSimpleName());

    }
}
