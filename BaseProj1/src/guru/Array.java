package guru;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5,6};
		System.out.println(num[3]);
		
		String[] fruits = {"apple", "mango", "banana", "grape"};
		System.out.println(fruits[2]);
		
		double[] productPrice = {100.20, 20.2, 30.5};
		double totalPrice = productPrice[0]+productPrice[1]+productPrice[2];
		System.out.println("Total Price ="+ totalPrice);
		
		int marks[] = {85,95,100,52,78};
		int totalmarks = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		int average = totalmarks/(marks.length);
		System.out.println("Total Marks="+totalmarks);
		System.out.println("Average="+average);
		
		
		int[][] numarr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(numarr[0][0]+" "+numarr[0][1]+" "+numarr[0][2]);
		System.out.println(numarr[1][0]+" "+numarr[1][1]+" "+numarr[1][2]);
		System.out.println(numarr[2][0]+" "+numarr[2][1]+" "+numarr[2][2]);

	//Ticket Booking
	String [][] seats = {
			{"Available","Booked","Available"},
			{"Booked","Available","Booked"},
			{"Available","Booked","Booked"}
	};
	System.out.println(seats[0][0]);
	System.out.println(seats[0][1]);
	
	//clone array
	int[] orgArray = {10,20,30,40,50}; //Original array
	int[] cloneArray = orgArray.clone();
	cloneArray[0]=99;
	
	System.out.println("Original:"+Arrays.toString(orgArray));
	System.out.println("clone:"+Arrays.toString(cloneArray));

	

}
}
