import java.util.ArrayList;
import java.util.Random;

public class ChanceCard {
    Random rand = new Random();
    
    ArrayList<String> chanceLIst = new ArrayList<String>();
    
    public ChanceCard() {
        chanceLIst.add("Masuk Penajara"); //1, 
        chanceLIst.add("Maju 3 Langkah"); //2, position
        chanceLIst.add("Mundur 3 Langkah"); //3, position
        chanceLIst.add("Bayar Zakat 10%"); //4, outcome
        chanceLIst.add("Pergi ke Start"); //5, position
        chanceLIst.add("Mendapat Sumbangan 20%"); //6, income
        chanceLIst.add("Maju 5 Langkah"); //7, position
        chanceLIst.add("Mundur 5 Langkah"); //8, position
        chanceLIst.add("Mundur 3 Langkah"); //9, position
        chanceLIst.add("Maju 5 Langkah"); //10, position
    };

    public int getNum() {
        int n = rand.nextInt(10);
        return n;
    }

    public void print(int n) {
        System.out.println(chanceLIsts.get(n));
    }

    public void chanceAction(int n, Player p) {
        if (n == 1) {
            p.inJail();
        } else if (n == 2) {
            p.move(3);
        } else if (n == 3) {
            p.move(-3);
        } else if (n == 4) {
            int x = p.getMoney()*0.1;
            p.pay(x);
        } else if (n == 5) {
            p.setPos(Start);
        } else if (n == 6) {
            int x = p.getMoney()*0.2;
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