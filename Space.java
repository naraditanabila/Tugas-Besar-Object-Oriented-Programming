import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Space extends Place {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private int cost;
	//List<Place> p = new ArrayList<Place>();
	
	public Space(String name, int cost){
		super(name,0);
		this.cost = cost;
	}
	
	//getter setter
	public int getCost(){
		return this.cost;
	}
	
	public void setCost(int cost){
		this.cost=cost;
	}
	
	//ListArray
	public void addP(Place x) {
		p.add(x);
	}
	
	//Space Effects
    public void placeAffect(Player p){
			if (getName().equals("Start")) {
				p.cekStart();
			} else if (getName().equals("Free Parking")) {
				Scanner s = new Scanner(System.in);
				System.out.println("Masukkan angka 1-40 : ");
				int plot = s.nextInt();
				p.setPos(plot);
				s.close();
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
