package prioritaetJohn;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        NPC kevin = new NPC("kevin");
        NPC ian = new NPC("Ian");
        NPC jost = new NPC("Jost");

        System.out.println("Gebe deinen Namen an:");
        Spieler spieler = new Spieler(scanner.next());


    }
}