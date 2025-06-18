package LinkedLists;

class ActionNode { 
    String action; 
    ActionNode next; 
 
    ActionNode(String action) { 
        this.action = action; 
    } 
} 
 
class ActionHistory { 
    private ActionNode top = null; 
 
    public void addAction(String action) { 
        ActionNode newAction = new ActionNode(action); 
        newAction.next = top; 
        top = newAction; 
    } 
 
    public void undo() { 
        if (top == null) { 
            System.out.println("No actions to undo."); 
            return; 
        } 
        System.out.println("Undoing: " + top.action); 
        top = top.next; 
    } 
 
    public void showHistory() { 
        ActionNode current = top; 
        System.out.println("Action history:"); 
        while (current != null) { 
            System.out.println("- " + current.action); 
            current = current.next; 
        } 
    } 
} 

public class TextEditorUndoApp {
	
	public static void main(String[] args) {
		
		 ActionHistory history = new ActionHistory(); 
	        history.addAction("Typed 'Hello'"); 
	        history.addAction("Deleted 'o'"); 
	        history.addAction("Typed ' World'"); 
	 
	        history.showHistory(); 
	        history.undo(); 
	        history.showHistory(); 
		
	}

}
