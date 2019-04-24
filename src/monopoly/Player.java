package src.monopoly;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {

     // parameter
     private String playerID;
     private int playerPos;
     private int playerMoney;
     private int playerProp;
     List<Property> prop = new ArrayList<Property>();
     private boolean playerJail = false;
     private boolean kalah = false;
     //Methods

     //Constructor
     public Player(String id) {
     this.playerID = id;
     this.playerPos = 0;
     this.playerMoney = 15000;
     this.playerProp = 0;
     }


     //Get Setter
	 public String getID(){
		 return this.playerID;
	 }
	 
     public void setPos(int x, MonopolyFrame mainFrame) {
          if (x<this.playerPos && x>0) {
			  mainFrame.setLog("Player "+playerID+" berhasil melewati kotak Start.\n");
			  this.playerMoney+=200;
		  }
		  this.playerPos = x;
          mainFrame.setLog("Player "+playerID+" berhasil pindah tempat\n");
     }

     public int getPos() {
          return playerPos;
     }

     public void setMoney(int x) {
          this.playerMoney = x;
     }

     public int getMoney() {
          return this.playerMoney;
     }
     
     public void setKalah(MonopolyFrame mainFrame) {
		 this.kalah = true;
		 mainFrame.setLog("Maaf, Anda kehabisan uang dan properti.\n");
		 mainFrame.setLog("Player "+playerID+" kalah.\n");
	 }
	 
	 public boolean getKalah () {
		 return this.kalah;
	 }
     //Other methods
     public void move(int x, MonopolyFrame mainFrame) {
          this.playerPos += x;
		  if (this.playerPos>39) {
			  mainFrame.setLog("Player "+playerID+" berhasil melewati kotak Start.\n");
			  this.playerPos = this.playerPos-40;
			  if (this.playerPos>0) {
				this.playerMoney += 200;
			  }
		  }
		  if (x>=0){
		  	mainFrame.setLog("Player "+playerID+" berhasil maju sebanyak "+x+" kotak.\n");
		  } else {
		  	mainFrame.setLog("Player "+playerID+" berhasil mundur sebanyak "+(x*-1)+" kotak.\n");
		  }
     }
	 
	 public void cekStart() {
		 if (this.playerPos ==0) {
				this.playerMoney += 200;
		 }
	 }

     public void pay(int x, MonopolyFrame mainFrame) {
			while (getMoney() < x && sizeProp() > 0) {
				mainFrame.setLog("Uang Anda tidak cukup. Silahkan lakukan jual properti untuk mendapatkan uang.\n");
                mainFrame.setLog("Berikut ini properti yang Anda miliki:\n");
				for (int i=0; i<sizeProp(); i++) {
					if (getProp(i).getTipe() == 2) {
						if (getProp(i).getLvl() == 3) {
                            mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 1 rumah\n");
						} else if (getProp(i).getLvl() == 4) {
                            mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 2 rumah\n");
						} else if (getProp(i).getLvl() == 5) {
                            mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 3 rumah\n");
						} else if (getProp(i).getLvl() == 6) {
                            mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 4 rumah\n");
						} else {
                            mainFrame.setLog((i+1)+". "+getProp(i).getName() +"\n");
						}
					} else {
                        mainFrame.setLog((i+1)+". "+getProp(i).getName()+ "\n");
					}
				}
				//metode jual properti
                mainFrame.setLog("Silahkan masukkan nomor urutan properti yang ingin Anda jual:\n");
				int nom = 1;
				getProp(nom).jualProp(this, mainFrame);
			}
			if (getMoney() < x) {
				setKalah(mainFrame);
			} else {
				this.playerMoney -= x;
				mainFrame.setLog ("Player" + playerID + " berhasil mengeluarkan uang sebesar " + x + ".\n");
			}
     }
	 
	 public void pay(Player p, int x, MonopolyFrame mainFrame) {
		while (getMoney() < x && sizeProp() > 0) {
			mainFrame.setLog("Uang Anda tidak cukup. Silahkan lakukan jual properti untuk mendapatkan uang.\n");
			mainFrame.setLog("Berikut ini properti yang Anda miliki:\n");
			for (int i=0; i<sizeProp(); i++) {
				if (getProp(i).getTipe() == 2) {
					if (getProp(i).getLvl() == 3) {
						mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 1 rumah\n");
					} else if (getProp(i).getLvl() == 4) {
						mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 2 rumah\n");
					} else if (getProp(i).getLvl() == 5) {
						mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 3 rumah\n");
					} else if (getProp(i).getLvl() == 6) {
						mainFrame.setLog((i+1)+". "+getProp(i).getName()+" dengan 4 rumah\n");
					} else {
						mainFrame.setLog((i+1)+". "+getProp(i).getName() + "\n");
					}
				} else {
					mainFrame.setLog((i+1)+". "+getProp(i).getName() + "\n");
				}
			}
			//metode jual properti
			mainFrame.setLog("Silahkan masukkan nomor urutan properti yang ingin Anda jual:\n");
			int nom = 1;
			getProp(nom).jualProp(this, mainFrame);
		}
		if (getMoney() < x) {
			setKalah(mainFrame);
		} else { 
			this.playerMoney -= x;
			p.playerMoney += x;
			mainFrame.setLog("Player " + this.playerID + " berhasil mengeluarkan uang sebesar " + x + " ke Player " + p.playerID + "\n");
		}
	 }
	 
	 public void receive(int x, MonopolyFrame mainFame) {
          this.playerMoney += x;
          mainFame.setLog("Player " + playerID + " berhasil mendapatkan uang sebesar " + x + ".\n");
     }

     public void addProp(Property p, MonopolyFrame mainFrame) {
          prop.add(p);
          mainFrame.setLog("Player " + playerID + " berhasil membeli sebuah properti.\n");
     }
	 
	 public void removeProp(Property p, MonopolyFrame mainFrame) {
		 for (int i=0; i<sizeProp(); i++) {
			if (getProp(i) == p) {
				prop.remove(i);
			}
		 }
         mainFrame.setLog("Player " + playerID + " berhasil menjual sebuah properti.\n");
     }
     
     public Property getProp(int i) {
		 return prop.get(i);
	 }
	 
	 public int sizeProp() {
		 return prop.size();
	 }

     public boolean getJail() {
          return this.playerJail;
     }

     public void inJail(MonopolyFrame mainFrame) {
          this.playerJail = true;
		  setPos(10, mainFrame);
		  mainFrame.setLog("Player " + playerID + " masuk penjara.\n");
     }

     public void outJail(MonopolyFrame mainFrame) {
          this.playerJail = false;
		  mainFrame.setLog("Player " + playerID + " keluar penjara.\n");
     }
     
     public int upAvail(int x) {
		 int n = 0;
		 for (int i = 0 ; i < prop.size() ; i++) {
			 if (prop.get(i).getSet() == x) {
				 n++;
			 }
		 }
		 return n;
	 }
	 
	 public void upProp(Property p, int i, int k) { //k=set,
		if (prop.get(i).getSet() == k) {
			p.upLvl();
		}
	 }
	 
	 public void downProp(Property p, int i, int k) { //k=set,
		if (prop.get(i).getSet() == k) {
			p.downLvl();
		}
	 }
}
