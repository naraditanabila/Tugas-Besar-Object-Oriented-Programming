import java.util.ArrayList;
import java.util.Random;

public class ChanceCard {
    Random rand = new Random();
    
    ArrayList<String> chanceLIst = new ArrayList<String>();
    
    public ChanceCard() {
        chanceLIst.add("Masuk Penajara");
        chanceLIst.add("Maju 3 Langkah");
        chanceLIst.add("Mundur 3 Langkah");
        chanceLIst.add("Bayar Zakat 10%");
        chanceLIst.add("Pergi ke Start");
        chanceLIst.add("Mendapat Sumbangan 20%");
        chanceLIst.add("Maju 5 Langkah");
        chanceLIst.add("Mundur 5 Langkah");
        chanceLIst.add("Mundur 3 Langkah");
        chanceLIst.add("Maju 5 Langkah");
    };

    public int CCnum() {
        int n = rand.nextInt(10);
        return n;
    }

    public void print() {
        System.out.println(chanceCard.get(CCnum()));
    }
}