package javatutorial;

public class Revisionpracticeabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI9 Butwal = new SBI9();

Butwal.loan();
Butwal.save();
Butwal.displaycountry();
Butwal.branchname();
	}

}
abstract class Universalbank {
	
	abstract void loan();
	
	abstract void save();
	
	public void displaycountry() {
		System.out.println("I am from nepal");
	
	}
}
class SBI9 extends Universalbank{
	public void loan() {
		System.out.println("i am loan of SBI9");
	}
	public void save() {
		System.out.println("i am loan of SBI9");	
	}
	public void branchname() {
		System.out.println("i am branch in Butwal");
	}
}
class BBS extends Universalbank {
	
	
	public void loan() {
		System.out.println("i am loan of BBS");
	}
	public void save() {
		System.out.println("i am loan of BBS");
		
	}
	public void branchname() {
		System.out.println("i am Butwal branch BBS ");
}
	
}
