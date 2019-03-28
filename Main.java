import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Space Effects
    public void placeAffect(Player p){
			if (getName().equals("Start")) {
				p.cekStart();
			} else if (getName().equals("Free Parking")) {
				Scanner s = new Scanner(System.in);
				String plot = s.next();
				int index = place.indexOf(plot);
				p.setPos(index);
				if (p.getPos().getType() == 0) {
					placeAffect(p);
				} else {
					Place.get(p.getPos()).placeAffect(p);
				}
			} else if (getName().equals("Penjara")) {
				System.out.println ("Player "+ p.getID() + "hanya lewat penjara.");
			} else if (getName().equals("Go to Jail")) {
				p.inJail();
			} else if (getName().equals("Tax")) {
				p.pay(Space.getCost());
			} else if (getName().equals("Chance Card")) {
				int n = ChanceCard.getNum();
				ChanceCard.chanceAction(n, p);
				ChanceCard.print(n);		
			} else if (getName().equals("Community Chest")) {
				//method dari community chest
			} 
		}
    
    public static synchronized coid main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Place> place  = new ArrayList<Place>();
        List<Player> player  = new ArrayList<Player>();
        int d1, d2, nPlayer;
        String name, cmd;
        boolean nextP = false;

        //PenambahanMap
        
        
        
    }
}
