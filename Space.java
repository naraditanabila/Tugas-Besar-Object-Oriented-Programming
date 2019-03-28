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
	
	public void spaceAffect(Player p, ChanceCard a){
		if (getNameSpace().equals("Start")) {
			p.cekStart();
		} else if (getNameSpace().equals("Free Parking")) {
			Scanner s = new Scanner(System.in);
			String plot = s.next();
			p.setPos(plot);
			if (p.getPos().getKey().equals("Space")) {
				((Space)p.getPos().getPlace()).spaceAffect(p);
			} else {
				((Property)p.getPos().getPlace()).propAffect(p);
			}
		} else if (getNameSpace().equals("Penjara")) {
			System.out.println ("Player "+ p.getID() + "hanya lewat penjara.");
		} else if (getNameSpace().equals("Go to Jail")) {
			p.inJail();
		} else if (getNameSpace().equals("Tax")) {
			p.pay(this.cost);
		} else if (getNameSpace().equals("Chance Card")) {
			//method dari chance card
		} else if (getNameSpace().equals("Community Chest")) {
			//method dari community chest
		} 
	}
}