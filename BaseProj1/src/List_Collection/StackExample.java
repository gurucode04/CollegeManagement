package List_Collection;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> history = new Stack<>();

        history.push("Page 1");
        history.push("Page 2");
        history.push("Page 3");

        System.out.println("Back to: " + history.pop()); // Page 3
	}

}
