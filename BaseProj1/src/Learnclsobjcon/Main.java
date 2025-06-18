package Learnclsobjcon;

class Teacher{
	String name = "Mrs. Kapoor";
	
	public void teach() {
		System.out.println("Teaching general subjects.");
	}
}

class SubjectTeacher extends Teacher{
	String name = "Mr.Sharma";
	
	public void teach() {
		super.teach();
		System.out.println("Teaching Mathematics.");
	}
		
	public void showNames() {
		System.out.println("Parent name: "+ super.name);
		System.out.println("Child name: "+name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectTeacher st = new SubjectTeacher();
		st.teach();
		st.showNames();
	}

}
