package javawork;
import java.util.*;
public class CtoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter celsius: ");
		float cel = in.nextFloat();
		double far = (1.8*cel)+32;
		System.out.println("Fahrenheit: "+far);
		}

}
