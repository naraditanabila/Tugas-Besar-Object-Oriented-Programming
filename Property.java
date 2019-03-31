import java.util.ArrayList;
import java.util.List;


public class Property extends Place{ //inheritance
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
	
	public void beliProp(Player p) {
		if (p.getMoney() < getPrice()) {
			System.out.println("Uang anda tidak cukup untuk dibelikan properti ini");
		} else if (getOwner() == p) {
			System.out.println("Properti ini milik anda, silahkan lakukan upgrade bila uang mencukupi");
		} else {
			setOwner(p);
			p.pay(getPrice());
			//System.out.println("Uang dikurangi sebesar " + getPrice() + ".");
			//System.out.println("Player sukses membeli properti");
			p.addProp(this);
			if (getSet() == 2) {
				int n = (p.upAvail(2) - 1); //membaca jumlah set dikurangi 1
				this.lvl = n;
				p.upProp(this);
			} else if (getSet() == 5) {
				int n = (p.upAvail(5) - 1); //membaca jumlah set dikurangi 1
				this.lvl = n;
				p.upProp(this);
			} else {
				setOwner(p);
				lvlup(p);
			}
		}
	}
	
	//method cuma bisa diakses oleh Player yang memiliki
	public void lvlup(Player p) {
		if (this.lvl == 0) {
			if ((this.owner == p) && (p.getMoney() >= getHP())) {
				this.lvl = 1;
			} else {
				System.out.println("pemilik berbeda");
			}
		} else {
			int x = getSet();
			if (p.getMoney() >= getHP()) {
				if ((x == 1) || (x == 10)) {
					if ((p.upAvail(x) == 2) && (getLvl() < 6)) {
						p.pay(getHP());
						setLvl();
					} else {
						System.out.println("Belum punya satu komplek");
					}
				} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
					if ((p.upAvail(x) == 3) && (getLvl() < 6)) {
						p.pay(getHP());
						setLvl();
					} else {
						System.out.println("Belum punya satu komplek");
					}
				}
			} else {
				System.out.println("Uang anda tidak mencukupi");
			}
		}
	}
	
	public int getLvl(){
		return this.lvl;
	}
	
	public void setLvl() {
		this.lvl++;
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
