package guru;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1; i<10; ++i) {
	System.out.println("No.of students: "+ i);
}

//shopping cart
String[] items = {"Milk", "Bread", "Eggs", "Juice", "soap"};
for(int i=0; i<items.length; i++) {
	System.out.println("Item "+(i+1)+": "+ items[i]);
}
//max temperature
int[] temp = {28,31,26,33,29,30,27};
int max = temp[0];
for( int i=1; i<temp.length; i++) {
	if(temp[i]>max) {
		max = temp[i];
	}
}
System.out.println("Maximum temperature:"+ max +"celsius");

//while Loop
int i=4;
while(i<=5) {
	System.out.println(i);
	i++;
}

//DoWhile Loop
int i1=11;
do {
	System.out.println(i1);
	i1++;
}while(i1<=10);

//int rows2 = 5;
for(int a=1; a <= 5; a++) {
	for(int j=1; j<=a; j++) {
		System.out.print("* ");
	}
	System.out.println();
}

int rows = 4;
for( int b =1; b <= rows; b++) {
	for (int space = 1; space <= rows-b; space++) {
		System.out.print(" ");
	}
	for (int star = 1; star <= (2*b-1); star++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
