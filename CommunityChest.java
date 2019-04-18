import java.util.Random;

public class CommunityChest extends Space { //inheritanse
    Random rand = new Random();
	private int num;
    
    public CommunityChest() {
		super("Community Chest",2,0);
    }

    public void placeAffect(Player p) {
        int n = rand.nextInt(10)+1;
		System.out.println("Kartu yang Anda dapatkan: ");
		if (n == 1) {
			System.out.println("Selamat, Anda mendapatkan sumbangan sebesar 1000.");
            p.receive(1000);
        } else if (n == 2) {
            System.out.println("Maaf, Anda harus membayar Pajak Negara sebesar 2000.");
			p.pay(2000);
        } else if (n == 3) {
			System.out.println("Selamat, Anda mendapatkan Hadiah Ulang Tahun sebesar 1750.");
            p.receive(1750);
        } else if (n == 4) {
			System.out.println("Maaf, Anda harus membayar Tagihan BPJS Bulanan sebesar 3500");
            p.pay(3500);
        } else if (n == 5) {
			System.out.println("Selamat, Anda mendapatkan beasiswa BukaPigur sebesar 10000");
            p.receive(10000);
        } else if (n == 6) {
			System.out.println("Maaf, Anda harus membayar UKT sebesar 8000");
            p.pay(8000);
        } else if (n == 7) {
			System.out.println("Selamat, Anda menemukan uang sebesar 2000");
            p.receive(2000);
        } else if (n == 8) {
			System.out.println("Maaf, Anda bertemu dengan Preman dan dipalak sebesar 6500");
            p.pay(6500);
        } else if (n == 9) {
			System.out.println("Selamat, Anda ditransfer uang oleh Orang Tua sebesar 5000");
            p.receive(5000);
        } else if (n == 10) {
			System.out.println("Maaf, Anda harus membayar Laundry sebesar 4000");
            p.pay(4000);
        } 
    }
}
