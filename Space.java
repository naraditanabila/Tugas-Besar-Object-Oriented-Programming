import java.util.Scanner;

public class Space {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private String name;
	private int step;
	private int cost;
	
	public Space(String name, int step, int cost){
		this.name = name;
		this.step = step;
		this.cost = cost;
	}
	
	public String getNameSpace(){
		return this.name;
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
	
	public void spaceAffect(Player p){
		if (getNameSpace().equals("Start")) {
			p.cekStart();
		} else if (getNameSpace().equals("Free Parking")) {
			Scanner s = new Scanner(System.in);
			String plot = s.next();
			p.setPos(plot);
			if (p.getPos().getKey().equals("Space")) {
				((Space)p.getPos().getPlace()).spaceAffect(p);
			} else if (p.getPos().getKey().equals("Property")) {
				((Property)p.getPos().getPlace()).propAffect(p);
			}
		} else if (getNameSpace().equals("Penjara")) {
			System.out.println ("Player "+ p.getID() + "hanya lewat penjara.");
		} else if (getNameSpace().equals("Go to Jail")) {
			//method masuk penjara
		} else if (getNameSpace().equals("Tax")) {
			p.pay(this.cost);
		} else if (getNameSpace().equals("Chance Card")) {
			//method dari chance card
		} else if (getNameSpace().equals("Community Chest")) {
			//method dari community chest
		} 
	}
}