package javatutorial;

public class Practice51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class GrandFatherC{
	String firstname ;
	String lastname;
	public GrandFatherC (String fn,String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
		public void displayGrandFatherGname() {
		System.out.println(this.firstname + this.lastname);
	}
}
class Baba extends GrandFatherC{
	String BFirstname;
	public Baba(String fn,String ln,String bn) {
		super(fn,ln);
		this.BFirstname = bn;
		
	}
	public void displayfname() {
		System.out.println(this.BFirstname + this.lastname);
	}
}