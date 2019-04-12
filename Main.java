import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

/*
	Dalam konsep MVC,
	File ini adalah Controller dan Model.
	Sehingga harus ada atribut View.
	Selain itu, main program ada disini dan harus menginisiasi Viewnya dari sini.
	Sehingga, perlu ada
	MonopolyFrame theView = new MonopolyFrame()


	Method yg hrus ada di view:



*/

public class Main {
	private String str = "";
	boolean nin = false;
	
	TimerTask task = new TimerTask(){
		public void run() {
			if (str.equals("")) {
				System.out.println("Tidak memasukkan input!");
				System.out.println("Press [Enter] to continue");
				nin = true;
			}
		}
	};
	
	public String getInput() throws Exception {
		Timer t = new Timer();
		t.schedule(task, 30*1000);
		
		System.out.print("Masukkan command: ");
		BufferedReader in = new BufferedReader (
		new InputStreamReader(System.in));
		str = in.readLine();
		t.cancel();
		if (this.nin == false) {
			return str;
		} else {
			return "nothing";
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Place> place = new ArrayList<Place>();
		List<Player> player = new ArrayList<Player>();
		int d1, d2, nPlayer;
		String pName, cmd;
		boolean endGame = false;
		boolean nextP = false;

		
		//PenambahanMap
		place.add(new Space("Start",0,200));
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
		nPlayer = s.nextInt(); //SWING  / getPlayerNum ke NewGame.java 
		while (nPlayer <= 1) {
			System.out.println("Jumlah pemain harus lebih dari 1");
			nPlayer = s.nextInt();
		}

		//Pembacaan nama tiap player
		for (int i = 1 ; i <= nPlayer ; i++) {
			System.out.println("Nama Player Ke-" + i + ":");
			pName = s.next(); //SWING  / getPlayerName(angkaPlayer) ke NewGame.java
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
		
		Turn turn  = new Turn(nPlayer);


		
		while ((!endGame) && (nPlayer != 1)) {
			System.out.println(player.get(turn.getPlayer()).getID() + " bermain");
			System.out.println("Pilih roll atau quit");


			//Yang dienable
			cmd = s.next(); //SWING  / ganti jadi 
			int index = turn.getPlayer();
			if (!(player.get(index).getKalah())) {
				if (cmd.equals("roll")) {
					System.out.println("--------------------");
					System.out.println("Nama Player: "+player.get(index).getID());
					System.out.println("Jumlah uang: "+player.get(index).getMoney());
					System.out.println("Lokasi saat ini: "+place.get((player.get(index).getPos())).getName());
					System.out.println("Properti yang dimiliki saat ini:");
					for (int i=0; i<player.get(index).sizeProp(); i++) {
						System.out.println(player.get(index).getProp(i).getName());
					}
					System.out.println("--------------------");
					if (player.get(index).getJail()) {
						System.out.println("Silahkan pilih Bayar atau Dadu");
						try {
							cmd = (new Main()).getInput();
						} catch (Exception e) {
							System.out.println(e);
						}

						if (cmd.equals("Dadu")) {
							d1 = dadu.getN1();
							d2 = dadu.getN2();
							System.out.println("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
							if (d1 == d2) {
								player.get(index).outJail();
								System.out.println("Selamat! anda keluar dari sini");
							} else {
								System.out.println("Dadu tidak sama");
							}
						
						} else if (cmd.equals("Bayar")) {
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
						} else {
							//Kalau command tidak sesuai, skip
							turn.nextPlayer();
						}
					} else {
						boolean db = true;
						int dbi = 1;
						while (db && (dbi <= 3)) {
							System.out.println("Silahkan pilih Random atau Set");
							cmd = s.next();
							if (cmd.equals("Random")) {
								d1 = dadu.getN1();
								d2 = dadu.getN2();
							} else {
								d1 = s.nextInt();
								d2 = s.nextInt();
							}
							System.out.println("Dadu yang didapatkan: " + d1 + " dan " + d2);
							//System.out.println("Player bergerak sebanyak " + (d1+d2) + " kotak");
							player.get(index).move(d1+d2);
							System.out.println("Player "+player.get(index).getID()+" berada di kotak "+place.get(player.get(index).getPos()).getName()+".");
							boolean again = true;
							while (again) { //pengulangan
								int type = place.get(player.get(index).getPos()).getType();
								if (type == 0) {
									//Free Parking
									if (place.get(player.get(index).getPos()).getName() == "Free Parking") {
										System.out.println("Masukkan nama yang ingin dituju : ");
										int plot = s.nextInt();
										player.get(index).setPos(plot-1);
									} else if (place.get(player.get(index).getPos()).getName() == "Chance Card") {
										place.get(player.get(index).getPos()).placeAffect(player.get(index));
									} else {
										place.get(player.get(index).getPos()).placeAffect(player.get(index));
										again = false;
									}
									//duit habis
									if (player.get(index).getMoney() < 0) {
										again = false;
										db = false;
										player.get(index).setKalah();
										nPlayer = nPlayer - 1;
									}
								} else {
									if (place.get(player.get(index).getPos()).getOwner() == player.get(index)) {
										System.out.println("Properti ini milikmu, mau upgrade? Ya/Tidak");
										try {
											cmd = (new Main()).getInput();
										} catch (Exception e) {
											System.out.println(e);
										}
										if (cmd.equals("Ya")) {
											place.get(player.get(index).getPos()).lvlup(player.get(index));
										} else {
											db = false;
										}
									} else if (place.get(player.get(index).getPos()).getOwner() == null) {
										System.out.println("Properti ini belum dimiliki siapa - siapa. Apakah kamu ingin membeli properti ini? Ya/Tidak");
										try {
											cmd = (new Main()).getInput();
										} catch (Exception e) {
											System.out.println(e);
										}
										if (cmd.equals("Ya")) {
											place.get(player.get(index).getPos()).beliProp(player.get(index));
										} else {
											db = false;
										}
									} else {
										place.get(player.get(index).getPos()).placeAffect(player.get(index));
										if (player.get(index).getMoney() < 0) {
											again = false;
											db = false;
											player.get(index).setKalah();
											nPlayer = nPlayer - 1;
										}
									}
									again = false;
								}
							}
							if (d1 == d2){
								dbi++;
							} else if (d1 != d2) {
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
			} else {
				System.out.println(player.get(index).getID() + " sudah kalah");
			}
		}
		s.close();
	}
}

/*
	***************	JAVA SWING	*****************
*/

/*


*/
