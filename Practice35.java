package javatutorial;

public class Practice35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son ganesh = new Son("Gopal", "ghimire", "Ram", "ganesh");

		System.out.println(ganesh.firstname);
		System.out.println(ganesh.lastname);
		System.out.println(ganesh.ffirstname);
		System.out.println(ganesh.Sname);

		ganesh.displayfname();
		ganesh.displayGname();
		ganesh.displaySname();

	}
}



class Grandfather {
	String firstname;
	String lastname;

	public Grandfather(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public void displayGname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Father extends Grandfather {
	String ffirstname;

	public Father(String firstname, String lastname, String ffn) {
		super(firstname, lastname);
		this.ffirstname = ffn;
	}

	public void displayfname() {
		System.out.println(this.ffirstname + this.lastname);
	}
}

class Son extends Father {
	String Sname;

	public Son(String firstname, String lastname, String ffn, String ssn) {
		super(firstname, lastname, ffn);
		this.Sname = ssn;
	}

	public void displaySname() {

		System.out.println(this.Sname + this.lastname);
	}
}