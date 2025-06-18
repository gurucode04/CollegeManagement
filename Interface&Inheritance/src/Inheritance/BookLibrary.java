package Inheritance;
import java.util.*;

class Book {
    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Derived class: ScienceBook
class ScienceBook extends Book {
    private String fieldOfStudy;

    public ScienceBook(String title, String author, String isbn, String fieldOfStudy) {
        super(title, author, isbn);
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public void printDetails() {
        System.out.println("[Science Book]");
        super.printDetails();
        System.out.println("Field of Study: " + fieldOfStudy);
    }
}

// Derived class: NovelBook
class NovelBook extends Book {
    private String genre;

    public NovelBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println("[Novel Book]");
        super.printDetails();
        System.out.println("Genre: " + genre);
    }
}
public class BookLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input: Book type
	        System.out.print("Add Book Type (ScienceBook/NovelBook): ");
	        String type = scanner.nextLine().trim();

	        // Common book details
	        System.out.print("Title: ");
	        String title = scanner.nextLine().trim();

	        System.out.print("Author: ");
	        String author = scanner.nextLine().trim();

	        System.out.print("ISBN: ");
	        String isbn = scanner.nextLine().trim();

	        Book book;

	        // Based on type, ask for additional info and create object
	        if (type.equalsIgnoreCase("ScienceBook")) {
	            System.out.print("Field of Study: ");
	            String field = scanner.nextLine().trim();
	            book = new ScienceBook(title, author, isbn, field);
	        } else if (type.equalsIgnoreCase("NovelBook")) {
	            System.out.print("Genre: ");
	            String genre = scanner.nextLine().trim();
	            book = new NovelBook(title, author, isbn, genre);
	        } else {
	            System.out.println("Invalid book type.");
	            scanner.close();
	            return;
	        }

	        // Output the details
	        System.out.println();
	        book.printDetails();

	        scanner.close();

	}

}
