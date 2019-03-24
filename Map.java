public class Map<Place> {	//Generic Class
	private Element first;
	private Element current;
	
	public class Element {
		private Place place;
		private String key;
		private String value;
		private Element next;
		private Element prev;
		
		public Element(String key,String value,Place p){
			this.key =key;
			this.value=value;
			this.place=p;
			this.next = null;
			this.prev = null;
		}
		
		public String getKey(){
			return this.key;
		}
		
		public String getValue(){
			return this.value;
		}
		
		public Place getPlace(){
			return this.place;
		}
		
		public Element getNext(){
			return this.next;
		}
		
		public void setNext(Element next){
			this.next = next;
		}
		
		public Element getPrev(){
			return this.prev;
		}
		
		public void setPrev(Element prev){
			this.prev = prev;
		}
	}
	
	public Map(){
		this.first = new Element("Space","Start",(Place) new Space("Start",0,200)); //ragu disini, aman gak sih dibikin kayak gini?
		this.current = first;
	}
	
	public Element getFirst(){
		return this.first;
	}
	
	public void add(String key, String value,Place p){
		Element baru = new Element(key,value,p);
		baru.setPrev(this.current);
		baru.setNext(this.first);
		this.current.setNext(baru);
		this.first.setPrev(baru);
		this.current = baru;
	}	
}