package src.monopoly;

import java.util.Random;

public class CommunityChest extends Space { //inheritanse
    Random rand = new Random();
	private int num;
    
    public CommunityChest() {
		super("Community Chest",2,0);
    }

    public void placeAffect(Player p, MonopolyFrame mainFrame) {
        int n = rand.nextInt(10)+1;
		mainFrame.setLog("Kartu yang Anda dapatkan: \n");
		if (n == 1) {
			mainFrame.setLog("Selamat, Anda mendapatkan sumbangan sebesar 1000.\n");
            p.receive(1000, mainFrame);
        } else if (n == 2) {
            mainFrame.setLog("Maaf, Anda harus membayar Pajak Negara sebesar 2000.\n");
			p.pay(2000, mainFrame);
        } else if (n == 3) {
			mainFrame.setLog("Selamat, Anda mendapatkan Hadiah Ulang Tahun sebesar 1750.\n");
            p.receive(1750, mainFrame);
        } else if (n == 4) {
			mainFrame.setLog("Maaf, Anda harus membayar Tagihan BPJS Bulanan sebesar 3500\n");
            p.pay(3500, mainFrame);
        } else if (n == 5) {
            mainFrame.setLog("Selamat, Anda mendapatkan beasiswa BukaPigur sebesar 10000\n");
            p.receive(10000, mainFrame);
        } else if (n == 6) {
            mainFrame.setLog("Maaf, Anda harus membayar UKT sebesar 8000\n");
            p.pay(8000, mainFrame);
        } else if (n == 7) {
            mainFrame.setLog("Selamat, Anda menemukan uang sebesar 2000\n");
            p.receive(2000, mainFrame);
        } else if (n == 8) {
            mainFrame.setLog("Maaf, Anda bertemu dengan Preman dan dipalak sebesar 6500\n");
            p.pay(6500, mainFrame);
        } else if (n == 9) {
            mainFrame.setLog("Selamat, Anda ditransfer uang oleh Orang Tua sebesar 5000\n");
            p.receive(5000, mainFrame);
        } else if (n == 10) {
            mainFrame.setLog("Maaf, Anda harus membayar Laundry sebesar 4000\n");
            p.pay(4000, mainFrame);
        } 
    }
}
