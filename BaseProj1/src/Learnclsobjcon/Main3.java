package Learnclsobjcon;

class Animal{
	String sound = "Some generic animal sound";
	void makeSound() {
		System.out.println(sound);
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println(super.sound);
		System.out.println("Bark!");
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog s = new Dog();
		s.makeSound();

	}

}
