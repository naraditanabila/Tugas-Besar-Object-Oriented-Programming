import java.util.Random;

public class ChanceCard {
    Random rand = new Random();
	private int num;
    
    public ChanceCard(int n) {
        this.num = n;
    };

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
