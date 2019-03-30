public class Lot extends Property { //inheritance
	public Lot (String name, int set, int price){
		super(name,2,price,set);
	}
	
	public int getRent(){
		if (getLvl()==1) {
			return 1/8*getPrice();
		} else if (getLvl()==2) {
			return 1/4*getPrice();
		} else if (getLvl()==3) {
			return 1/2*getPrice();
		} else if (getLvl()==4) {
			return 1*getPrice();
		} else if (getLvl()==5) {
			return 2*getPrice();
		} else {
			return 4*getPrice();
		}
	}
}
