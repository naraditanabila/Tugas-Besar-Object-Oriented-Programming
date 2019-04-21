package monopoly;

public class Utility extends Property { //inheritance
	public Utility (String name){
		super(name,0,800,5);
	}
	
	@Override
	public int getRent(){ //polymorphism, yeayy!
		if (getLvl()==1) {
			return getPrice()/8;
		} else {
			return getPrice()/2;
		}
	}
	
        @Override
	public void lvlup (Player p, javax.swing.JTextArea gameLog) {
		gameLog.append("Method upgrade hanya untuk Lot!");
	}
	
}