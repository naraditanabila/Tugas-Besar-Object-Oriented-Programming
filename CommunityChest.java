import java.util.Random;

public class CommunityChest {
    Random rand = new Random();
	private int num;
    
    public CommunityChest(int n) {
        this.num=n;
    };

    public void chestAction(int n, Player p) {
        if (n == 1) {
            p.receive(1000);
        } else if (n == 2) {
            p.pay(2000);
        } else if (n == 3) {
            p.receive(1750);
        } else if (n == 4) {
            p.pay(3500);
        } else if (n == 5) {
            p.receive(10000);
        } else if (n == 6) {
            p.pay(8000);
        } else if (n == 7) {
            p.receive(2000);
        } else if (n == 8) {
            p.pay(6500);
        } else if (n == 9) {
            p.receive(5000);
        } else if (n == 10) {
            p.pay(4000);
        } 
    }
}
