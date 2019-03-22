public class Space {	//Start, Free Parking, Penjara, Go to Jail, Tax, Chance Card, Community Chest
	private String name;
	private int step;
	private long cost;
	
	public Space(String name, int step, long cost){
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
	
	public void setCost(long cost){
		this.cost=cost;
	}
	
	public void affect(Player p){
		if (getName().equals("Start")) {
			
		} else if (getName().equals("Free Parking")) {
			
		} else if (getName().equals("Penjara")) {
			
		} else if (getName().equals("Go to Jail")) {
			
		} else if (getName().equals("Tax")) {
			
		} else if (getName().equals("Chance Card")) {
			
		} else if (getName().equals("Community Chest")) {
			
		} 
	}
}