
package javatutorial;

public class Practice36 {

	public static void main(String[] args) {
		// inheritance from father to son and daughter

		DaughterB Puja = new DaughterB("Ram", "Ghimire", "Puja");
		SonB ganesh = new SonB("Ram", "Ghimire", "ganesh");

		Puja.displayFname();
		Puja.displayDname();

		ganesh.displayFname();
		ganesh.displaySname();
	}

}

class FatherB {
	String firstname;
	String lastname;

	public FatherB(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public void displayFname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class SonB extends FatherB {
	String Sname;

	public SonB(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
	}

	public void displaySname() {
		System.out.println(this.Sname + this.lastname);
	}

}

class DaughterB extends FatherB {
	String Dname;

	public DaughterB(String fn, String ln, String dn) {
		super(fn, ln);
		this.Dname = dn;
	}

	public void displayDname() {
		System.out.println(this.Dname + this.lastname);
	}
}

