package monopoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Space extends Place {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private int cost;
	private int tipe; /*chance card:1 community chest:2, lainnya:0*/
	
	public Space(String name, int tipe, int cost){
		super(name,0);
		this.tipe = tipe;
		this.cost = cost;
	}
	
	//getter setter
	public int getCost(){
		return this.cost;
	}
	
	public void setCost(int cost){
		this.cost=cost;
	}
	
	public Player getOwner(){
		return null;
	}
	
	//Space Effects
    public void placeAffect(Player p, javax.swing.JTextArea gameLog){
			if (getName().equals("Start")) {
				p.cekStart();
			} else if (getName().equals("Free Parking")) {
                                FreeParkFrame frame_FreePark = new FreeParkFrame();
				int plot = Integer.parseInt(frame_FreePark.getFreeParkNum().getText());
				p.setPos(plot-1, gameLog);
				//this.placeAffect(p);
			} else if (getName().equals("Penjara")) {
				gameLog.append("Player "+ p.getID() + " hanya lewat penjara.\n");
			} else if (getName().equals("Go To Jail")) {
				p.inJail(gameLog);
			} else if (getName().equals("Tax")) {
				p.pay(getCost(), gameLog);
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
