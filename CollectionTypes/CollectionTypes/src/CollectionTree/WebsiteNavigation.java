package CollectionTree;

class WebPage { 
    String title; 
    WebPage left, right; 
 
    WebPage(String title) { 
        this.title = title; 
    } 
} 

public class WebsiteNavigation {
	public static void preorder(WebPage node) { 
        if (node == null) return; 
        System.out.println("Visiting: " + node.title); 
        preorder(node.left);  // Category 
        preorder(node.right); // Sub-page 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebPage homepage = new WebPage("Home"); 
        homepage.left = new WebPage("Products"); 
        homepage.right = new WebPage("About Us"); 
        homepage.left.left = new WebPage("Electronics"); 
        homepage.left.right = new WebPage("Clothing"); 
 
        System.out.println("Website Navigation (Preorder):"); 
        preorder(homepage);

	}

}
