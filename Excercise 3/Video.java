package lab4.Ex3;

public class Video extends MediaItem{
	private String director;
	private int year;
	private String genre;
	
		
	public Video() {
		super();
	}


	public Video(int runtime,String director, int year, String genre) {
		super(runtime);
		this.director = director;
		this.year = year;
		this.genre = genre;
	}


	public Video(int id, String title, int noOfCopies, int runtime, String director, int year, String genre) {
		super(id, title, noOfCopies, runtime);
		this.director = director;
		this.year = year;
		this.genre = genre;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Video) {
			Video video=(Video)obj;
			boolean a=this.director==video.director;
			boolean b=this.year==video.year;
			boolean c=this.genre==video.genre;
			
			return super.equals(obj)&&a&&b&&c;
		}
		return false;
	}


	@Override
	public String toString() {
		return super.toString()+"Director : "+director+", Year : "+year+", Genre : "+genre;
	}


	@Override
	public void print() {
		super.print();
		System.out.println("The director is : "+director);
		System.out.println("The video is published in the year : "+year);
		System.out.println("The genre of this video is : "+genre);
	}
	
	
	
	
	
	

}
