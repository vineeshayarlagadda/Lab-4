package lab4.Ex3;

public abstract class MediaItem extends Item{
	private int runtime;
	
	public MediaItem() {
		super();
	}
	

	public MediaItem(int runtime) {
		super();
		this.runtime = runtime;
	}

	public MediaItem(int id, String title, int noOfCopies, int runtime) {
		super(id, title, noOfCopies);
		this.runtime = runtime;
	}


	public int getRuntime() {
		return runtime;
	}


	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MediaItem) {
			MediaItem mi = (MediaItem)obj;
			boolean a = this.runtime == mi.runtime;
		    return super.equals(obj)&&a;
		}
		return false;
	}


	@Override
	public String toString() {
		return super.toString()+"Runtime : "+runtime;
	}


	@Override
	public void print() {
		System.out.println("The runtime of media item is : "+runtime+"mins");
	}
	
	
	

}
