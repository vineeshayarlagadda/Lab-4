package lab4.Ex3;

public class CD extends MediaItem{
	private String artist;
	private String genre;
	
	public CD() {
		super();
	}
	

	public CD(int runtime, String artist, String genre) {
		super(runtime);
		this.artist = artist;
		this.genre = genre;
	}


	public CD(int id, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(id, title, noOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CD) {
			CD cd=(CD)obj;
			boolean a = this.artist.equals(cd.artist);
			boolean b = this.genre.equals(cd.genre);
			return super.equals(obj)&&a&&b;
		}
		return false;
	}


	@Override
	public String toString() {
		return super.toString()+"Artist : "+artist+", Genre : "+genre;
	}


	@Override
	public void print() {
		super.print();
		System.out.println("The artist name is : "+artist);
		System.out.println("The genre of this CD is : "+genre);
	}

	
	

	
	
	
}
