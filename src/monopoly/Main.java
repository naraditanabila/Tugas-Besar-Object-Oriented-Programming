package monopoly;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//import monopoly.NewGame;

import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
	Dalam konsep MVC,
	File ini adalah Controller dan Model.
	Sehingga harus ada atribut View.
	Selain itu, main program ada disini dan harus menginisiasi Viewnya dari sini.
	Sehingga, perlu ada
	MonopolyFrame theView = new MonopolyFrame()


	Method yg hrus ada di view:
	
	// cara bikin Action Listener
	
		gameLogButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logFrame.setVisible(true);
			}
		});






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
		String pName; 
                int cmd;
		boolean endGame = false;
		boolean nextP = false;
		//SWING
		NewGame newGameFrame = new NewGame();
                
                ImageIcon img = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/icon.jpg"));
                
                newGameFrame.setIconImage(img.getImage());
                
                
                while (newGameFrame.gameReady()) {
                    MonopolyFrame mainFrame = new MonopolyFrame();
                    mainFrame.setIconImage(img.getImage());
                    //SWING : Button
                    mainFrame.getRollButton().addActionListener( new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt0) {
                            cmd = 1;
                        }
                    });
                    
                    mainFrame.getPayButton().addActionListener( new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt0) {
                            cmd = 2;
                            mainFrame.setLog("Pay Button kepencet!!!\n");
                        }
                    });

                    mainFrame.getUpgradeButton().addActionListener( new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt0) {
                            cmd = 9;
                            mainFrame.setLog(">> Game has been started.\n");
                        }
                    });
                    
                    mainFrame.getSellButton().addActionListener( new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt0) {
                            cmd = 9;
                            mainFrame.setLog(">> Game has been started.\n");
                        }
                    });
                    
                    // maybe a solution






                    //SWING


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
                    nPlayer = newGameFrame.getPlayerNumber();

                    //Pembacaan nama tiap player
                    for (int i = 1 ; i <= nPlayer ; i++) {
                            pName = newGameFrame.getPlayerName(i);
                            player.add(new Player(pName));
                    }

                    //Instant Dadu
                    Dadu dadu = new Dadu();

                    //Instant Card
                    ListCard<String, ChanceCard> chanceList = new ListCard <String, ChanceCard> ();
                    chanceList.add("Masuk Penjara",new ChanceCard()); //1, 
                    chanceList.add("Maju 3 Langkah",new ChanceCard()); //2, position
                    chanceList.add("Mundur 3 Langkah",new ChanceCard()); //3, position
                    chanceList.add("Mendapat Free Parking",new ChanceCard()); //4, outcome
                    chanceList.add("Pergi ke kotak Start",new ChanceCard()); //5, position
                    chanceList.add("Pergi ke kotak Penjara",new ChanceCard()); //6, income
                    chanceList.add("Maju 5 Langkah",new ChanceCard()); //7, position
                    chanceList.add("Mundur 5 Langkah",new ChanceCard()); //8, position
                    chanceList.add("Pergi ke kotak Dana Usaha",new ChanceCard()); //9, position
                    chanceList.add("Pergi ke kotak Laboratorium 3",new ChanceCard()); //10, position
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
                            mainFrame.setLog(player.get(turn.getPlayer()).getID() + " bermain");
                            mainFrame.setLog("Pilih roll atau quit");

                            //tiap command di cek



                            //Yang dienable
                            cmd = s.next();
                            int index = turn.getPlayer();

                            for (int i = index; index <= nPlayer; i++) {
                                switch (index) {
                                    case 1:
                                        mainFrame.getMoney_player1().setText(Integer.toString(player.get(index).getMoney())); //update data player 1
                                        mainFrame.getPos_player1().setText(place.get((player.get(index).getPos())).getName()); //update data player 2
                                        break;
                                    case 2:
                                        mainFrame.getMoney_player2().setText(Integer.toString(player.get(index).getMoney()));
                                        mainFrame.getPos_player2().setText(place.get((player.get(index).getPos())).getName());
                                        break;
                                    case 3:
                                        mainFrame.getMoney_player3().setText(Integer.toString(player.get(index).getMoney()));
                                        mainFrame.getPos_player3().setText(place.get((player.get(index).getPos())).getName());
                                        break;
                                    case 4:
                                        mainFrame.getMoney_player4().setText(Integer.toString(player.get(index).getMoney()));
                                        mainFrame.getPos_player4().setText(place.get((player.get(index).getPos())).getName());
                                        break;
                                    default:
                                        break;
                                }
                            }

                            if (!(player.get(index).getKalah())) {
                                //Command nya gmn ya
                                    if (cmd.equals("roll")) { 

                                            mainFrame.getMoney_player1().setText(Integer.toString(player.get(index).getMoney()));
                                            mainFrame.getPos_player1().setText(place.get((player.get(index).getPos())).getName());

                                            for (int i=0; i<player.get(index).sizeProp(); i++) {
                                                    if (((Property)player.get(index).getProp(i)).getTipe() == 2) {
                                                            if (((Property)player.get(index).getProp(i)).getLvl() == 3) {
                                                                    mainFrame.setLog(player.get(index).getProp(i).getName()+" dengan 1 rumah");
                                                            } else if (((Property)player.get(index).getProp(i)).getLvl() == 4) {
                                                                    mainFrame.setLog(player.get(index).getProp(i).getName()+" dengan 2 rumah");
                                                            } else if (((Property)player.get(index).getProp(i)).getLvl() == 5) {
                                                                    mainFrame.setLog(player.get(index).getProp(i).getName()+" dengan 3 rumah");
                                                            } else if (((Property)player.get(index).getProp(i)).getLvl() == 6) {
                                                                    mainFrame.setLog(player.get(index).getProp(i).getName()+" dengan 4 rumah");
                                                            } else {
                                                                    mainFrame.setLog(player.get(index).getProp(i).getName());
                                                            }
                                                    } else {
                                                            System.out.println(player.get(index).getProp(i).getName());
                                                    }
                                            }

                                            if (player.get(index).getJail()) {
                                                    mainFrame.setLog("Silahkan pilih Bayar atau Dadu");
                                                    try {
                                                            cmd = (new Main()).getInput();
                                                    } catch (Exception e) {
                                                            System.out.println(e);
                                                    }

                                                    if (cmd.equals("Dadu")) {
                                                            //dadu blm dibikin antara mending gamelog atau bikin baru
                                                            d1 = dadu.getN1();
                                                            d2 = dadu.getN2();
                                                            mainFrame.showDice(d1, d2);
                                                            mainFrame.setLog("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);

                                                            if (d1 == d2) {
                                                                    player.get(index).outJail();
                                                                    mainFrame.setLog("Selamat! anda keluar dari penjara!");
                                                            } else {
                                                                    mainFrame.setLog("Dadu tidak sama");
                                                                    turn.nextPlayer();
                                                            }

                                                    } else if (cmd.equals("Bayar")) {
                                                            if (player.get(index).getMoney()<1000) {
                                                                    mainFrame.setLog("Uang yang Anda miliki tidak cukup. Silahkan lakukan roll dice.");
                                                                    d1 = dadu.getN1();
                                                                    d2 = dadu.getN2();
                                                                    mainFrame.showDice(d1, d2);
                                                                    mainFrame.setLog("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
                                                                    if (d1 == d2) {
                                                                            player.get(index).outJail();
                                                                            //System.out.println("Selamat! anda keluar dari sini");
                                                                            mainFrame.setLog("Selamat! anda keluar dari sini");
                                                                    } else {
                                                                            //System.out.println("Dadu tidak sama");
                                                                            mainFrame.setLog("Dadu tidak sama");
                                                                            turn.nextPlayer();
                                                                    }
                                                            } else {
                                                                    player.get(index).pay(1000);
                                                                    player.get(index).outJail();
                                                                    mainFrame.setLog("Selamat! anda keluar dari sini");
                                                            }
                                                    } else {
                                                            //Kalau command tidak sesuai, skip
                                                            turn.nextPlayer();
                                                    }
                                            } else {
                                                    boolean db = true;
                                                    int dbi = 1;
                                                    while (db && (dbi <= 3) && (!player.get(index).getJail())) {
                                                            mainFrame.setLog("Silahkan pilih Random atau Set");
                                                            cmd = s.next();
                                                            if (cmd.equals("Random")) {
                                                                    d1 = dadu.getN1();
                                                                    d2 = dadu.getN2();
                                                                    mainFrame.showDice(d1, d2);
                                                            } else { //Ini hanya untuk debug
                                                                    d1 = s.nextInt();
                                                                    d2 = s.nextInt();
                                                            }
                                                            //System.out.println("Dadu yang didapatkan: " + d1 + " dan " + d2);
                                                            mainFrame.setLog("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
                                                            mainFrame.setLog("Player bergerak sebanyak " + (d1+d2) + " kotak");
                                                            player.get(index).move(d1+d2);
                                                            //System.out.println("Player "+player.get(index).getID()+" berada di kotak "+place.get(player.get(index).getPos()).getName()+".");
                                                            mainFrame.setLog("Player "+player.get(index).getID()+" berada di kotak "+place.get(player.get(index).getPos()).getName()+".");
                                                            boolean again = true;
                                                            //untuk mengatasi dadu sama, namun masuk penjara
                                                            while (again) { //pengulangan
                                                                    int type = place.get(player.get(index).getPos()).getType();
                                                                    if (type == 0) {
                                                                            if (null == place.get(player.get(index).getPos()).getName()) {
                                                                                place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame.getGameLog());
                                                                                again = false;
                                                                            } else //Free Parking
                                                                        switch (place.get(player.get(index).getPos()).getName()) {
                                                                            case "Free Parking":
                                                                                mainFrame.setLog("Masukkan nama yang ingin dituju : ");
                                                                                int plot = s.nextInt();
                                                                                player.get(index).setPos(plot-1);
                                                                                break;
                                                                            case "Chance Card":
                                                                                place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame.getGameLog());
                                                                                break;
                                                                            default:
                                                                                place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame.getGameLog());
                                                                                again = false;
                                                                                break;
                                                                        }
                                                                            //duit habis
                                                                            if (player.get(index).getKalah()) {
                                                                                    again = false;
                                                                                    db = false;
                                                                                    nPlayer = nPlayer - 1;
                                                                            }
                                                                    } else {
                                                                            if (place.get(player.get(index).getPos()).getOwner() == player.get(index)) {
                                                                                    //nunggu inputan Button Upgrade
                                                                                    try {
                                                                                            cmd = (new Main()).getInput();
                                                                                    } catch (Exception e) {
                                                                                            //System.out.println(e);
                                                                                            mainFrame.setLog(e.getMessage());
                                                                                    }
                                                                                    if (cmd.equals("Ya")) {
                                                                                            place.get(player.get(index).getPos()).lvlup(player.get(index), mainFrame.getGameLog());
                                                                                    } else {
                                                                                            db = false;
                                                                                    }
                                                                            } else if (place.get(player.get(index).getPos()).getOwner() == null) {
                                                                                    mainFrame.setLog("Properti ini belum dimiliki siapa - siapa. Apakah kamu ingin membeli properti ini? Ya/Tidak");
                                                                                    try {
                                                                                            cmd = (new Main()).getInput();
                                                                                    } catch (Exception e) {
                                                                                            //System.out.println(e);
                                                                                            mainFrame.setLog(e.getMessage());
                                                                                    }
                                                                                    if (cmd.equals("Ya")) {
                                                                                            ((Property)place.get(player.get(index).getPos())).beliProp(player.get(index), mainFrame.getGameLog());
                                                                                    } else {
                                                                                            db = false;
                                                                                    }
                                                                            } else {
                                                                                    place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame.getGameLog());
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
                                    //sudah kalah
                                    // mail: mending di skip aja gk sih?
                                    mainFrame.setLog(player.get(index).getID() + " sudah kalah");
                            }
                    }
                    // nyari pemenang
                    WinnerGame winnerFrame = new WinnerGame();
                    winnerFrame.setIconImage(img.getImage());
                    for (int i = 1; i <= nPlayer; i++) {
                        if (!player.get(i).getKalah()) {
                            String winnerName = player.get(i).getID();
                            winnerFrame.setWinnerName(winnerName);
                        }
                    }
                    //

                    s.close();
            }
        }
}