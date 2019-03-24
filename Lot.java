public class Lot extends Property { //inheritance
	private int housePrice;
	private String set;
	
	public Lot (String name, String set, int type, int price, int housePrice){
		super(name,2,price);
		this.set = set;
		this.housePrice = housePrice;
	}
	
	public String getSet(){
		return this.set;
	}
	
	public int getHousePrice(){
		return this.housePrice;
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
	
	@Override
	public void lvlup(Player P) { //Polymorphism
		////msh bingung caranya,ada yg bisa?
	}
}