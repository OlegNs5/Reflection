package ro.ctrln.java.annotations;

import ro.ctrln.java.generics.GenericList;

import java.lang.reflect.Method;

public class BittnetAnnotationProcesor {
    public static void main(String[] args) {
        GenericList<String> allCategories = new GenericList<>();

        allCategories.addElement("programing");
        allCategories.addElement("networking");
        allCategories.addElement("web");

        System.out.println("Toate categoriile disponibile !");
        showGenericList(allCategories);
        trackCourseCategory(allCategories);
    }

    private static void trackCourseCategory(GenericList<String> allCategories) {
            GenericList<String> availableCategories = new GenericList<>();
            GenericList<String> newCategories = new GenericList<>();

            for (Method method : BittnetCourseFactory.class.getDeclaredMethods()){
                BittnetCourseAnnotation annotation = method.getAnnotation(BittnetCourseAnnotation.class);
                if (annotation != null){// testeaza daca intr-adevar are adnotarea BittnetCourseAnnotation
                    String category = annotation.category();
                    System.out.println("Catrgoria gasita este: " + category);
                    availableCategories.addElement(category);
                    if (!allCategories.contains(category)){
                        newCategories.addElement(category);
                    }
                }
            }
        System.out.println("Categorii disponibile gasite: ");
            showGenericList(availableCategories);
        System.out.println("Categorii noi gasite: ");
        showGenericList(newCategories);

    }


    private static void showGenericList(GenericList<String> genericList) {
        for (int i=0; i < genericList.getSize(); i++){
            System.out.println("\t" + genericList.getElement(i));
        }
    }
}
