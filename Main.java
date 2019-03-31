import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
    public static synchronized void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Place> place = new ArrayList<Place>();
		List<Player> player = new ArrayList<Player>();
        int d1, d2, nPlayer;
        String pName, cmd;
        boolean endGame = false;
        boolean nextP = false;

        //PenambahanMap
        place.add(new Lot("UDINUS", 1, 400));
		place.add(new CommunityChest());
        place.add(new Lot("UPN Surabaya", 1, 400));
		place.add(new Space("Tax", 0,500));
		place.add(new Railroad("Laboratorium 1"));
		place.add(new Lot("UNISBA", 3, 600));
		place.add(new ChanceCard());
		place.add(new Lot("POLBAN", 3, 700));
		place.add(new Lot("ITHB", 3, 800));
		place.add(new Space("Penjara",0, 0));
		place.add(new Lot("UNIKOM", 4, 800));
		place.add(new Utility("Dana Usaha"));
		place.add(new Lot("Tel-U", 4, 800));
		place.add(new Lot("UNPAR", 4, 900));
		place.add(new Railroad("Laboratorium 2"));
		place.add(new Lot("UII", 6, 1000));
		place.add(new CommunityChest());
		place.add(new Lot("UPN Jogja", 6, 1000));
		place.add(new Lot("Atma Jaya", 6, 1100));
		place.add(new Space("Free Parking",0, 0));
		place.add(new Lot("BINUS", 7, 1200));
		place.add(new ChanceCard());
		place.add(new Lot("Trisakti", 7, 1200));
		place.add(new Lot("UNTAR", 7, 1200));
		place.add(new Railroad("Laboratorium 3"));
		place.add(new Lot("UNUD", 8, 1400));
		place.add(new Lot("UNS", 8, 1500));
		place.add(new Utility("Kaos Panitia"));
		place.add(new Lot("PENS", 8, 1500));
		place.add(new Space("Go To Jail",0, 0));
		place.add(new Lot("UB", 9, 1500));
		place.add(new Lot("UGM", 9, 1600));
		place.add(new CommunityChest());
		place.add(new Lot("ITS", 9, 1600));
		place.add(new Railroad("Laboratorium 4"));
		place.add(new ChanceCard());
		place.add(new Lot("UI", 10, 2000));
		place.add(new Space("Tax",0, 100));
		place.add(new Lot("ITB", 10, 2500));
		
        //Pembacaan jumlah player
        nPlayer = s.nextInt();

        //Pembacaan nama tiap player
        for (int i = 1 ; i <= nPlayer ; i++) {
            System.out.println("Nama Player Ke-" + i + ":");
            pName = s.next();
            player.add(new Player(pName));
		}
        
        //Instant Dadu
        Dadu dadu = new Dadu();
		
		//Instant Card
		ListCard<String, ChanceCard> chanceList = new ListCard <String, ChanceCard> ();
		chanceList.add("Masuk Penjara",new ChanceCard()); //1, 
        chanceList.add("Maju 3 Langkah",new ChanceCard()); //2, position
        chanceList.add("Mundur 3 Langkah",new ChanceCard()); //3, position
        chanceList.add("Bayar Zakat 10%",new ChanceCard()); //4, outcome
        chanceList.add("Pergi ke Start",new ChanceCard()); //5, position
        chanceList.add("Mendapat Sumbangan 20%",new ChanceCard()); //6, income
        chanceList.add("Maju 5 Langkah",new ChanceCard()); //7, position
        chanceList.add("Mundur 5 Langkah",new ChanceCard()); //8, position
        chanceList.add("Mundur 3 Langkah",new ChanceCard()); //9, position
        chanceList.add("Maju 5 Langkah",new ChanceCard()); //10, position
		ListCard<String, CommunityChest> ccList = new ListCard <String, CommunityChest> ();
		ccList.add("Mendapat Sumbangan 1000",new CommunityChest()); //1, in
        ccList.add("Pajak Negara 2000",new CommunityChest()); //2, out
        ccList.add("Hadiah Ulang tahun 1750",new CommunityChest()); //3, in
        ccList.add("Tagihan BPJS Bulanan 3500",new CommunityChest()); //4, out
        ccList.add("Beasiswa BukaPigur 10000",new CommunityChest()); //5, in
        ccList.add("Bayar UKT 8000",new CommunityChest()); //6, out
        ccList.add("Nemu Duit 2000",new CommunityChest()); //7, in
        ccList.add("Dipalak Preman 6500",new CommunityChest()); //8, out
        ccList.add("Transferan Orang Tua 5000",new CommunityChest()); //9, in
        ccList.add("Bayar Laundry 4000",new CommunityChest()); //10, out
        //Iterasi permainan
		
		Timer t = new Timer();
		Turn turn  = new Turn(nPlayer, t);

		// TODO  SWING-game variables
		/*
			Status Java Swing
		boolean rollButtonPressed;
		boolean buyButtonPressed;
		boolean notbuyButtonPressed;
		boolean suicideButtonPressed;
		boolean sellButtonPressed;
		boolean upgradeButtonPressed
		boolean endTurnPressed;
		boolean startGamePressed;
		
		*/
		// SWING-Game variables
		//


		while (!endGame) {
			//Gatau disini ada thread apa nggak
			cmd = s.next();
			if (cmd.equals("roll")) {
				int index = turn.getPlayer();
				if (player.get(index).getJail()) {
					System.out.println("Silahkan pilih Bayar atau Dadu");
					String x = s.next();
					if (x.equals("Dadu")) {
						d1 = dadu.getN1();
						d2 = dadu.getN2();
						System.out.println("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
						if (d1 == d2) {
							player.get(index).outJail();
							System.out.println("Selamat! anda keluar dari sini");
						} else {
							System.out.println("Dadu tidak sama");
						}
					} else if (x.equals("Bayar")) {
						if (player.get(index).getMoney()<1000) {
							System.out.println("Uang yang Anda miliki tidak cukup. Silahkan lakukan roll dice.");
							d1 = dadu.getN1();
							d2 = dadu.getN2();
							System.out.println("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
							if (d1 == d2) {
								player.get(index).outJail();
								System.out.println("Selamat! anda keluar dari sini");
							} else {
								System.out.println("Dadu tidak sama");
							}
						} else {
							player.get(index).pay(1000);
							player.get(index).outJail();
							System.out.println("Selamat! anda keluar dari sini");
						}
					}
				} else {
					boolean db = true;
					int dbi = 1;
					while (db && (dbi <= 3)) {
						d1 = dadu.getN1();
						d2 = dadu.getN2();
						System.out.println("Dadu yang didapatkan: " + d1 + " dan " + d2);
						System.out.println("Player bergerak sebanyak " + (d1+d2) + " kotak");
						player.get(index).move(d1+d2);
						int type = place.get(player.get(index).getPos()).getType();
						if (type == 0) {
							place.get(player.get(index).getPos()).placeAffect(player.get(index));
						} else {
							if (place.get(player.get(index).getPos()).getOwner() == player.get(index)) {
								//Thread masuk disini, kalau sudah lebih dari 30 detik keluar dari while
								cmd = s.next();
								//Tambahin case jika Player ingin beli rumah
								//Ini belum selesai
							} else if (place.get(player.get(index).getPos()).getOwner() == null) {
								//perlu pake Thread juga gak?
								System.out.println("Properti ini belum dimiliki siapa - siapa. Apakah kamu ingin membeli properti ini?");
								cmd = s.next();
								if (cmd.equals("Iya")) {
									place.get(player.get(index).getPos()).beliProp(player.get(index));
								}	
							} else {	
								place.get(player.get(index).getPos()).placeAffect(player.get(index));
							}
						}
						if (d1 == d2){
							dbi++;
						} else {
							db = false;
						}
					}
					if (dbi > 3) {
						player.get(index).inJail();
					} else {
						turn.nextPlayer();
					}
				}
			} else if (cmd.equals("quit")) {
				endGame = true;
			}
		}
        //Tutup scanner (penting ga sih)
        s.close();
    }
}

/*
	***************	JAVA SWING	*****************
*/

/*


*/