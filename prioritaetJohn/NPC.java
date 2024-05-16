package prioritaetJohn;

public class NPC {
    private String name;
    private boolean gerettet;
    private boolean lebend;

    public NPC(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isGerettet() {
        return gerettet;
    }
    public void setGerettet() {
        gerettet = true;
    }

    public void setLebend(boolean lebend) {
        this.lebend = lebend;
    }

    public boolean isLebend() {
        return lebend;
    }
}
