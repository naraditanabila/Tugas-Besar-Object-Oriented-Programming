import java.util.ArrayList;
import java.util.List;


public abstract class Property extends Place{ //abstract class
	private Player owner;
	private int price;
	private int type; /* 0: Utility, 1: Railroad, 2: Lot */ 
	private int lvl;
	List<Place> p = new ArrayList<Place>();
	
	public Property (String name, int type, int price){
		super(name, 1);
		this.type = type;
		this.price = price;
		this.lvl = 0;
		this.owner = null;
	}
	
	//getter dan setter
	public Player getOwner(){
		return this.owner;
	}
	
	public void setOwner(Player p){
		this.owner = p;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	//Efek saat player berhenti di suatu tempat
	public void placeAffect(Player p){
		if (!(getOwner()==null) && !(getOwner().equals(p))) {
			p.pay(getOwner(),getRent());
		}
	}
	
	public abstract int getRent();
	
	//Beli Properti
	public void beliProp(Player p) {
		if (p.getMoney() < getPrice()) {
			System.out.println("Uang anda saat ini " + p.getMoney() + ", tidak cukup untuk dibelikan properti ini");
		} else {
			setOwner(p);
			p.pay(getPrice());
			System.out.println("Uang dikurangi sebesar " + getPrice() + ".");
			System.out.println("Player sukses membeli properti");
		}
	}
	
	public void lvlup(Player P) {
		//msh bingung caranya,ada yg bisa?
	}
	
	public int getLvl(){
		return this.lvl;
	}
}
