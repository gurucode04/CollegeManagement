package Work;
import java.util.*;
public class VowelConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine().toLowerCase();

	        int vowels = 0, consonants = 0;

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if ("aeiou".indexOf(ch) >= 0)
	                    vowels++;
	                else
	                    consonants++;
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);

	}

}
