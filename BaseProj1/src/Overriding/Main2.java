package Overriding;

class Order{
	public void processOrder() {
		System.out.println("Processing general order...");
	}
}

class OnlineOrder extends Order{
	public void processOrder(){
		System.out.println("Processing online order with digital invoice...");
	}
}

class InStoreOrder extends Order{
	public void processOrder() {
		System.out.println("Processing in-store order with printed receipt...");
	}
}


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order ord = new Order();
		Order Onord = new OnlineOrder();
		Order Inord = new InStoreOrder();
		
		ord.processOrder();
		Onord.processOrder();
		Inord.processOrder();

	}

}
