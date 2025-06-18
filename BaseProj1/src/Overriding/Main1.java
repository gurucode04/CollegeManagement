package Overriding;

class Employee{
	public void calculateSalary() {
		System.out.println("Calculating base salary....");
	}
}

class FullTimeEmployee extends Employee{
	public void calculateSalary() {
		System.out.println("Calculating full-time salary with benefits...");
	}
}

class PartTimeEmployee extends Employee{
	public void calculateSalary() {
		System.out.println("Calculating part-time salary based on hours...");
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Employee fe = new FullTimeEmployee();
		Employee pe = new PartTimeEmployee();
		
		emp.calculateSalary();
		fe.calculateSalary();
		pe.calculateSalary();
	}

}
