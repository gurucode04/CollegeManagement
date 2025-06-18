package Work;
import java.util.*;
public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replace(" ", "");
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

	}

}
