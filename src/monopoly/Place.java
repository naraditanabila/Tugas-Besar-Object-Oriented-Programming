package monopoly;

import javax.swing.JTextArea;

public abstract class Place {  //abstract class
	private String name;
	private int type; //0: space, 1: properti
	
	public Place(String name, int type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName(){
		return name;
	}
	
	public int getType(){
		return type;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setType (int type){
		this.type = type;
	}
	
	public abstract Player getOwner();
	public abstract void placeAffect(Player p, javax.swing.JTextArea gameLog);


}

