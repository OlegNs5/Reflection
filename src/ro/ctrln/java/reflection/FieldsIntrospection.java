package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.ImperialStarDestroyer;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldsIntrospection {

    public String property = "John";      //Exercitiu cu API Reflection cu o valoare declarata publica//
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        FieldsIntrospection fieldsIntrospection = new FieldsIntrospection();

        Field propertyField = FieldsIntrospection.class.getField("property");

        System.out.println("Modificatorul de acces pentru property este: " + Modifier.toString(propertyField.getModifiers()));
        System.out.println("Tipul de data pentru property este: " + propertyField.getType().getName());

        System.out.println("Valoarea initiala pentru property este: "+fieldsIntrospection.property);
        propertyField.set(fieldsIntrospection, "Lisa");
        System.out.println("Setarea valorii property API Reflection: " + fieldsIntrospection.property );
        try {
            propertyField.set(fieldsIntrospection, 100); // In cazul in care nu transmitem un String arunca o exceptie care trebuie tratata cu try{}catch
        } catch (IllegalArgumentException e) {
            System.out.println("Avem o exceptie IllegalArgementException");
        }
        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        System.out.println("Valoarea initiala numberOfDecks este: " + imperialStarDestroyer.getNumberOfDecks());

                            //Exercitiu cu API Reflection cu o valoare declarata privata//

        Field numberOfDecksField = ImperialStarDestroyer.class.getDeclaredField("numberOfDecks");

        numberOfDecksField.setAccessible(true);
        numberOfDecksField.set(imperialStarDestroyer, 100);
        System.out.println("Valoarea numberOfDecks dupa setarea cu Reflection API este: " + imperialStarDestroyer.getNumberOfDecks());

        imperialStarDestroyer.setNumberOfDecks(101);
        System.out.println("Valoarea numberOfDecks dupa setarea cu setter este: " + imperialStarDestroyer.getNumberOfDecks());

    }
}
