package monopoly;

import java.util.ArrayList;
import java.util.List;


public class Property extends Place{ //inheritance
	private Player owner;
	private int price;
	private int tipe; /* 0: Utility, 1: Railroad, 2: Lot */ 
	private int lvl;
	private int set; /* 2: Railroad, 5: Utility */
	private int housePrice;
	
	public Property (String name, int tipe, int price, int set){
		super(name, 1);
		this.tipe = tipe;
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
	
	public int getTipe(){
		return this.tipe;
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
	
	public void setLvl(int n) {
		this.lvl = n;
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
	
	public void beliProp(Player p, javax.swing.JTextArea gameLog) {
		if (p.getMoney() < getPrice()) {
			gameLog.append("Uang anda tidak cukup untuk dibelikan properti ini");
		} else if (getOwner() == p) {
			gameLog.append("Properti ini milik anda, silahkan lakukan upgrade bila uang mencukupi");
		} else {
			if (p.getMoney() < getPrice()) {
			System.out.println("Uang anda tidak cukup untuk dibelikan properti ini");
		} else if (getOwner() == p) {
			System.out.println("Properti ini milik anda, silahkan lakukan upgrade bila uang mencukupi");
		} else {
			setOwner(p);
			p.pay(getPrice());
			p.addProp(this);
			int n = (p.upAvail(getSet()) - 1); //membaca jumlah set dikurangi 1
			this.lvl = n;
			for (int i = 0 ; i < p.sizeProp() ; i++) {
				p.upProp(p.getProp(i), i, getSet());
			}
			gameLog.append("Level Bangunan Sekarang : " + getLvl());
		}
	}
	
	public void jualProp(Player p, javax.swing.JTextArea gameLog) {
		p.receive(getPrice()/2);
		for (int i = 0 ; i < p.sizeProp() ; i++) {
			p.downProp(p.getProp(i), i, this.set);
		}
		p.removeProp(this);
		this.owner=null;
		this.lvl=0;
		gameLog.append("Kamu berhasi menjual properti.");
	}
	
	//method cuma bisa diakses oleh Player yang memiliki
	public void lvlup(Player p, javax.swing.JTextArea gameLog) {
		int x = getSet();
			if (p.getMoney() >= getHP()) {
				if ((x == 1) || (x == 10)) {
					if ((p.upAvail(x) == 2) && (getLvl() < 6)) {
						p.pay(getHP());
						upLvl();
					} else {
						gameLog.append("Belum punya satu komplek");
					}
				} else if ((x == 3) || (x == 4) || (x == 6) || (x == 7) || (x == 8) || (x == 9)){
					if ((p.upAvail(x) == 3) && (getLvl() < 6)) {
						p.pay(getHP());
						upLvl();
					} else {
						gameLog.append("Belum punya satu komplek");
					}
				} 
			} else {
				gameLog.append("Uang anda tidak mencukupi");
			}
	}
	
	public int getLvl(){
		return this.lvl;
	}
	
	public void upLvl() {
		this.lvl++;
		//System.out.println("Level bangunan anda sekarang adalah " + getLvl());
	}
	
	public void downLvl() {
		this.lvl--;
		//System.out.println("Level bangunan anda sekarang adalah " + getLvl());
	}
	
	public int getRent(){
		if (getLvl()==1) {
			return getPrice()/8;
		} else if (getLvl()==2) {
			return getPrice()/4;
		} else if (getLvl()==3) {
			return getPrice()/2;
		} else if (getLvl()==4) {
			return getPrice();
		} else if (getLvl()==5) {
			return 2*getPrice();
		} else {
			return 4*getPrice();
		}
	}
}
