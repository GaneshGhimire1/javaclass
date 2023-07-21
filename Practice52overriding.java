package javatutorial;

public class Practice52overriding {

	public static void main(String[] args) {
		
		
		// overriding

		
		SBI2 pune = new SBI2("India", "pune");
		pune.loan();
		pune.save();
		pune.displayMessage();
	}
	
	
	

}

class WorldBankA {
	String country;
	// constructor
	public WorldBankA(String cnt) {
		this.country = cnt;
	}
	
	public void save() {
		System.out.println(" i am save method from the worldbank");
	}
	
	public void loan() {
		System.out.println(" i am loan method from the worldbank");
	}
	
	public void displayMessage() {
		System.out.println("welcome to WorldBank");
	}
	
	
}

class PNB2 extends WorldBankA {
	String branchName;

	public PNB2(String cnt,String bn) {
		super(cnt);
		this.branchName = bn;	
	}
	// Overriding the parent methods loan and save
	
	public void save() {
		System.out.println("I am save from PNB2 pune");
		
	}
	
	public void loan() {
		System.out.println("I am loan from PNB2 pune");
	}
		
}

class SBI2 extends WorldBankA {
	
	String branchName;

	public SBI2(String cnt,String bn) {
		super(cnt);
		this.branchName = bn;
		
	}
	
	// Overriding the parent methods loan and save
	

	public void save() {
		System.out.println("I am save from SBI2 pune");
		
	}
	
	public void loan() {
		System.out.println("I am loan from SBI2 pune");
	}
		

	
		
		
		
	}


