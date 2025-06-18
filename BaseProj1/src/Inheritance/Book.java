package Inheritance;
import java.util.*;
public class Book {
	String title;
	
	void read() {
		System.out.println("Reading: "+title);
	}
}

class Ebook extends Book{
	void download() {
		System.out.println("Ebook \""+title+"\" downloaded.");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner in = new Scanner(System.in);
		Ebook ebook = new Ebook();
		
		System.out.println("Enter the title of the ebook: ");
		ebook.title = in.nextLine();
		ebook.read();
		ebook.download();
		
		
		in.close();
	}

}
