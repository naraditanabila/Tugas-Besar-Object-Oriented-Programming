import javafx.geometry.Pos;

public class Player {
    private int numID;
    private int posisi;
    private int uang;
    private boolean freeze;

    public Player(int id, int posisi, int uang) {
        this.numID = id;
        this.posisi = posisi;
        this.uang = uang;
        this.freeze = true;   
        ArrayList<String> Properti = new ArrayList<String>();
    }

    public void setUang(int Uang) {
        this.uang += Uang;
    }

    public int getUang() {
        return this.uang;
    }

    public void setPos(int Pos) {
        this.posisi += Pos;
    }

    public int getPos() {
        return this.posisi;
    }

    public boolean getCond() {
        return this.freeze;
    }

    public void setCond(boolean cond) {
        this.freeze = cond;
    }
}