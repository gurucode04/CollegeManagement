package CollectionTree;

class Chapter { 
    String title; 
    Chapter left, right; 
 
    Chapter(String title) { 
        this.title = title; 
    } 
}

public class BookIndex {
	 public static void printChapters(Chapter node) { 
	        if (node == null) return; 
	        printChapters(node.left); 
	        System.out.println(node.title); 
	        printChapters(node.right); 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter root = new Chapter("Chapter 2"); 
		root.left = new Chapter("Chapter 1"); 
		root.right = new Chapter("Chapter 3"); 
		System.out.println("Book Chapters (Inorder):"); 
		printChapters(root); 
	}

}
