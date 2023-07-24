package javatutorial;

public class Practice76 {

	public static void main(String[] args) {

		BBI A = new BBI("USA", "Huntersville");
		A.loan();
		A.save();
		A.displaymessage();
	}

}

class WorldBank6 {
	String Concord;

	public WorldBank6(String cn) {
		this.Concord = cn;

	}

	public void save() {
		System.out.println("save method ");
	}

	public void loan() {
		System.out.println("loan method");
	}

	public void displaymessage() {
		System.out.println("welcome to worldbank");
	}
}
	class SBI4 extends WorldBank6 {
		String branch;

		public SBI4(String cn, String br) {
			super(cn);
			this.branch = br;
		}

		public void save() {
			System.out.println("save method");
		}

		public void loan() {
			System.out.println("loan method");
		}
	}

	class BBI extends WorldBank6 {
		String branch;

		public BBI(String cn, String bn) {
			super(cn);
			this.branch = bn;
		}

		public void save() {
			System.out.println("this is save method from Huntersville");
		}

		public void loan() {
			System.out.println("this is loan method from Huntersville");
		}
	}


