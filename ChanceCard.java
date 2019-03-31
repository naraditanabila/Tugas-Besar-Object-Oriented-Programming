import java.util.Random;

public class ChanceCard extends Space{ //inheritance
    Random rand = new Random();
	private int num;
    
    public ChanceCard() {
		super("Chance Card",1,0);
    }

    public void placeAffect(Player p) {
        int n = rand.nextInt(10)+1;
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
