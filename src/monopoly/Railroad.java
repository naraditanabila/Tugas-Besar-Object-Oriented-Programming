package monopoly;

public class Railroad extends Property { //inheritance
	public Railroad (String name){
		super(name,1,1000,2);
	}
	
        @Override
	public void lvlup (Player p, javax.swing.JTextArea gameLog) {
		gameLog.append("Method upgrade hanya untuk Lot!");
	}
}
