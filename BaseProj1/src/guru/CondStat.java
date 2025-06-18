package guru;
import java.util.*;
public class CondStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if condition - one single condition - ATM
		
				int enterPIN = 1234;
				int correctPIN = 12564;
				
				if (enterPIN == correctPIN)
				{
					System.out.println("Access Granted");
				}
				else
				{
					System.out.println("Enter correct password");
				}
				
				
				// Nested if - student marks
				
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter the marks");
				
				int marks = obj.nextInt();
				
				if (marks >= 40)
					{
					if (marks >=90)
					{
						System.out.println("Grade A");
					}
					else if (marks >= 75)
					{
						System.out.println("Grade B");
					}
					else
					{
						System.out.println("Grade C");
					}
					}
				else
				{
					System.out.println("Fail");
					}
				
				
				// Switch statement - tea making
				
				Scanner obj1 = new Scanner(System.in);
				
				System.out.println("Enter your Choice");
				
				int choice = obj1.nextInt();
				
				switch(choice)
				{
				case 1: System.out.println("Enjoy your tea");
				break;
				case 2: System.out.println("Enjoy your Coffee");
				break;
				case 3: System.out.println("Enjoy your Water");
				break;
				
				default:
					System.out.println("Invalid Selection");
				
				}
	}

}
