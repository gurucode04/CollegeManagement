package Learnclsobjcon;

class Person{
	String name;
	Person(String Name){
		this.name = Name;
		System.out.println("Person Name: "+ name);
	}
}

class Student extends Person{
	Student(String course,String Name){
		super(Name);
		System.out.println("Course Enrolled: "+course);
	}
}
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("Computer Science","Rahul");

	}

}
