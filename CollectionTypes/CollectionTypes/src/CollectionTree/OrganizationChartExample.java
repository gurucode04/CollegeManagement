package CollectionTree;

class EmployeeNode { 
    String name; 
    EmployeeNode left, right; 
 
    EmployeeNode(String name) { 
        this.name = name; 
    } 
}

public class OrganizationChartExample {
	public static void inorder(EmployeeNode node) { 
        if (node == null) return; 
        inorder(node.left);                   // Visit left subordinates 
        System.out.println(node.name);        // Visit current employee 
        inorder(node.right);                  // Visit right subordinates 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CEO and team structure 
        EmployeeNode ceo = new EmployeeNode("CEO"); 
        ceo.left = new EmployeeNode("CTO"); 
        ceo.right = new EmployeeNode("CFO"); 
        ceo.left.left = new EmployeeNode("Dev Manager"); 
        ceo.right.right = new EmployeeNode("Finance Manager"); 
 
        System.out.println("Organization Chart (Inorder Traversal):"); 
        inorder(ceo);
	}

}
