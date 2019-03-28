public abstract class Property extends Place{ //abstract class
	private Player owner;
	private int price;
	private int type; /* 0: Utility, 1: Railroad, 2: Lot */ 
	private int lvl;
	
	public Property (String name, int type, int price){
		super(name,1);
		this.type = type;
		this.price = price;
		this.lvl = 0;
		this.owner = null;
	}
	
	public Player getOwner(){
		return this.owner;
	}
	
	public void setOwner(Player p){
		this.owner = p;
	}
	
	public void propAffect(Player p){
		if (!(getOwner()==null) && !(getOwner().equals(p))) {
			p.pay(getOwner(),getRent());
		}
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public abstract int getRent();
	
	public void lvlup(Player P) {
		//msh bingung caranya,ada yg bisa?
	}
	
	public int getLvl(){
		return this.lvl;
	}
}