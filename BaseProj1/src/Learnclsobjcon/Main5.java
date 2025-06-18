package Learnclsobjcon;

class LibraryItem {
	String Title;
	LibraryItem(String title){
		this.Title=title;		
	}
	void displayInfo() {
		System.out.println("Title: "+Title);
	}
}

class Book extends LibraryItem{
	String Author;
	Book(String title, String author){
	super(title);
	this.Author = author;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Author: "+Author);
	}
	
}
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book("Java Basics", "James Gosling");
		bk.displayInfo();

	}

}
