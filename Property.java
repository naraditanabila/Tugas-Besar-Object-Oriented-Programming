import java.util.ArrayList;
import java.util.List;


public class Property extends Place{ //abstract class
	private Player owner;
	private int price;
	private int type; /* 0: Utility, 1: Railroad, 2: Lot */ 
	private int lvl;
	private int set; /* 2: Railroad, 5: Utility */
	private int housePrice;
	
	public Property (String name, int type, int price, int set){
		super(name, 1);
		this.type = type;
		this.price = price;
		this.lvl = 0;
		this.set = set;
		this.housePrice = price/2;
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
	
	public void setSet(int n) {
		this.set = n;
	}
	
	public int getSet() {
		return this.set;
	}
	
	public int getHP() {
		return this.housePrice;
	}
	//Efek saat player berhenti di suatu tempat
	public void placeAffect(Player p){
		if (!(getOwner()==null) && !(getOwner().equals(p))) {
			p.pay(getOwner(),getRent());
		}
	}
	
	//Beli Properti, dilakukan override pada kelas util dan railroad
	public void beliProp(Player p) {
		if (p.getMoney() < getPrice()) {
			System.out.println("Uang anda saat ini " + p.getMoney() + ", tidak cukup untuk dibelikan properti ini");
		} else {
			setOwner(p);
			lvlup(p);
			p.pay(getPrice());
			System.out.println("Uang dikurangi sebesar " + getPrice() + ".");
			System.out.println("Player sukses membeli properti");
		}
	}
	

	public void lvlup(Player p) {
		if (this.lvl == 0) {
			if ((this.owner == p) && (p.getMoney() >= getHP())) {
				this.lvl = 1;
			} else {
				System.out.println("pemilik berbeda");
			}
		} else {
			int x = getSet();
			if ((x == 1) || (x == 10)) {
				if ((p.upAvail(x) == 2) && (getLvl() < 4)) {
					this.lvl = getLvl() + 1;
				} else {
					System.out.println("Belum punya satu komplek");
				}
			} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
				if ((p.upAvail(x) == 3) && (getLvl() < 4)) {
					this.lvl = getLvl() + 1;
				} else {
					System.out.println("Belum punya satu komplek");
				}
			}
		}
	}
	
	public int getLvl(){
		return this.lvl;
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