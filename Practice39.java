package javatutorial;

public class Practice39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI pune = new SBI("India", "pune");
		pune.loan();
		pune.save();
		pune.displaymessage();

	

	}

}

class WorldBank {
	
	String country;

	public WorldBank(String Cn) {
		this.country = Cn;
	}

	public void save() {
		System.out.println("This is save method for worldbank");
	}

	public void loan() {
		System.out.println("This is loan method for worldbank");
	}

	public void displaymessage() {
		System.out.println("Welcome to our bank");
	}
}

class SBI extends WorldBank {
	String branchname;

	public SBI(String Cn, String bn) {
		super(Cn);
		this.branchname = bn;
	}

	public void save() {
		System.out.println("This is save method for SBI");
	}

	public void loan() {
		System.out.println("This is loan method for SBI");

	}
}

class PNB extends WorldBank {
	String branchname;

	public PNB(String Cn, String bn) {
		super(Cn);
		this.branchname = bn;
	}

	public void Save() {
		System.out.println("This is save method for PNB");

	}

	public void Loan() {
		System.out.println("This is loan method for PNB");

	}
}
