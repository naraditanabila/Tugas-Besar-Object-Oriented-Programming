package monopoly;

public class Lot extends Property { //inheritance
	private int housePrice;
	
	public Lot (String name, int set, int price){
		super(name,2,price,set);
		this.housePrice = price/2;
	}
	
	public void jualProp(Player p, javax.swing.JTextArea gameLog) {
		if (this.getLvl() <3) {
			p.receive(getPrice()/2, gameLog);
		} else {
			p.receive((getPrice()+getHP()*(this.getLvl()-2))/2, gameLog);
		}
		p.removeProp(this, gameLog);
		this.setOwner(null);
		this.setLvl(0);
	}
	
	public void beliProp(Player p, javax.swing.JTextArea gameLog) {
		if (p.getMoney() < getPrice()) {
			gameLog.append("Uang anda tidak cukup untuk dibelikan properti ini");
		} else if (getOwner() == p) {
			gameLog.append("Properti ini milik anda, silahkan lakukan upgrade bila uang mencukupi");
		} else {
			setOwner(p);
			p.pay(getPrice(), gameLog);
			p.addProp(this, gameLog);
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
			gameLog.append("Level Bangunan Sekarang : " + getLvl());
		}
	}
	
	public int getHP() {
		return this.housePrice;
	}
	
	public void lvlup(Player p, javax.swing.JTextArea gameLog) {
		int x = getSet();
			if (p.getMoney() >= getHP()) {
				if ((x == 1) || (x == 10)) {
					if ((p.upAvail(x) == 2) && (getLvl() < 6)) {
						p.pay(getHP(), gameLog);
						upLvl();
					} else {
						gameLog.append("Belum punya satu komplek");
					}
				} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
					if ((p.upAvail(x) == 3) && (getLvl() < 6)) {
						p.pay(getHP(), gameLog);
						upLvl();
					} else {
						gameLog.append("Belum punya satu komplek");
					}
				} 
			} else {
				gameLog.append("Uang anda tidak mencukupi");
			}
	}
}
