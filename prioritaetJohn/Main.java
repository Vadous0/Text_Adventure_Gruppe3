package prioritaetJohn;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /* Die Klasse Scanner kann neben der Eingabe von Nutzern auch Texte aus Datein einlesen hier z.B. die Datei
         Intro in dem Ordner Textes mit den Namen Intro.csv.
         */
        Textgeber textgeber = new Textgeber();

        textgeber.gibText("Texts/Storyparts.csv");

    }
}