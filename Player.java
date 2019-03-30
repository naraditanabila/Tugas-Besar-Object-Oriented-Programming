import java.util.List;
import java.util.ArrayList;

public class Player {

     // parameter
     private int playerID;
     private int playerPos;
     private int playerMoney;
     private int playerProp;
     List<Property> prop = new ArrayList<Property>();
     private boolean playerJail = false;

     //Methods

     //Constructor
     public Player(int id) {
     this.playerID = id;
     this.playerPos = 0;
     this.playerMoney = 1500;
     this.playerProp = 0;
     }


     //Get Setter
	 public int getID(){
		 return this.playerID;
	 }
	 
     public void setPos(int x) {
          while (this.playerPos != x) {
			this.playerPos++;
			this.cekStart();
		  }
          System.out.println("Player "+playerID+" berhasil tempat");
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

     public void setProp(int x) {
          this.playerProp = x;
          System.out.println("Player setProp " + x);
     }

     public int getProp() {
          return this.playerProp;
     }

     //Other methods
     public void move(int x) {
          this.playerPos += x;
		  if (this.playerPos>39) {
			  this.playerPos = this.playerPos-40;
			  this.playerMoney += 200;
		  }
     }
	 
	 public void cekStart() {
		 if (this.playerPos ==0) {
				this.playerMoney += 200;
		 }
	 }

     public void pay(int x) {
          this.playerMoney -= x;
          System.out.println("Player " + playerID + "berhasil mengeluarkan uang sebesar " + x + " .");
     }
	 
	 public void pay(Player p, int x) {
		 this.playerMoney -= x;
		 p.playerMoney += x;
		 System.out.println("Player " + this.playerID + "berhasil mengeluarkan uang sebesar " + x + " ke Player " + p.playerID);
	 }
	 
	 public void receive(int x) {
          this.playerMoney += x;
          System.out.println("Player " + playerID + "berhasil mendapatkan uang sebesar " + x + " .");
     }

     public void addProp() {
          this.playerProp += 1;
          System.out.println("Player " + playerID + "berhasil membeli sebuah properti.");
     }

     public void removeProp() {
          this.playerProp -= 1;
          System.out.println("Player " + playerID + "berhasil menjual sebuah properti.");
     }

     public boolean getJail() {
          return this.playerJail;
     }

     public void inJail() {
          this.playerJail = true;
		  System.out.println("Player " + playerID + "masuk penjara.");
     }

     public void outJail() {
          this.playerJail = false;
		  System.out.println("Player " + playerID + "keluar penjara.");
     }
     
     public int upAvail(int x) {
		 int n = 0;
		 for (int i = 1 ; i <= prop.size() ; i++) {
			 if (prop.get(i).getSet() == x) {
				 n++;
			 }
		 }
		 return n;
	 }
}
