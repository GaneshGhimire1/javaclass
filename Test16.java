package javatutorial;

public class Test16 {
// inheritance
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Son1 ganesh = new Son1("Ram", "ghimire", "Hari", "ganesh");

		System.out.println(ganesh.firstname);
		System.out.println(ganesh.lastname);
		System.out.println(ganesh.ffirstname);
		System.out.println(ganesh.Sname);

		ganesh.displayfname();
		ganesh.displayGname();
		ganesh.displaySname();

	}
}



class Grandfather2 {
	String firstname;
	String lastname;

	public Grandfather2(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public void displayGname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Father1 extends Grandfather2 {
	String ffirstname;

	public Father1(String firstname, String lastname, String ffn) {
		super(firstname, lastname);
		this.ffirstname = ffn;
	}

	public void displayfname() {
		System.out.println(this.ffirstname + this.lastname);
	}
}

class Son1 extends Father1 {
	String Sname;

	public Son1(String firstname, String lastname, String ffn, String ssn) {
		super(firstname, lastname, ffn);
		this.Sname = ssn;
	}

	public void displaySname() {

		System.out.println(this.Sname + this.lastname);
	}
}
		

		
		