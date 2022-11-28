package ro.ctrln.java.reflection;

public class TypeFieldWrappers {
     public static void main(String[] args) {
          Class<Double> doubleClass = Double.TYPE;

          System.out.println("Numele doubleClass (Name) este :" + doubleClass.getName());
          System.out.println("Numele doubleClass (CanonicalName) este :" + doubleClass.getCanonicalName());
          System.out.println("Numele doubleClass (SimpleName) este :" + doubleClass.getSimpleName());

     }
}
