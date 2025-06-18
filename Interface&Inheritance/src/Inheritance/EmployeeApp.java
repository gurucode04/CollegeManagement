package Inheritance;
import java.util.*;

//Base class
class Employee {
 protected String name;
 protected int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public double calculateSalary() {
	 return 0.0;
 }
 public String getType() {
	 return "generic";
 }

 public void printDetails() {
     System.out.println("Employee: " + name + " (ID: " + id + ")");
     System.out.println("Type: " + getType());
     System.out.println("Total Salary: ₹" + (int)calculateSalary());
 }
}

//Full-time employee
class FullTimeEmployee extends Employee {
 private double basicSalary;
 private double benefits;

 public FullTimeEmployee(String name, int id, double basicSalary, double benefits) {
     super(name, id);
     this.basicSalary = basicSalary;
     this.benefits = benefits;
 }

 @Override
 public double calculateSalary() {
     return basicSalary + benefits;
 }

 @Override
 public String getType() {
     return "Full-time";
 }
}

//Part-time employee
class PartTimeEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }

 @Override
 public String getType() {
     return "Part-time";
 }
}
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: employee type
        System.out.print("Employee Type (FullTimeEmployee/PartTimeEmployee): ");
        String type = scanner.nextLine().trim();

        // Common fields
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("ID: ");
        int id = scanner.nextInt();

        Employee employee;

        if (type.equalsIgnoreCase("FullTimeEmployee")) {
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Benefits: ");
            double benefits = scanner.nextDouble();
            employee = new FullTimeEmployee(name, id, basicSalary, benefits);
        } else if (type.equalsIgnoreCase("PartTimeEmployee")) {
            System.out.print("Hourly Rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.print("Hours Worked: ");
            int hoursWorked = scanner.nextInt();
            employee = new PartTimeEmployee(name, id, hourlyRate, hoursWorked);
        } else {
            System.out.println("Invalid employee type.");
            scanner.close();
            return;
        }

        System.out.println();
        employee.printDetails();

        scanner.close();

	}

}
