package guru;

public class Employee {
	
	String name;
	int id;
	double monthlySalary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.monthlySalary = salary;
	}
	
	void displayInfo() {
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee ID: "+ id);
		System.out.println("Monthly Salary: $"+ monthlySalary);
	}
	
	void calculateAnnualSalary() {
		double annualSalary = monthlySalary * 12;
		System.out.println("Annual Salary: $" + annualSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Guru", 2004, 45000.0);
		emp1.displayInfo();
		emp1.calculateAnnualSalary();
	}

}
