import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class ChanceCard {
    Random rand = new Random();
    
    List<String> chanceList = new ArrayList<String>();
    
    public ChanceCard() {
        chanceList.add("Masuk Penajara"); //1, 
        chanceList.add("Maju 3 Langkah"); //2, position
        chanceList.add("Mundur 3 Langkah"); //3, position
        chanceList.add("Bayar Zakat 10%"); //4, outcome
        chanceList.add("Pergi ke Start"); //5, position
        chanceList.add("Mendapat Sumbangan 20%"); //6, income
        chanceList.add("Maju 5 Langkah"); //7, position
        chanceList.add("Mundur 5 Langkah"); //8, position
        chanceList.add("Mundur 3 Langkah"); //9, position
        chanceList.add("Maju 5 Langkah"); //10, position
    };

    public int getNum() {
        int n = rand.nextInt(10);
        return n;
    }

    public void print(int n) {
        System.out.println(chanceList.get(n));
    }

    public void chanceAction(int n, Player p) {
        if (n == 1) {
            p.inJail();
        } else if (n == 2) {
            p.move(3);
        } else if (n == 3) {
            p.move(-3);
        } else if (n == 4) {
            int x = p.getMoney()*10/100;
            p.pay(x);
        } else if (n == 5) {
            p.setPos(0);
        } else if (n == 6) {
            int x = p.getMoney()*20/100;
            p.receive(x);
        } else if (n == 7) {
            p.move(5);
        } else if (n == 8) {
            p.move(-5);
        } else if (n == 9) {
            p.move(-3);
        } else if (n == 10) {
            p.move(5);
        } 
    }
}
