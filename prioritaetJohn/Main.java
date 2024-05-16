package prioritaetJohn;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /* Die Klasse Scanner kann neben der Eingabe von Nutzern auch Texte aus Datein einlesen hier z.B. die Datei
         Intro in dem Ordner Textes mit den Namen Intro.csv.
         */
        Textgeber textgeber = new Textgeber();

        textgeber.gibText("Texts/Storyparts.csv");

        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1: System.out.println("1");
            break;
            case 2: System.out.println("2");
            break;
            default:System.out.println("Error");
            break;
        }

    }
}