package guru;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  Java Programming  ";
		String str2 = "Java Programming";
		String emptyStr = "";
		String blankStr = "  ";
		
		//1.Length
		System.out.println("Length of str: "+ str.length());
		
		//2. toCharArray()
		char[] chars = str.toCharArray();
		System.out.println("Characters in str: ");
		for (char c : chars) {
			System.out.println(c+ " ");
		}
		System.out.println();
		
		//3. compareTo()
		int comparision = str.trim().compareTo(str2);
		System.out.println("Comparision result: "+ comparision);
		
		//4. isEmpty()
		System.out.println("Is emptystr empty?" + emptyStr.isEmpty());
		
		//5. isBlank()
		System.out.println("Is blankstr blank?" + blankStr.isBlank());
		
		//6. charAt()
		System.out.println("Character at index 2: "+ str.charAt(2));
		
		//7. startsWith() and endsWith()
		System.out.println("Starts with '  Ja' "+ str.startsWith("  Ja"));
		System.out.println("Ends with 'ing  ' "+ str.endsWith("ing  "));
		
		//8.toLowerCase()
		System.out.println("Lowercase: "+ str.toLowerCase());
		
		//9. toUpperCase()
		System.out.println("Uppercase: "+str.toUpperCase());
		
		//10. trim()
		System.out.println("Trimmed str: "+ str.trim() + "'");
		
		//11. strip()
		System.out.println("Stripped str: "+ str.strip()+ "'");
		
		//12. stripLeading()
		System.out.println("Leading stripped str: "+ str.stripLeading()+ "'");
		
		//13. stripTrailing()
		System.out.println("Trailing stripped str: "+ str.stripTrailing()+"'");
		
		//14. repeat()
		String repeated = "Java ".repeat(3);
		System.out.println("Repeated String: "+ repeated);
		
		//15. contentEquals()
		boolean contentEqual = str.trim().contentEquals(str2);
		System.out.println("Content equals? "+ contentEqual);
	}
}