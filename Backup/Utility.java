//package monopoly;

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
	
	public void lvlup (Player p) {
		System.out.println("Method upgrade hanya untuk Lot!");
	}
	
}
