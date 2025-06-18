package Learnclsobjcon;

class Bank{
	Bank(String bankName){
		System.out.println("Bank Name: "+bankName);
	}
}

class Branch extends Bank{
	Branch(String bankName , String branchName ){
		super(bankName);
		System.out.println("Branch Name: "+branchName);
	}
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch br = new Branch("ABC Bank", "Mumbai Branch");

	}

}
