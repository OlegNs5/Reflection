package ro.ctrln.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BittnetRegularExpresion {
    public static void main(String[] args) {

//        String regex = "[^spl]at";//negarea [^spl]at//daca corespunde [spl]at
//        String input = "sat";
        String regex = "87\\d{8}+$";//putem testa un numar de telefon sa nu depaseasca 8 cifre($ end of line)
        String input = "8712345678";

        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(input);

        if (matcher.find()){
            System.out.println("Match success " + matcher.start() + " " + matcher.end());
        }else {
            System.out.println("No Match");
        }
    }
}
