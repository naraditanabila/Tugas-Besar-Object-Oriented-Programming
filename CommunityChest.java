import java.util.Random;

public class CommunityChest extends Space { //inheritanse
    Random rand = new Random();
	private int num;
    
    public CommunityChest() {
		super("Community Chest",2,0);
    }

    public void placeAffect(Player p) {
        int n = rand.nextInt(10)+1;
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
