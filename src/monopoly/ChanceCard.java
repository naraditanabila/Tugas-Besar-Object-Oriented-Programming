package src.monopoly;

import java.util.Random;

public class ChanceCard extends Space{
    Random rand = new Random();
	private int num;
    
    public ChanceCard() {
		super("Chance Card",1,0);
    }

    public void placeAffect(Player p, MonopolyFrame mainFrame) {
        int n = rand.nextInt(10)+1;
		mainFrame.setLog("Kartu yang Anda dapatkan: \n");
		if (n == 1) {
			mainFrame.setLog("Maaf, Anda harus masuk penjara.\n");
			p.inJail(mainFrame);
			p.setPos(10, mainFrame);
        } else if (n == 2) {
			mainFrame.setLog("Silahkan maju 3 langkah.\n");
            p.move(3, mainFrame);
        } else if (n == 3) {
			mainFrame.setLog("Silahkan mundur 3 langkah.\n");
            p.move(-3, mainFrame);
        } else if (n == 4) {
			mainFrame.setLog("Selamat, Anda mendapatkan Free Parking.\n");
            p.setPos(20, mainFrame);
        } else if (n == 5) {
			mainFrame.setLog("Silahkan pergi ke kotak Start.\n");
            p.setPos(0, mainFrame);
        } else if (n == 6) {
			mainFrame.setLog("Silahkan pergi ke kotak Penjara.\n");
            p.setPos(10, mainFrame);
        } else if (n == 7) {
			mainFrame.setLog("Silahkan maju 5 langkah.\n");
            p.move(5, mainFrame);
        } else if (n == 8) {
			mainFrame.setLog("Silahkan mundur 5 langkah.\n");
            p.move(-5, mainFrame);
        } else if (n == 9) {
			mainFrame.setLog("Silahkan pergi ke kotak Dana Usaha.\n");
            p.setPos(12, mainFrame);
        } else if (n == 10) {
			mainFrame.setLog("Silahkan pergi ke kotak Laboratorium 3.\n");
            p.setPos(25, mainFrame);
        } 
    }
}
