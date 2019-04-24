package src.monopoly;

public class Lot extends Property { //inheritance
	private int housePrice;
	
	public Lot (String name, int set, int price){
		super(name,2,price,set);
		this.housePrice = price/2;
	}
	
	public void jualProp(Player p, MonopolyFrame mainFrame) {
		if (this.getLvl() <3) {
			p.receive(getPrice()/2, mainFrame);
		} else {
			p.receive((getPrice()+getHP()*(this.getLvl()-2))/2, mainFrame);
		}
		p.removeProp(this, mainFrame);
		this.setOwner(null);
		this.setLvl(0);
	}
	
	public void beliProp(Player p, MonopolyFrame mainFrame) {
		if (p.getMoney() < getPrice()) {
			mainFrame.setLog("Uang anda tidak cukup untuk dibelikan properti ini\n");
		} else if (getOwner() == p) {
			mainFrame.setLog("Properti ini milik anda, silahkan lakukan upgrade bila uang mencukupi\n");
		} else {
			setOwner(p);
			p.pay(getPrice(), mainFrame);
			p.addProp(this, mainFrame);
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
			mainFrame.setLog("Level Bangunan Sekarang : " + getLvl() + "\n");
		}
	}
	
	public int getHP() {
		return this.housePrice;
	}
	
	public void lvlup(Player p, MonopolyFrame mainFrame) {
		int x = getSet();
			if (p.getMoney() >= getHP()) {
				if ((x == 1) || (x == 10)) {
					if ((p.upAvail(x) == 2) && (getLvl() < 6)) {
						p.pay(getHP(), mainFrame);
						upLvl();
					} else {
						mainFrame.setLog("Belum punya satu komplek\n");
					}
				} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
					if ((p.upAvail(x) == 3) && (getLvl() < 6)) {
						p.pay(getHP(), mainFrame);
						upLvl();
					} else {
						mainFrame.setLog("Belum punya satu komplek\n");
					}
				} 
			} else {
				mainFrame.setLog("Uang anda tidak mencukupi\n");
			}
	}
}
