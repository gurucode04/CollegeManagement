package LinkedLists;

class Page { 
    String url; 
    Page prev, next; 
 
    Page(String url) { 
        this.url = url; 
    } 
} 
 
class BrowserHistory { 
    private Page current; 
 
    public void visit(String url) { 
        Page newPage = new Page(url); 
        if (current != null) { 
            current.next = newPage; 
            newPage.prev = current; 
        } 
        current = newPage; 
        System.out.println("Visited: " + url); 
    } 
 
    public void back() { 
        if (current != null && current.prev != null) { 
            current = current.prev; 
            System.out.println("Back to: " + current.url); 
        } else { 
            System.out.println("No previous page."); 
        } 
    } 
 
    public void forward() { 
        if (current != null && current.next != null) { 
            current = current.next; 
            System.out.println("Forward to: " + current.url); 
        } else { 
            System.out.println("No forward page."); 
        } 
    } 
 
    public void currentPage() { 
        if (current != null) 
            System.out.println("Current page: " + current.url); 
        else 
            System.out.println("No pages visited."); 
    } 
} 

public class BrowserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory history = new BrowserHistory(); 
        history.visit("google.com"); 
        history.visit("github.com"); 
        history.visit("stackoverflow.com"); 
 
        history.back(); 
        history.currentPage(); 
 
        history.back(); 
        history.currentPage(); 
 
        history.forward(); 
        history.currentPage();

	}

}
