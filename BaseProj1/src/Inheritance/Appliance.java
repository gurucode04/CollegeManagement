package Inheritance;
import java.util.*;
public class Appliance {

	void plugIn() {
		System.out.println("Appliance is plugged in");
	}
}
	
	class washingMachine extends Appliance {
		void startwashCycle() {
			System.out.println("Washing cycle started. ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		washingMachine wm = new washingMachine();
		
		System.out.println("Do you plug in the machine?(yes/no): ");
		String input = in.nextLine();
		
		if(input.equalsIgnoreCase("yes")) {
			wm.plugIn();
		}
		
		System.out.println("Start washing cycle?(yes/no): ");
		input = in.nextLine();
		
		if(input.equalsIgnoreCase("yes")) {
			wm.startwashCycle();
		}
		in.close();
	}
	}


