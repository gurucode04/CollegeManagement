package Learnclsobjcon;

class Vehicle{
	int speed = 60;
	void displaySpeed() {
		System.out.println("Speed of Vehicle: "+speed+" km/h");
	}
}

class Car extends Vehicle{
	int speed = 100;
	void displaySpeed() {
		System.out.println("Speed of Car: "+speed+" km/h");
		System.out.println("Speed of Vehicle: "+super.speed+" km/h");
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sp = new Car();
		sp.displaySpeed();

	}

}
