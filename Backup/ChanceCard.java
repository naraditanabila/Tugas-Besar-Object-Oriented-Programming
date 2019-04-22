//package monopoly;

import java.util.Random;

public class ChanceCard extends Space{
    Random rand = new Random();
	private int num;
    
    public ChanceCard() {
		super("Chance Card",1,0);
    }

    public void placeAffect(Player p) {
        int n = rand.nextInt(10)+1;
		System.out.println("Kartu yang Anda dapatkan: ");
		if (n == 1) {
			System.out.println("Maaf, Anda harus masuk penjara.");
			p.inJail();
			p.setPos(10);
        } else if (n == 2) {
			System.out.println("Silahkan maju 3 langkah.");
            p.move(3);
        } else if (n == 3) {
			System.out.println("Silahkan mundur 3 langkah.");
            p.move(-3);
        } else if (n == 4) {
			System.out.println("Selamat, Anda mendapatkan Free Parking.");
            p.setPos(20);
        } else if (n == 5) {
			System.out.println("Silahkan pergi ke kotak Start.");
            p.setPos(0);
        } else if (n == 6) {
			System.out.println("Silahkan pergi ke kotak Penjara.");
            p.setPos(10);
        } else if (n == 7) {
			System.out.println("Silahkan maju 5 langkah.");
            p.move(5);
        } else if (n == 8) {
			System.out.println("Silahkan mundur 5 langkah.");
            p.move(-5);
        } else if (n == 9) {
			System.out.println("Silahkan pergi ke kotak Dana Usaha.");
            p.setPos(12);
        } else if (n == 10) {
			System.out.println("Silahkan pergi ke kotak Laboratorium 3.");
            p.setPos(25);
        } 
    }
}
