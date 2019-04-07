import java.util.List;
import java.util.ArrayList;

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
          if (x<this.playerPos) {
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
	 }
	 
	 public boolean getKalah () {
		 return this.kalah;
	 }
     //Other methods
     public void move(int x) {
          this.playerPos += x;
		  if (this.playerPos>39) {
			  this.playerPos = this.playerPos-40;
			  this.playerMoney += 200;
		  }
		  System.out.println("Player "+playerID+" berhasil maju sebanyak "+x+" kotak.");
     }
	 
	 public void cekStart() {
		 if (this.playerPos ==0) {
				this.playerMoney += 200;
		 }
	 }

     public void pay(int x) {
          this.playerMoney -= x;
          System.out.println("Player " + playerID + " berhasil mengeluarkan uang sebesar " + x + ".");
     }
	 
	 public void pay(Player p, int x) {
		 this.playerMoney -= x;
		 p.playerMoney += x;
		 System.out.println("Player " + this.playerID + " berhasil mengeluarkan uang sebesar " + x + " ke Player " + p.playerID);
	 }
	 
	 public void receive(int x) {
          this.playerMoney += x;
          System.out.println("Player " + playerID + " berhasil mendapatkan uang sebesar " + x + ".");
     }

     public void addProp(Property p) {
          prop.add(p);
          System.out.println("Player " + playerID + " berhasil membeli sebuah properti.");
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
			p.setLvl();
		}
	 }
}
