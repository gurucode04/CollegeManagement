package Work;
import java.util.*;
public class RemoveNonAlphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                result.append(ch);
        }

        System.out.println(result.toString());

	}

}
