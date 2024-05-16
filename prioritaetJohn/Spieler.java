package prioritaetJohn;

public class Spieler {
    private String name;
    int karma;

    public Spieler(String name) {
        this.name = name;
    }
    public void setName(String pName) {
        name = pName;
    }
    public String getName() {
        return name;
    }
}
