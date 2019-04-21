package monopoly;

public class Railroad extends Property { //inheritance
	public Railroad (String name){
		super(name,1,1000,2);
	}
	
	public void lvlup (Player p) {
		gameLog.append("Method upgrade hanya untuk Lot!");
	}
}
