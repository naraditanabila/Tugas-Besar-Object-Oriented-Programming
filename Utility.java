public class Utility extends Property { //inheritance
	public Utility (String name){
		super(name,0,150);
	}
	
	public int getRent(){
		if (getLvl()==1) {
			return 1/8*getPrice();
		} else {
			return 1/2*getPrice();
		}
	}
	
}