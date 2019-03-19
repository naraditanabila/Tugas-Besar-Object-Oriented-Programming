//File : Player.java

public class Player {

     // parameter
     private int playerID;
     private int playerPos;
     private int playerMoney;
     private int playerProp;

     //Methods

     //Constructor
     public Player(int id) {
     this.playerID = id;
     this.playerPos = 0;
     this.playerMoney = 0;
     this.playerProp = 0;
     }


     //Get Setter
     public void setPos(int x) {
          this.playerPos = x;
          System.out.println("Player setPos " + x);
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
          System.out.println("Player " + playerID + "berhasil berjalan sejauh " + x +" petak.");
     }

     public void pay(int x) {
          this.playerMoney -= x;
          System.out.println("Player " + playerID + "berhasil mengeluarkan uang sebesar " + x + " .");
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
