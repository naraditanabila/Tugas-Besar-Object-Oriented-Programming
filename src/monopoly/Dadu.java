import java.util.Random;

public class Dadu {
    Random rand = new Random();
    private int n1, n2;
    
    public Dadu() {};

    public int getN1() {
        n1 = rand.nextInt(6);
        return (n1+1);
    }

    public int getN2() {
        n2 = rand.nextInt(6);
        return (n2+1);
    }

    public int getTotal() {
        return (getN1() + getN2());
    }
}