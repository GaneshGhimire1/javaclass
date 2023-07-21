package javatutorial;

public class Practice54 {
	// we cannot create object of abstract class
	
	// like UniverseBank b = new UniverseBank();
	// because UniverseBank belongs to abstract class
	
	
	// Abstraction is a setting of rule
	// Abstraction having method name but no implementation i,e hide the implementation
	// Abstract class have regular method  also
	public static void main(String[] args) {

		NRB2 Butwal = new NRB2();
		Butwal.loan();
		Butwal.save();
		Butwal.displayCountry();
		Butwal.branchname();

	}

}

abstract class UniverseBank {
// abstract method 
	abstract void loan();

	abstract void save();

	public void displayCountry() {
		System.out.println("I am from nepal");

	}
}

// we cannot create object of abstract class

class NRB2 extends UniverseBank {

	public void loan() {
		System.out.println("I am loan from NRB");
	}

	public void save() {
		System.out.println("I am save from NRB");
	}

	public void branchname() {
		System.out.println("I am Butwal branch");
	}
}

class LBL extends UniverseBank {
	public void loan() {
		System.out.println("I am loan from LBL");

	}

	public void save() {
		System.out.println("I am save from LBL");
	}

	public void branchname() {
		System.out.println("I am Butwal branch LBL");
	}
}