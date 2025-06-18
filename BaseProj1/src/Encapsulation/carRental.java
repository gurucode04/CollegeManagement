package Encapsulation;

public class carRental {
	
	private String Model;
	private String ResgNo;
	private boolean isAvailable;
	
	public carRental (String model,String Resgno, boolean isAvailable) {
		this.Model = model;
		this.ResgNo = Resgno;
		this.isAvailable = isAvailable;
			}

	public String getModel() {
		return Model;
	}
	
	public String getResgNo() {
		return ResgNo;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void rentcar() {
		if(isAvailable) {
			isAvailable = true;
			System.out.println(Model + " "+ResgNo + " Car is Available");
		}
		else {
			System.out.println(Model+ " "+ResgNo + " It has been taken");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carRental obj = new carRental("Tata", "AP02BF6352",false);
		System.out.println("CarModel: "+obj.getModel());
		System.out.println("CarResgNo: "+obj.getResgNo());
		System.out.println("Avaialability: "+obj.isAvailable());
		
		obj.rentcar();
	}

}
