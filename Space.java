import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Space extends Place {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private Player player;
	private int cost;
	private int tipe; /*chance card:1 community chest:2, lainnya:0*/
	
	public Space(String name, int tipe, int cost){
		super(name,0);
		this.tipe = tipe;
		this.cost = cost;
		this.player = player;
	}
	
	//getter setter
	public int getCost(){
		return this.cost;
	}
	
	public void setCost(int cost){
		this.cost=cost;
	}
	
	public Player getOwner(){
		return this.player;
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
			} /*else if (getName().equals("Chance Card")) {
				int n = cc.getNum();
				cc.chanceAction(n, p);
				//cc.print(n);		
			} else if (getName().equals("Community Chest")) {
				CommunityChest cr = new CommunityChest();
				int c = cr.getNum();
				cr.chestAction(c, p);
				//cr.print(c);
			} */
		}
}
