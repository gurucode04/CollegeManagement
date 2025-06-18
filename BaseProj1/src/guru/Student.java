package guru;

public class Student {
	
	String name;
	int rollno;
	double marks;
	String status;
	
	Student(String sname, int srollno, double smarks){
		name = sname;
		rollno = srollno;
		marks = smarks;
	}
	
	void displayDetails() {
		System.out.println("Student name: "+name);
		System.out.println("Student rollno: "+rollno);
		System.out.println("Student marks: "+marks);	
	}
	
	void checkStatus() {
		if (marks>=40) {
			System.out.println("status: Pass");
		}else {
			System.out.println("status: Fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Guru", 123, 45.0);
		s1.displayDetails();
		s1.checkStatus();
	}

}
