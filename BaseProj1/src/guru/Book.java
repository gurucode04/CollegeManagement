package guru;

public class Book {
	//Fields
	String title;
	String author;
	int stock;
	
	//Constructor
	Book(String t, String a, int s){
		title = t;
		author = a;
		stock = s;
	}
	
	//Method to display book info
	void showBook() {
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Stock Available: "+ stock);
	}
	
	//Method to check availability
	void isAvailable() {
		if (stock > 0) {
			System.out.println("Book is available.");
		}else {
			System.out.println("Book is out of stock.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java Basics","James Gosling",3);
		b1.showBook();
		b1.isAvailable();

	}

}
