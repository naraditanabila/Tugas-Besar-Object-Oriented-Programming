import java.util.Scanner;

public class Space extends Place {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private int step;
	private int cost;
	
	public Space(String name, int step, int cost){
		super(name,0);
		this.step = step;
		this.cost = cost;
	}
	
	public int getStep(){
		return this.step;
	}
	
	public void setStep(int step){
		this.step=step;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public void setCost(int cost){
		this.cost=cost;
	}
	
	//Space Effects
    public void placeAffect(Player p){
			if (getName().equals("Start")) {
				p.cekStart();
			} else if (getName().equals("Free Parking")) {
				Scanner s = new Scanner(System.in);
				String plot = s.next();
				//int index = place.indexOf(plot);
				//p.setPos(index);
				placeAffect(p);
			} else if (getName().equals("Penjara")) {
				System.out.println ("Player "+ p.getID() + "hanya lewat penjara.");
			} else if (getName().equals("Go to Jail")) {
				p.inJail();
			} else if (getName().equals("Tax")) {
				p.pay(getCost());
			} else if (getName().equals("Chance Card")) {
				ChanceCard cc = new ChanceCard();
				int n = cc.getNum();
				cc.chanceAction(n, p);
				cc.print(n);		
			} else if (getName().equals("Community Chest")) {
				CommunityChest cr = new CommunityChest();
				int c = cr.getNum();
				cr.chestAction(c, p);
				cr.print(c);
			} 
		}
}
