package javatutorial;

public class Test6 {

	public static void main(String[] args) {
		// multiple level inheritence
		Son ganesh = new Son("Gopal", "ghimire", "Ram", "ganesh");

		System.out.println(ganesh.firstname);
		System.out.println(ganesh.lastname);
		System.out.println(ganesh.Fafirstname);
		System.out.println(ganesh.Sname);

		ganesh.displayFafname();
		ganesh.displayGname();
		ganesh.displaySname();

	}

}

class Grandmother {
	String firstname;
	String lastname;

	public Grandmother(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public void displayGname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class FatherD extends Grandmother {
	String Fafirstname;

	public FatherD(String fn, String ln, String Fafn) {

		super(fn, ln);
		this.Fafirstname = Fafn;
	}

	public void displayFafname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class SonA extends FatherD {
	String Sname;

	public SonA(String fn, String ln, String Fafn, String Sn) {
		super(fn, ln, Fafn);
		this.Sname = Sn;
	}

	public void displaySname() {

		System.out.println(this.Sname + this.lastname);

	}
}
