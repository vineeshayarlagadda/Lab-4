package lab4.Ex3;
import java.util.*;


public class MainLibrary {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("=================================================================================");
			System.out.println("Enter the option for any item you wish from library");
			System.out.println("1. Book Details\n2. Journal paper details\n3. Video details\n4. CD Details");
			int option=Integer.parseInt(sc.next());
			switch(option) {
			case 1: WrittenItemDetails(new Book(),1);
			break;
			case 2: WrittenItemDetails(new JournalPaper(),2);
			break;
			case 3: MediaItemDetails(new Video(),3);
			break;
			case 4: MediaItemDetails(new CD(),4);
			break;
			}
		}
	}
	
	
	public static void WrittenItemDetails(WrittenItem wi,int op){
		if(op==1) {
			System.out.println("------------Book Details------------");
			System.out.println("Enter the book id : ");
		}
		else if(op==2) {
			System.out.println("------------Journal Paper Details------------");
			System.out.println("Enter the journal paper id : ");
		}
		int id=sc.nextInt();
		wi.setId(id);
		if(op==1)System.out.println("Enter the book title : ");
		else if(op==2)System.out.println("Enter the journal paper title : ");
		String t=sc.next();
		wi.setTitle(t);
		if(op==1)System.out.println("Enter the number of copies of book : ");
		else if(op==2)System.out.println("Enter the number of copies of journal paper : ");
		int c=sc.nextInt();
		wi.setNoOfCopies(c);
		if(op==1)System.out.println("Enter the author of the book : ");
		else if(op==2)System.out.println("Enter the author of the journal paper : ");
		String a=sc.next();
		wi.setAuthor(a);
		if(wi instanceof Book) {
			wi.print();
		}
		if(wi instanceof JournalPaper) {
			System.out.println("Enter the year in which the journal paper was published : ");
			JournalPaper jp=(JournalPaper)wi;
			jp.setPublishedYear(sc.nextInt());
			wi.print();
		}
	}
	
	
	public static void MediaItemDetails(MediaItem mi,int op) {
		System.out.println("Enter the runtime of the media item : ");
		int rt=sc.nextInt();
		mi.setRuntime(rt);
		if(mi instanceof Video) {
			System.out.println("------------Video Details------------");
			System.out.println("Enter the director name : ");
			((Video) mi).setDirector(sc.next());
			System.out.println("Enter the year in which the video is released : ");
			((Video)mi).setYear(sc.nextInt());
			System.out.println("Enter the genre of the video : ");
			((Video) mi).setGenre(sc.next());
			((Video) mi).print();
		}
		if(mi instanceof CD) {
			System.out.println("------------CD Details------------");
			System.out.println("Enter the artist name : ");
			((CD)mi).setArtist(sc.next());
			System.out.println("Enter the genre : ");
			((CD)mi).setGenre(sc.next());
			((CD) mi).print();
			
		}
	}
}
