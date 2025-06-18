package CollectionTree;

class ExprNode { 
    String value; 
    ExprNode left, right; 
 
    ExprNode(String value) { 
        this.value = value; 
    } 
} 

public class ExpressionTreeExample {
	
	  public static int evaluate(ExprNode node) { 
	        if (node.left == null && node.right == null) 
	            return Integer.parseInt(node.value); // Operand 
	 
	        int left = evaluate(node.left); 
	        int right = evaluate(node.right); 
	 
	        switch (node.value) { 
	            case "+": return left + right; 
	            case "-": return left - right; 
	            case "*": return left * right; 
	            case "/": return left / right; 
	        } 
	        return 0; 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Building expression tree for: (5 + 2) * (4 - 1) 
        ExprNode root = new ExprNode("*"); 
        root.left = new ExprNode("+"); 
        root.right = new ExprNode("-"); 
 
        root.left.left = new ExprNode("5"); 
        root.left.right = new ExprNode("2"); 
        root.right.left = new ExprNode("4"); 
        root.right.right = new ExprNode("1"); 
 
        int result = evaluate(root); 
        System.out.println("Evaluated Result of Expression: " + result);

	}

}
