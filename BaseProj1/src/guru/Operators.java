package guru;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 2;
		int num1 = 8;
		
		System.out.println("add:"+ (a+b));
		System.out.println("sub:"+ (a-b));
		System.out.println("Multi:"+ (a*b));
		System.out.println("Div:"+ (a/b));
		System.out.println("Modulus:"+(a%b));
		
		System.out.println("Org:"+ num1);
		System.out.println("Left:"+ (num1 << 2));
		System.out.println("Signed:"+ (num1 >> 2));
		System.out.println("unsignedr:"+ (num1 >>> 2));

		System.out.println("Equal to:"+ (a==b));
		System.out.println("Not Equalto:"+ (a != b));
		System.out.println("Lessthan:"+ (a<b));
		System.out.println("Greater than:"+(a>b));
		System.out.println("Lessthan equalto:"+(a<=b));
		System.out.println("Greatethan equalto:"+(a>=b));
		
		//Logical operators
		int x = 12;
		int y = 15;
		if(x>10 && y<30) {
			System.out.println("Both are true");
		if(x<10 || y>20) {
			System.out.println("atleast one");
		if(!(x<10));
			System.out.println("x is not less than 10");

		}

		}
		int age = 26;
		
		String output= (age>18) ? "You are able to vote": "You are not able to vote";
		
		System.out.println(output);
		int abc=10;
		
		System.out.println(abc);
		
		abc += 5;
		System.out.println("value:"+abc);
		
		abc -= 5;
		System.out.println("value:"+abc);
		
		abc *= 5;
		System.out.println("value:"+abc);

		abc /= 5;
		System.out.println("value:"+abc);

		abc %= 5;
		System.out.println("value:"+abc);


	}

}
