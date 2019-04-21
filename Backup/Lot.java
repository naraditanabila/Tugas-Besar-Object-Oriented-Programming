//package monopoly;

public class Lot extends Property { //inheritance
	private int housePrice;
	
	public Lot (String name, int set, int price){
		super(name,2,price,set);
		this.housePrice = price/2;
	}
	
	@Override
	public void jualProp(Player p) {
		if (this.getLvl() <3) {
			p.receive(getPrice()/2);
		} else {
			p.receive((getPrice()+getHP()*(this.getLvl()-2))/2);
		}
		p.removeProp(this);
		this.setOwner(null);
		this.setLvl(0);
	}
	
	public int getHP() {
		return this.housePrice;
	}
	
	//method cuma bisa diakses oleh Player yang memiliki
	public void lvlup(Player p) {
			int x = getSet();
			if (p.getMoney() >= getHP()) {
				if ((x == 1) || (x == 10)) {
					if ((p.upAvail(x) == 2) && (getLvl() < 6)) {
						p.pay(getHP());
						upLvl();
					} else {
						System.out.println("Belum punya satu komplek");
					}
				} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
					if ((p.upAvail(x) == 3) && (getLvl() < 6)) {
						p.pay(getHP());
						upLvl();
					} else {
						System.out.println("Belum punya satu komplek");
					}
				} 
			} else {
				System.out.println("Uang anda tidak mencukupi");
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
			p.addProp(this);
			this.setLvl(1);
			int x = getSet();
			if (x == 1 || x == 10) {
				if ((p.upAvail(x) == 2) && (getLvl() < 6)) {
					for (int i = 0 ; i < p.sizeProp() ; i++) {
						p.upProp(p.getProp(i), i, x);
					}
				}
			} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
				if ((p.upAvail(x) == 3) && (getLvl() < 6)) {
					for (int i = 0 ; i < p.sizeProp() ; i++) {
						p.upProp(p.getProp(i), i, x);
					}
				}
			}
			System.out.println("Level Bangunan Sekarang : " + getLvl());
		}
	}
}
