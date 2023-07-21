package javatutorial;

public class Practice53 {
// overriding
	// overriding has different class,same method,same signature, inheritence
	public static void main(String[] args) {
		SBI3 pune = new SBI3("India", "pune");
		pune.loan();
		pune.save();
		pune.displaymessage();

	}

}

class WorldBankB {
	String country;

	public WorldBankB(String cn) {
		this.country = cn;
	}

	public void save() {
		System.out.println("I am save method from the WorldbankB");

	}

	public void loan() {
		System.out.println("I am loan method from the WorldbankB");
	}

	public void displaymessage() {
		System.out.println("welcome to WorldbankB");
	}

}

class PNB3 extends WorldBankB {
	String branchname;

	public PNB3(String cn, String bn) {
		super(cn);
		this.branchname = bn;
	}

	// Overriding the parent methods loan and save
	public void save() {
		System.out.println("i am save method from the PNB3 pune");

	}

	public void loan() {
		System.out.println("i am save method from the PNB3 pune");

	}
	
	
}
class SBI3 extends WorldBankB {
	String branchname;

	public SBI3(String cn, String bn) {
		super(cn);
		this.branchname = bn;
	}

	public void save() {
		System.out.println("I am save from SBI3 pune");
	}

	public void loan() {
		System.out.println("I am save from SBI3 pune");
	}
}
