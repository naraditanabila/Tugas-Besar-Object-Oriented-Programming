public class Utility extends Property { //inheritance
	public Utility (String name){
		super(name,0,800,5);
	}
	
	@Override
	public int getRent(){ //polymorphism, yeayy!
		if (getLvl()==1) {
			return 1/8*getPrice();
		} else {
			return 1/2*getPrice();
		}
	}
	
}
