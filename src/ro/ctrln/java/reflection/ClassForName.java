package ro.ctrln.java.reflection;

public class ClassForName {
    public static void main(String[] args) {

        String canonicalName = "ro.ctrln.java.util.ProjectUtils";

        try {
            Class falconHeavy = Class.forName(canonicalName);
            System.out.println("Numele lui falconHeavy (Name) este :"+falconHeavy.getName());
            System.out.println("Numele lui falconHeavy (CanonicalName) este :"+falconHeavy.getCanonicalName());
            System.out.println("Numele lui falconHeavy (SimpleName) este :"+falconHeavy.getSimpleName());

        } catch (ClassNotFoundException e) {
            System.out.println("Clasa " +canonicalName+ " negasita ! ");
        }
    }
}
