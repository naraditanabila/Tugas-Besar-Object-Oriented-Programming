package monopoly;

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
	 
     public void setPos(int x) {
          if (x<this.playerPos && x>0) {
			  System.out.println("Player "+playerID+" berhasil melewati kotak Start.");
			  this.playerMoney+=200;
		  }
		  this.playerPos = x;
          System.out.println("Player "+playerID+" berhasil pindah tempat");
     }

     public int getPos() {
          return playerPos;
     }

     public void setMoney(int x) {
          this.playerMoney = x;
          System.out.println("Player setMon " + x);
     }

     public int getMoney() {
          return this.playerMoney;
     }
     
     public void setKalah() {
		 this.kalah = true;
		 System.out.println("Maaf, Anda kehabisan uang dan properti.");
		 System.out.println("Player "+playerID+" kalah.");
	 }
	 
	 public boolean getKalah () {
		 return this.kalah;
	 }
     //Other methods
     public void move(int x) {
          this.playerPos += x;
		  if (this.playerPos>39) {
			  System.out.println("Player "+playerID+" berhasil melewati kotak Start.");
			  this.playerPos = this.playerPos-40;
			  if (this.playerPos>0) {
				this.playerMoney += 200;
			  }
		  }
		  if (x>=0){
			System.out.println("Player "+playerID+" berhasil maju sebanyak "+x+" kotak.");
		  } else {
			  System.out.println("Player "+playerID+" berhasil mundur sebanyak "+(x*-1)+" kotak.");
		  }
     }
	 
	 public void cekStart() {
		 if (this.playerPos ==0) {
				this.playerMoney += 200;
		 }
	 }

     public void pay(int x) {
			while (getMoney() < x && sizeProp() > 0) {
				System.out.println("Uang Anda tidak cukup. Silahkan lakukan jual properti untuk mendapatkan uang.");
				System.out.println("Berikut ini properti yang Anda miliki:");
				for (int i=0; i<sizeProp(); i++) {
					if (getProp(i).getTipe() == 2) {
						if (getProp(i).getLvl() == 3) {
							System.out.println((i+1)+". "+getProp(i).getName()+" dengan 1 rumah");
						} else if (getProp(i).getLvl() == 4) {
							System.out.println((i+1)+". "+getProp(i).getName()+" dengan 2 rumah");
						} else if (getProp(i).getLvl() == 5) {
							System.out.println((i+1)+". "+getProp(i).getName()+" dengan 3 rumah");
						} else if (getProp(i).getLvl() == 6) {
							System.out.println((i+1)+". "+getProp(i).getName()+" dengan 4 rumah");
						} else {
							System.out.println((i+1)+". "+getProp(i).getName());
						}
					} else {
						System.out.println((i+1)+". "+getProp(i).getName());
					}
				}
				//metode jual properti
				Scanner s = new Scanner(System.in);
				System.out.println("Silahkan masukkan nomor urutan properti yang ingin Anda jual:");
				int nom = s.nextInt() - 1;
				getProp(nom).jualProp(this);
			}
			if (getMoney() < x) {
				setKalah();
			} else {
				this.playerMoney -= x;
				System.out.println("Player " + playerID + " berhasil mengeluarkan uang sebesar " + x + ".");
			}
     }
	 
	 public void pay(Player p, int x) {
		while (getMoney() < x && sizeProp() > 0) {
			System.out.println("Uang Anda tidak cukup. Silahkan lakukan jual properti untuk mendapatkan uang.");
			System.out.println("Berikut ini properti yang Anda miliki:");
			for (int i=0; i<sizeProp(); i++) {
				if (getProp(i).getTipe() == 2) {
					if (getProp(i).getLvl() == 3) {
						System.out.println((i+1)+". "+getProp(i).getName()+" dengan 1 rumah");
					} else if (getProp(i).getLvl() == 4) {
						System.out.println((i+1)+". "+getProp(i).getName()+" dengan 2 rumah");
					} else if (getProp(i).getLvl() == 5) {
						System.out.println((i+1)+". "+getProp(i).getName()+" dengan 3 rumah");
					} else if (getProp(i).getLvl() == 6) {
						System.out.println((i+1)+". "+getProp(i).getName()+" dengan 4 rumah");
					} else {
						System.out.println((i+1)+". "+getProp(i).getName());
					}
				} else {
					System.out.println((i+1)+". "+getProp(i).getName());
				}
			}
			//metode jual properti
			Scanner s = new Scanner(System.in);
			System.out.println("Silahkan masukkan nomor urutan properti yang ingin Anda jual:");
			int nom = s.nextInt() - 1;
			getProp(nom).jualProp(this);
		}
		if (getMoney() < x) {
			setKalah();
		} else { 
			this.playerMoney -= x;
			p.playerMoney += x;
			System.out.println("Player " + this.playerID + " berhasil mengeluarkan uang sebesar " + x + " ke Player " + p.playerID);
		}
	 }
	 
	 public void receive(int x) {
          this.playerMoney += x;
          System.out.println("Player " + playerID + " berhasil mendapatkan uang sebesar " + x + ".");
     }

     public void addProp(Property p) {
          prop.add(p);
          System.out.println("Player " + playerID + " berhasil membeli sebuah properti.");
     }
	 
	 public void removeProp(Property p) {
		 for (int i=0; i<sizeProp(); i++) {
			if (getProp(i) == p) {
				prop.remove(i);
			}
		 }
         System.out.println("Player " + playerID + " berhasil menjual sebuah properti.");
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

     public void inJail() {
          this.playerJail = true;
		  this.playerPos = 10;
		  System.out.println("Player " + playerID + " masuk penjara.");
     }

     public void outJail() {
          this.playerJail = false;
		  System.out.println("Player " + playerID + " keluar penjara.");
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
