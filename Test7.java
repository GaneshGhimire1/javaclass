package javatutorial;

public class Test7 {
// multilevel inheritence
	public static void main(String[] args) {
	
		
		Son atul = new Son("Ramesh","Sharma" "Ram", "atul");
		System.out.println(atul.firstname);
		System.out.println(atul.lastname);
		System.out.println(atul.fname);
		System.out.println(atul.Gname);
		atul.displaySname();
		atul.displayGname();
		atul.displayFname();
		
		
	}

}
class Grandfather1{
	String firstName;
	String lastName;
	
	public GrandFather1(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayGname() {
		System.out.println(this.firstName + this.lastName);
	}
}
class Father extends GrandFather1{
	String FName;

	 
	public Father(String fn,String ln, String Ffn ) {
		super(fn,ln);
		this.FName = Ffn;
	}
	public void displayFname() {
		System.out.println(this.FName + this.lastName);
		
			}
}

class  Son extends GrandFather1{
	String Sname;
	public Son(String fn,String ln,String sn) {
		super(fn,ln,Ffn);
		this.Sname = sn;
		
	}

public void displaySname() {
	System.out.println(this.Sname + this.lastname);
}}