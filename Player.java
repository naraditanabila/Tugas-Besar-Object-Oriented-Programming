//File : Player.java

public class Player extends Map {

     // parameter
     private int playerID;
     private Element playerPos;
     private int playerMoney;
     private int playerProp;

     //Methods

     //Constructor
     public Player(int id, Map map) {
     this.playerID = id;
     this.playerPos = map.getFirst();
     this.playerMoney = 1500;
     this.playerProp = 0;
     }


     //Get Setter
	 public int getID(){
		 return this.playerID;
	 }
	 
     public void setPos(String x) {
          while (!this.playerPos.getValue().equals(x)) {
			this.playerPos = this.playerPos.getNext();
			this.cekStart();
		  }
          System.out.println("Player "+playerID+" berhasil pindah ke "+x);
     }

     public Element getPos() {
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
          if (x<0) {
			  for (int i=0; i>x; i--) {
				  this.playerPos = this.playerPos.getPrev();
				  this.cekStart();
			  }
			  System.out.println("Player " + playerID + "berhasil berjalan mundur sejauh " + x +" petak.");
		  } else {
			  for (int i=0; i<x; i++) {
				  this.playerPos = this.playerPos.getNext();
				  this.cekStart();
			  }
			  System.out.println("Player " + playerID + "berhasil berjalan maju sejauh " + x +" petak.");
          }
     }
	 
	 public void cekStart() {
		 if (this.playerPos.getKey().equals("Space")){
			 if (this.playerPos.getValue().equals("Start")) {
				this.receive(200);
				System.out.println("Player " + playerID + "telah melewati start.");
			 }
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

     public void lvlUp(int x) {
          // masukkin method properti yg lvl up
          // emg perlu ya? wkwk
     }
}