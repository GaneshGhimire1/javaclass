package javatutorial;

public class Practice75 {

	public static void main(String[] args) {
		SonAD subham = new SonAD("Ram", "Sharma", "Shyam","subham" );
		System.out.println(subham.firstName);
		System.out.println(subham.lastName);
		System.out.println(subham.fFName);
		System.out.println(subham.SName);
		
		subham.displayGname();
		subham.displayfFName();
		subham.displaySName();

	}

}

class GrandfatherA{
	String firstName;
	String lastName;
	public GrandfatherA(String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayGname() {
		System.out.println(this.firstName + this.lastName);
	}
}
class FatherA extends GrandfatherA{
String fFName;
	public FatherA(String fn, String ln,String fFn) {
		super(fn, ln);
		this.fFName = fFn; 
	}
	public void displayfFName() {
	System.out.println(this.fFName + this.lastName );
}}
class SonAD extends FatherA{
String SName;
	public SonAD(String fn, String ln, String fFn,String Sn) {
		super(fn, ln, fFn);
		this.SName = Sn;
		
	}
	public void displaySName() {
		System.out.println(this.SName + this.lastName);
	}
	
}