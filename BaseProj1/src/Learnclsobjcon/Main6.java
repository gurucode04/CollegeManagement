package Learnclsobjcon;

class Doctor {
	void duty() {
		System.out.println("General medical duties");
	}

}
class Surgeon extends Doctor{
	void duty() {
		super.duty();
		System.out.println("Performing surgeries");
	}
	
}
public class Main6{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon sr = new Surgeon();
		sr.duty();
	}

}
