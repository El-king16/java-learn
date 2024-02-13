package pack1;

public class King extends Hero{

    private int kazna;
    public King(String type, int hp, String skill, int damage, int gold) {
        super(type, hp, skill, damage, gold);
    }

    public int getKazna() {
        return kazna;
    }

    public void setKazna(int kazna) {
        this.kazna = kazna;
    }
}
