package lab4.Ex3;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem() {
		super();
	}

	public WrittenItem(int id, String title, int noOfCopies, String author) {
		super(id, title, noOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Item) {
			WrittenItem wi=(WrittenItem)obj;
			boolean a= author==wi.author;
			return a&&super.equals(obj);
		}
		return false;
	}
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The author of the item is: "+author);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Author Name : "+author;
	}
	
	
	
	

}
