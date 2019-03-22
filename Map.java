public class Map<Place> {	//Generic Class
	private Element first;
	private Element current;
	
	public class Element {
		private Place place;
		private Element next;
		private Element prev;
		
		public Element(Place p){
			this.place=p;
			this.next = null;
			this.prev = null;
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
		this.first = new Element((Place) new Space("Start",0,200));
		this.current = first;
	}
	
	public void add(Place p){
		Element baru = new Element(p);
		baru.setPrev(this.current);
		baru.setNext(this.first);
		this.current.setNext(baru);
		this.first.setPrev(baru);
		this.current = baru;
	}	
}