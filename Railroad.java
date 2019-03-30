public class Railroad extends Property { //inheritance
	public Railroad (String name){
		super(name,1,200,2);
	}
	
	public int getRent(){
		if (getLvl()==1) {
			return 1/8*getPrice();
		} else if (getLvl()==2) {
			return 1/4*getPrice();
		} else if (getLvl()==3) {
			return 1/2*getPrice();
		} else {
			return getPrice();
		} 
	}
	
}
