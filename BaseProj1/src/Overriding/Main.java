package Overriding;

class Vehicle{
	public void move() {
		System.out.println("The vehicle is on the move.");
	}
}
class Car extends Vehicle{
	public void move() {
		System.out.println("The car drives on roads.");
	}
}
class Boat extends Vehicle{
	public void move() {
		System.out.println("The boat sails on water.");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ve = new Vehicle();
		Vehicle myCar = new Car();
		Vehicle myBoat = new Boat();
		
		ve.move();
		myCar.move();
		myBoat.move();
	}

}
