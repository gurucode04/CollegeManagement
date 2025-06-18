package Inheritance;
import java.util.*;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Car class
class Car extends Vehicle {
    private String trunkCapacity;

    public Car(String make, String model, int year, String trunkCapacity) {
        super(make, model, year);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void printDetails() {
        System.out.println("[Car]");
        super.printDetails();
        System.out.println("Trunk Capacity: " + trunkCapacity);
    }
}

// Truck class
class Truck extends Vehicle {
    private String loadCapacity;

    public Truck(String make, String model, int year, String loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printDetails() {
        System.out.println("[Truck]");
        super.printDetails();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}
public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: vehicle type
        System.out.print("Vehicle Type (Car/Truck): ");
        String type = scanner.nextLine().trim();

        // Common details
        System.out.print("Make: ");
        String make = scanner.nextLine().trim();

        System.out.print("Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        Vehicle vehicle;

        if (type.equalsIgnoreCase("Car")) {
            System.out.print("Trunk Capacity: ");
            String trunkCapacity = scanner.nextLine().trim();
            vehicle = new Car(make, model, year, trunkCapacity);
        } else if (type.equalsIgnoreCase("Truck")) {
            System.out.print("Load Capacity: ");
            String loadCapacity = scanner.nextLine().trim();
            vehicle = new Truck(make, model, year, loadCapacity);
        } else {
            System.out.println("Invalid vehicle type.");
            scanner.close();
            return;
        }

        System.out.println();
        vehicle.printDetails();

        scanner.close();

	}

}
