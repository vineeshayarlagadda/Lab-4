package lab4.Ex3;

public class JournalPaper extends WrittenItem{
	private int publishedYear;

	public JournalPaper() {
		super();
	}

	public JournalPaper(int id, String title, int noOfCopies, String author, int publishedYear) {
		super(id, title, noOfCopies, author);
		this.publishedYear = publishedYear;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof JournalPaper) {
			JournalPaper journalPaper=(JournalPaper)obj;
			boolean a = this.publishedYear == journalPaper.publishedYear;
			return super.equals(obj) && a;
		}
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The journal is published in the year : "+publishedYear);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Published in year : "+publishedYear;
	}
	
	

}
