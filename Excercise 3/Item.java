package lab4.Ex3;

public abstract class Item {
	private int id;
	private String title;
	private int noOfCopies;

	
	public Item() {
		super();
	}
	
	
	public Item(int id, String title, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Item) {
			Item item=(Item)obj;
			boolean a=this.id==item.id;
			boolean b=this.title==item.title;
			boolean c=this.noOfCopies==item.noOfCopies;
			return a&&b&&c;
		}
		return false;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book id : "+id+", Book title : "+title+", Number of copies of this book : "+noOfCopies;
	}
	
	
	public void print() {
		System.out.println("The identification number of item is : "+id);
		System.out.println("The title of item: "+title);
		System.out.println("The number of copies of item : "+noOfCopies);
	}
	
	
	
	public int checkIn(int copies) {
		noOfCopies+=copies;
		return noOfCopies;
	}
	public int checkOut(int copies) {
		noOfCopies-=copies;
		return noOfCopies;	
	}
	
	public void addItem() {
		System.out.println("Item is added.");
		
	}	

}
