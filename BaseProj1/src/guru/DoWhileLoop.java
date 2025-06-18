package guru;
import java.util.*;
import java.lang.*;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Number Guessing Game
		int secnum = 9;
		Scanner in = new Scanner(System.in);
		int guessnum;
		
		do {
			System.out.println("Enter the num to guess the sec num");
			guessnum = in.nextInt();
			if(guessnum != secnum) {
			System.out.println("You guessed the wrong number");}
		}while(guessnum != secnum);
		System.out.println("You guessed the correct number");
		
		//2. Continue or Exit Prompt
		String usertype1 = "yes", usertype2 = "no";
		String usertype;
		do {
			System.out.println("Do you want to continue? (yes/no)");
			usertype=in.nextLine();
			if(usertype != usertype1) {
				System.out.println("you typed yes");
			}
		}while(usertype.equals(usertype2));
		System.out.println("You typed no");
		
		//3. Menu for unit conversion
		
		
	}

}
