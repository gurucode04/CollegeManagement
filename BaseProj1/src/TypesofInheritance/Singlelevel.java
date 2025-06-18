package TypesofInheritance;
	
public class Singlelevel{
	int a=10;
	int b=5;
void sum() {
	System.out.println("Sum: "+(a+b));
}
}
class Sub extends Singlelevel{

	void diff() {
		System.out.println("sub: "+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Sub sl = new Sub();
		sl.sum();
		sl.diff();

	}

}
