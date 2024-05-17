package prioritaetJohn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Erzaehler {
    int counter = 1;
    Scanner scanDecision = new Scanner(System.in);
    public void entscheidungTreffen ( String pDecision)throws FileNotFoundException{
        if(pDecision.equals("a")){
            String file = "EntscheidungenA/" + counter + pDecision + ".csv";
            Scanner scanner = new Scanner(new File(file));
            scanner.useDelimiter(";");
            while(scanner.hasNext()){
                System.out.print(scanner.next());
            }
        }else if (pDecision.equals("b")){
            String file = "EntscheidungenB/" + counter + pDecision+ ".csv";
            Scanner scanner = new Scanner(new File(file));
            scanner.useDelimiter(";");
            while(scanner.hasNext()){
                System.out.print(scanner.next());
            }
        }else{

        }

    }
}
