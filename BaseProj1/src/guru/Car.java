package guru;
import java.util.*;
public class Car {
	
	String brand;
	int speed;// field of data
	
	Car(String b, int s){
		brand = b;
		speed =s;
	}
	
	void showDetails() {
		System.out.println("Car brand= "+brand);
		System.out.println("Car speed= "+speed);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the car brand");
		String Carbrand = in.nextLine();
		
		System.out.println("Enter the Car speed");
		int Carspeed = in.nextInt();
		Car myCar = new Car(Carbrand,Carspeed);
		
		//Car myCar = new Car("Tata",120);
		myCar.showDetails(); //object
		}
		

	}
