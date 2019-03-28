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
}
