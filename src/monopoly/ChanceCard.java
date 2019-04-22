package src.monopoly;

import java.util.Random;

public class ChanceCard extends Space{
    Random rand = new Random();
	private int num;
    
    public ChanceCard() {
		super("Chance Card",1,0);
    }

    public void placeAffect(Player p, javax.swing.JTextArea gameLog) {
        int n = rand.nextInt(10)+1;
		gameLog.append("Kartu yang Anda dapatkan: \n");
		if (n == 1) {
			gameLog.append("Maaf, Anda harus masuk penjara.\n");
			p.inJail(gameLog);
			p.setPos(10, gameLog);
        } else if (n == 2) {
			gameLog.append("Silahkan maju 3 langkah.\n");
            p.move(3, gameLog);
        } else if (n == 3) {
			gameLog.append("Silahkan mundur 3 langkah.\n");
            p.move(-3, gameLog);
        } else if (n == 4) {
			gameLog.append("Selamat, Anda mendapatkan Free Parking.\n");
            p.setPos(20, gameLog);
        } else if (n == 5) {
			gameLog.append("Silahkan pergi ke kotak Start.\n");
            p.setPos(0, gameLog);
        } else if (n == 6) {
			gameLog.append("Silahkan pergi ke kotak Penjara.\n");
            p.setPos(10, gameLog);
        } else if (n == 7) {
			gameLog.append("Silahkan maju 5 langkah.\n");
            p.move(5, gameLog);
        } else if (n == 8) {
			gameLog.append("Silahkan mundur 5 langkah.\n");
            p.move(-5, gameLog);
        } else if (n == 9) {
			gameLog.append("Silahkan pergi ke kotak Dana Usaha.\n");
            p.setPos(12, gameLog);
        } else if (n == 10) {
			gameLog.append("Silahkan pergi ke kotak Laboratorium 3.\n");
            p.setPos(25, gameLog);
        } 
    }
}
