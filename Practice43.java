package javatutorial;

public class Practice43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LBB Butwal = new LBB("Nepal", "Butwal");
		Butwal.loan();
		Butwal.save();
		Butwal.displaymessage();
	}

}

class Worldbank {
	String country;

	// constructor
	public Worldbank(String cnt) {
		this.country = cnt;
	}

	public void save() {
		System.out.println("save method from Worldbank");
	}

	public void loan() {
		System.out.println("loan method from Worldbank");
	}

	public void displaymessage() {

	}
}

class NRB extends Worldbank {
	String branchname;

	public NRB(String cnt, String bn) {
		super(cnt);
		this.branchname = bn;
	}
	// overriding the parent method loan and save

	public void save() {
		System.out.println("save from NRB Butwal");

	}

	public void loan() {
		System.out.println("loan from NRB Butwal");

	}

	class LBB extends Worldbank {
		String branchname;

		public LBB(String cnt, String bn) {
			super(cnt);
			this.branchname = bn;
		}
		// overriding the parent method loan and save

		public void save() {
			System.out.println("loan from LBB Butwal");
		}

		public void loan() {
			System.out.println("loan from LBB Butwal");

		}}

	

	
		
		
		
		
	}


