//import java.util.Random;

public class ListCard <String, C>{ //generic class, yeayy!
	private Card first;
	//Random rand = new Random();
	
	public class Card {
		private String key;
		private C value;
		private Card next;

		public Card(String key, C value) {
			this.key = key;
			this.value = value;
			next = null;
		}
		
		private Card getLast() {
			if(next == null){
				return this;
			}
			else
			while(next.next != null){
				next = next.next;
			}
			return next;
		}
	}

	/**
	* Constructor 
	* Set first = null
	*/
	public ListCard() {
			first = null;
	}

	public void add(String key, C value) {
		if(first == null){
			first = new Card(key, value);
		}
		else if(getValue(key) == null){
			first.getLast().next = new Card(key, value);
		}
		else{
			Card card= first;
			do{
				card = card.next;
			} while(!card.key.equals(key));
			card.value = value;
		}
	}

	public C getValue(String key) {
		Card card= first;
		while((card != null) && (!card.key.equals(key))){
			card = card.next;
		}
		if(card == null){
			return null;
		}
		else{
			return(card.value);
		}
	}
 
	public String getKey(int n) {
		int num=1;
		Card card = first;
		while (card != null && num<n){
			num++;
			card = card.next;
		}
		if(card == null){
			return null;
		}
		else{
			return(card.key);
		}
	}
  
  /*public int getNum() {
    int n = rand.nextInt(10)+1;
    return n;
  }*/
 }