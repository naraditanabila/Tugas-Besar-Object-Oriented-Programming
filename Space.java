public class Space {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private String name;
	private int step;
	private int cost;
	
	public Space(String name, int step, int cost){
		this.name = name;
		this.step = step;
		this.cost = cost;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getStep(){
		return this.step;
	}
	
	public void setStep(int step){
		this.step=step;
	}
	
	public long getCost(){
		return this.cost;
	}
	
	public void setCost(int cost){
		this.cost=cost;
	}
	
	public void affect(Player p){
		if (getName().equals("Start")) {
			p.cekStart();
		} else if (getName().equals("Free Parking")) {
			//cara posisi player bisa berubah sesuai input user, dan dapat uang ketika posisi yg dipilih melalui start
		} else if (getName().equals("Penjara")) {
			System.out.println ("Player "+ p.getID() + "hanya lewat penjara.");
		} else if (getName().equals("Go to Jail")) {
			//
		} else if (getName().equals("Tax")) {
			
		} else if (getName().equals("Chance Card")) {
			
		} else if (getName().equals("Community Chest")) {
			
		} 
	}
}