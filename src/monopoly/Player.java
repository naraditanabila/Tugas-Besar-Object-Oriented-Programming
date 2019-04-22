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
	 
     public void setPos(int x, javax.swing.JTextArea gameLog) {
          if (x<this.playerPos && x>0) {
			  gameLog.append("Player "+playerID+" berhasil melewati kotak Start.\n");
			  this.playerMoney+=200;
		  }
		  this.playerPos = x;
          gameLog.append("Player "+playerID+" berhasil pindah tempat\n");
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
     
     public void setKalah(javax.swing.JTextArea gameLog) {
		 this.kalah = true;
		 gameLog.append("Maaf, Anda kehabisan uang dan properti.\n");
		 gameLog.append("Player "+playerID+" kalah.\n");
	 }
	 
	 public boolean getKalah () {
		 return this.kalah;
	 }
     //Other methods
     public void move(int x, javax.swing.JTextArea gameLog) {
          this.playerPos += x;
		  if (this.playerPos>39) {
			  gameLog.append("Player "+playerID+" berhasil melewati kotak Start.\n");
			  this.playerPos = this.playerPos-40;
			  if (this.playerPos>0) {
				this.playerMoney += 200;
			  }
		  }
		  if (x>=0){
			gameLog.append("Player "+playerID+" berhasil maju sebanyak "+x+" kotak.\n");
		  } else {
			  gameLog.append("Player "+playerID+" berhasil mundur sebanyak "+(x*-1)+" kotak.\n");
		  }
     }
	 
	 public void cekStart() {
		 if (this.playerPos ==0) {
				this.playerMoney += 200;
		 }
	 }

     public void pay(int x, javax.swing.JTextArea gameLog) {
			while (getMoney() < x && sizeProp() > 0) {
				gameLog.append("Uang Anda tidak cukup. Silahkan lakukan jual properti untuk mendapatkan uang.\n");
				gameLog.append("Berikut ini properti yang Anda miliki:\n");
				for (int i=0; i<sizeProp(); i++) {
					if (getProp(i).getTipe() == 2) {
						if (getProp(i).getLvl() == 3) {
							gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 1 rumah\n");
						} else if (getProp(i).getLvl() == 4) {
							gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 2 rumah\n");
						} else if (getProp(i).getLvl() == 5) {
							gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 3 rumah\n");
						} else if (getProp(i).getLvl() == 6) {
							gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 4 rumah\n");
						} else {
							gameLog.append((i+1)+". "+getProp(i).getName() +"\n");
						}
					} else {
						gameLog.append((i+1)+". "+getProp(i).getName()+ "\n");
					}
				}
				//metode jual properti
				gameLog.append("Silahkan masukkan nomor urutan properti yang ingin Anda jual:\n");
				int nom = 1;
				getProp(nom).jualProp(this, gameLog);
			}
			if (getMoney() < x) {
				setKalah(gameLog);
			} else {
				this.playerMoney -= x;
				gameLog.append("Player " + playerID + " berhasil mengeluarkan uang sebesar " + x + ".\n");
			}
     }
	 
	 public void pay(Player p, int x, javax.swing.JTextArea gameLog) {
		while (getMoney() < x && sizeProp() > 0) {
			gameLog.append("Uang Anda tidak cukup. Silahkan lakukan jual properti untuk mendapatkan uang.\n");
			gameLog.append("Berikut ini properti yang Anda miliki:\n");
			for (int i=0; i<sizeProp(); i++) {
				if (getProp(i).getTipe() == 2) {
					if (getProp(i).getLvl() == 3) {
						gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 1 rumah\n");
					} else if (getProp(i).getLvl() == 4) {
						gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 2 rumah\n");
					} else if (getProp(i).getLvl() == 5) {
						gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 3 rumah\n");
					} else if (getProp(i).getLvl() == 6) {
						gameLog.append((i+1)+". "+getProp(i).getName()+" dengan 4 rumah\n");
					} else {
						gameLog.append((i+1)+". "+getProp(i).getName() + "\n");
					}
				} else {
					gameLog.append((i+1)+". "+getProp(i).getName() + "\n");
				}
			}
			//metode jual properti
			gameLog.append("Silahkan masukkan nomor urutan properti yang ingin Anda jual:\n");
			int nom = 1;
			getProp(nom).jualProp(this, gameLog);
		}
		if (getMoney() < x) {
			setKalah(gameLog);
		} else { 
			this.playerMoney -= x;
			p.playerMoney += x;
			gameLog.append("Player " + this.playerID + " berhasil mengeluarkan uang sebesar " + x + " ke Player " + p.playerID + "\n");
		}
	 }
	 
	 public void receive(int x, javax.swing.JTextArea gameLog) {
          this.playerMoney += x;
          gameLog.append("Player " + playerID + " berhasil mendapatkan uang sebesar " + x + ".\n");
     }

     public void addProp(Property p, javax.swing.JTextArea gameLog) {
          prop.add(p);
          gameLog.append("Player " + playerID + " berhasil membeli sebuah properti.\n");
     }
	 
	 public void removeProp(Property p, javax.swing.JTextArea gameLog) {
		 for (int i=0; i<sizeProp(); i++) {
			if (getProp(i) == p) {
				prop.remove(i);
			}
		 }
         gameLog.append("Player " + playerID + " berhasil menjual sebuah properti.\n");
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

     public void inJail(javax.swing.JTextArea gameLog) {
          this.playerJail = true;
		  this.playerPos = 10;
		  gameLog.append("Player " + playerID + " masuk penjara.\n");
     }

     public void outJail(javax.swing.JTextArea gameLog) {
          this.playerJail = false;
		  gameLog.append("Player " + playerID + " keluar penjara.\n");
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
