/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.monopoly;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;



/**
 *
 * @author Ismail F Aziz
 */
public class Monopoly{
    
    // Variables Declaration
    private JFrame mainFrame;
    private JFrame newGameFrame;
    private JFrame winnerFrame;
    
    
    
    // EO Variables Declaration
    private int str = 10;
	boolean nin = false;
	int detik=30;

	
	TimerTask task = new TimerTask(){
		public void run() {
			if (str == 10) {
				if (detik>0) {
					System.out.print(detik);
					detik--;
				}
				else {
					System.out.println("Tidak memasukkan input!");
					System.out.println("Press [Enter] to continue");
                    nin = true;
				}
			}
		}
	};
	
	public int getInput(MonopolyFrame mainFrame) throws Exception {
		Timer t = new Timer();
		t.schedule(task, 30, 1000);
		
		mainFrame.setLog("Masukkan command: ");
		str = mainFrame.getCommand();
		t.cancel();
		if (this.nin == false) {
			return str;
		} else {
			return -1;
		}
	}
       
    public static void main(String[] args) throws Exception {
        
            List<Place> place = new ArrayList<Place>();
            List<Player> player = new ArrayList<Player>();
            int d1, d2, nPlayer;
            String pName; 
            int cmd;
            boolean endGame = false;
            boolean nextP = false;
            //SWING
            ImageIcon img;
            img = new ImageIcon(Monopoly.class.getResource("resources/icon.jpg"));

            NewGame newGameFrame = new NewGame();
            newGameFrame.setLocationRelativeTo(null);
            newGameFrame.setTitle("Monopoly");
            newGameFrame.setVisible(true);
            newGameFrame.setIconImage(img.getImage());


            






            

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


            Thread.sleep(30000);
            MonopolyFrame mainFrame = new MonopolyFrame(newGameFrame);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(false);
            mainFrame.setIconImage(img.getImage());
            mainFrame.setVisible(true);

            while(!newGameFrame.gameReady()) {

                Thread.sleep(5000);
                mainFrame.setLog("game belum mulai");
            }
            
            //Pembacaan jumlah player
            nPlayer = newGameFrame.getPlayerNumber();

            //Pembacaan nama tiap player
            for (int i = 1 ; i <= nPlayer ; i++) {
                    pName = newGameFrame.getPlayerName(i);
                    player.add(new Player(pName));
                    mainFrame.showPlayerPos(i, 1);
                    mainFrame.setLog(pName + " ditambahkan!");
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

            mainFrame.getProp1Button().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    for (int i=0; i<player.get(0).sizeProp(); i++) {
                        if (((Property)player.get(0).getProp(i)).getTipe() == 2) {
                            if (((Property)player.get(0).getProp(i)).getLvl() == 3) {
                                mainFrame.setLog(player.get(0).getProp(i).getName()+" dengan 1 rumah");
                            } else if (((Property)player.get(0).getProp(i)).getLvl() == 4) {
                                mainFrame.setLog(player.get(0).getProp(i).getName()+" dengan 2 rumah");
                            } else if (((Property)player.get(0).getProp(i)).getLvl() == 5) {
                                mainFrame.setLog(player.get(0).getProp(i).getName()+" dengan 3 rumah");
                            } else if (((Property)player.get(0).getProp(i)).getLvl() == 6) {
                                mainFrame.setLog(player.get(0).getProp(i).getName()+" dengan 4 rumah");
                            } else {
                                mainFrame.setLog(player.get(0).getProp(i).getName());
                            }
                        } else {
                            mainFrame.setLog(player.get(0).getProp(i).getName());
                        }
                    }
                }
            });

            mainFrame.getProp2Button().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    for (int i=0; i<player.get(1).sizeProp(); i++) {
                        if (((Property)player.get(1).getProp(i)).getTipe() == 2) {
                            if (((Property)player.get(1).getProp(i)).getLvl() == 3) {
                                mainFrame.setLog(player.get(1).getProp(i).getName()+" dengan 1 rumah");
                            } else if (((Property)player.get(1).getProp(i)).getLvl() == 4) {
                                mainFrame.setLog(player.get(1).getProp(i).getName()+" dengan 2 rumah");
                            } else if (((Property)player.get(1).getProp(i)).getLvl() == 5) {
                                mainFrame.setLog(player.get(1).getProp(i).getName()+" dengan 3 rumah");
                            } else if (((Property)player.get(1).getProp(i)).getLvl() == 6) {
                                mainFrame.setLog(player.get(1).getProp(i).getName()+" dengan 4 rumah");
                            } else {
                                mainFrame.setLog(player.get(1).getProp(i).getName());
                            }
                        } else {
                            mainFrame.setLog(player.get(1).getProp(i).getName());
                        }
                    }
                }
            });

            mainFrame.getProp3Button().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    for (int i=0; i<player.get(2).sizeProp(); i++) {
                        if (((Property)player.get(2).getProp(i)).getTipe() == 2) {
                            if (((Property)player.get(2).getProp(i)).getLvl() == 3) {
                                mainFrame.setLog(player.get(2).getProp(i).getName()+" dengan 1 rumah");
                            } else if (((Property)player.get(2).getProp(i)).getLvl() == 4) {
                                mainFrame.setLog(player.get(2).getProp(i).getName()+" dengan 2 rumah");
                            } else if (((Property)player.get(2).getProp(i)).getLvl() == 5) {
                                mainFrame.setLog(player.get(2).getProp(i).getName()+" dengan 3 rumah");
                            } else if (((Property)player.get(2).getProp(i)).getLvl() == 6) {
                                mainFrame.setLog(player.get(2).getProp(i).getName()+" dengan 4 rumah");
                            } else {
                                mainFrame.setLog(player.get(2).getProp(i).getName());
                            }
                        } else {
                            mainFrame.setLog(player.get(2).getProp(i).getName());
                        }
                    }
                }
            });

            mainFrame.getProp4Button().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    for (int i=0; i<player.get(3).sizeProp(); i++) {
                        if (((Property)player.get(3).getProp(i)).getTipe() == 2) {
                            if (((Property)player.get(3).getProp(i)).getLvl() == 3) {
                                mainFrame.setLog(player.get(3).getProp(i).getName()+" dengan 1 rumah");
                            } else if (((Property)player.get(3).getProp(i)).getLvl() == 4) {
                                mainFrame.setLog(player.get(3).getProp(i).getName()+" dengan 2 rumah");
                            } else if (((Property)player.get(3).getProp(i)).getLvl() == 5) {
                                mainFrame.setLog(player.get(3).getProp(i).getName()+" dengan 3 rumah");
                            } else if (((Property)player.get(3).getProp(i)).getLvl() == 6) {
                                mainFrame.setLog(player.get(3).getProp(i).getName()+" dengan 4 rumah");
                            } else {
                                mainFrame.setLog(player.get(3).getProp(i).getName());
                            }
                        } else {
                            mainFrame.setLog(player.get(3).getProp(i).getName());
                        }
                    }
                }
            });

            //Iterasi permainan

            Turn turn  = new Turn(nPlayer);

            while ((!endGame) && (nPlayer != 1)) {

                for (int i = 0; i < nPlayer; i++) {
                    switch (i) {
                        case 0:
                            mainFrame.getMoney_player1().setText(Integer.toString(player.get(i).getMoney())); //update data player 1
                            mainFrame.getPos_player1().setText(place.get((player.get(i).getPos())).getName()); //update data player 2
                            break;
                        case 1:
                            mainFrame.getMoney_player2().setText(Integer.toString(player.get(i).getMoney()));
                            mainFrame.getPos_player2().setText(place.get((player.get(i).getPos())).getName());
                            break;
                        case 2:
                            mainFrame.getMoney_player3().setText(Integer.toString(player.get(i).getMoney()));
                            mainFrame.getPos_player3().setText(place.get((player.get(i).getPos())).getName());
                            break;
                        case 3:
                            mainFrame.getMoney_player4().setText(Integer.toString(player.get(i).getMoney()));
                            mainFrame.getPos_player4().setText(place.get((player.get(i).getPos())).getName());
                            break;
                        default:
                            break;
                    }
                }


                mainFrame.setLog(player.get(turn.getPlayer()).getID() + " bermain");
                mainFrame.setLog("Pilih roll atau quit");

                //tiap command di cek
                //Yang dienable

                while(mainFrame.getCommand() == 0) {
                    Thread.sleep(1000);
                    //mainFrame.setLog("ea kebaca gak commandnya jancok");
                }

                cmd = mainFrame.getCommand();
                int time = 0;
                int index = turn.getPlayer();



                if (!(player.get(index).getKalah())) {
                    //Command nya gmn ya
                        if (cmd == 1) {
                                mainFrame.clearCommand();
                                if (player.get(index).getJail()) {
                                    mainFrame.setLog("Silahkan pilih Bayar atau Dadu");
                                    cmd = mainFrame.getCommand();
                                    time = 0;
                                    while((mainFrame.getCommand() == 0) || ( time >= 30)) {
                                        Thread.sleep(1000);
                                        time += 1;
                                    }

                                    if (cmd == 1) {
                                            //dadu blm dibikin antara mending gamelog atau bikin baru
                                            mainFrame.clearCommand();

                                            d1 = dadu.getN1();
                                            d2 = dadu.getN2();
                                            mainFrame.showDice(d1, d2);
                                            mainFrame.setLog("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);

                                            if (d1 == d2) {
                                                    player.get(index).outJail(mainFrame);
                                                    mainFrame.setLog("Selamat! anda keluar dari penjara!");
                                            } else {
                                                    mainFrame.setLog("Dadu tidak sama");
                                                    turn.nextPlayer();
                                            }

                                    } else if (cmd == 2) {
                                        mainFrame.clearCommand();
                                            if (player.get(index).getMoney()<1000) {
                                                    mainFrame.setLog("Uang yang Anda miliki tidak cukup. Silahkan lakukan roll dice.");
                                                    d1 = dadu.getN1();
                                                    d2 = dadu.getN2();
                                                    mainFrame.showDice(d1, d2);
                                                    mainFrame.setLog("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
                                                    if (d1 == d2) {
                                                        player.get(index).outJail(mainFrame);
                                                        //System.out.println("Selamat! anda keluar dari sini");
                                                        mainFrame.setLog("Selamat! anda keluar dari sini");
                                                        } else {
                                                                //System.out.println("Dadu tidak sama");
                                                                mainFrame.setLog("Dadu tidak sama");
                                                                turn.nextPlayer();
                                                        }
                                                } else {
                                                        player.get(index).pay(1000, mainFrame);
                                                        player.get(index).outJail(mainFrame);
                                                        mainFrame.setLog("Selamat! anda keluar dari sini");
                                                }
                                        } else {
                                                //Kalau command tidak sesuai, skip
                                                turn.nextPlayer();
                                        }
                                } else {
                                    mainFrame.clearCommand();
                                        boolean db = true;
                                        int dbi = 1;
                                        while (db && (dbi <= 3) && (!player.get(index).getJail())) {
                                                mainFrame.setLog("Silahkan roll");

                                                //if (cmd == 1) {
                                                        d1 = dadu.getN1();
                                                        d2 = dadu.getN2();
                                                        mainFrame.showDice(d1, d2);
                                                /*} else { //Ini hanya untuk debug
                                                    d1 = dadu.getN1();
                                                    d2 = dadu.getN2();
                                                    mainFrame.showDice(d1, d2);
                                                }*/
                                                mainFrame.setLog("Dadu yang anda dapatkan adalah " + d1 + " dan " + d2);
                                                mainFrame.setLog("Player bergerak sebanyak " + (d1+d2) + " kotak");
                                                mainFrame.removePlayerPos(index, player.get(index).getPos());
                                                player.get(index).move(d1+d2, mainFrame);
                                                mainFrame.showPlayerPos(index, player.get(index).getPos());
                                                mainFrame.setLog("Player "+player.get(index).getID()+" berada di kotak "+place.get(player.get(index).getPos()).getName()+".");
                                                boolean again = true;
                                                //untuk mengatasi dadu sama, namun masuk penjara
                                                while (again) { //pengulangan
                                                        int type = place.get(player.get(index).getPos()).getType();
                                                        if (type == 0) {
                                                                if (null == place.get(player.get(index).getPos()).getName()) {
                                                                    place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame);
                                                                    again = false;
                                                                } else //Free Parking
                                                            switch (place.get(player.get(index).getPos()).getName()) {
                                                                case "Free Parking":
                                                                    FreeParkFrame frame_FreePark = new FreeParkFrame();
                                                                    int plot = Integer.parseInt(frame_FreePark.getFreeParkNum().getText());
                                                                    player.get(index).setPos(plot-1, mainFrame);
                                                                    break;
                                                                case "Chance Card":
                                                                    place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame);
                                                                    break;
                                                                default:
                                                                    place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame);
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
                                                                    cmd = mainFrame.getCommand();
                                                                    time= 0;
                                                                    while((mainFrame.getCommand() == 0) || (time >= 30)) {
                                                                        Thread.sleep(1000);
                                                                        time += 1;
                                                                    }
                                                                    if (cmd == 5) {
                                                                            ((Property)place.get(player.get(index).getPos())).lvlup(player.get(index), mainFrame);
                                                                    } else {
                                                                            db = false;
                                                                    }
                                                                    mainFrame.clearCommand();
                                                                } else if (place.get(player.get(index).getPos()).getOwner() == null) {
                                                                        mainFrame.setLog("Properti ini belum dimiliki siapa - siapa. Apakah kamu ingin membeli properti ini? Ya/Tidak");
                                                                        cmd = mainFrame.getCommand();
                                                                        time = 0;
                                                                        while((mainFrame.getCommand() == 0) || ( time >= 30)) {
                                                                            Thread.sleep(1000);
                                                                            time += 1;
                                                                        }

                                                                        if (cmd == 3) {
                                                                                ((Property)place.get(player.get(index).getPos())).beliProp(player.get(index), mainFrame);
                                                                        } else {
                                                                                db = false;
                                                                        }
                                                                        mainFrame.clearCommand();
                                                                } else {
                                                                        place.get(player.get(index).getPos()).placeAffect(player.get(index), mainFrame);
                                                                        if (player.get(index).getMoney() < 0) {
                                                                                again = false;
                                                                                db = false;
                                                                                player.get(index).setKalah(mainFrame);
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
                                                player.get(index).inJail(mainFrame);
                                        } else {
                                                turn.nextPlayer();
                                        }
                                }
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
            winnerFrame.setLocationRelativeTo(null);
            winnerFrame.setTitle("Saha nu meunang beu");
            winnerFrame.setVisible(false);
        }

    // Nyoba music
    //String cuteGirl = " /monopoly/resources/cuteGirl.mp3";
    //Media hit = new Media(new File(cuteGirl).toURI().toString());
    //MediaPlayer mediaPlayer = new MediaPlayer(hit);
    //mediaPlayer.play();   
}
