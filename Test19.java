package javatutorial;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NB butwal = new NB("Nepal", "butwal");
		butwal.loan();
		butwal.save();
		butwal.displayMessage();
	}
	
	
	

}

class WorldBankC {
	String country;
	
	public WorldBankC(String cnt) {
		this.country = cnt;
	}
	
	public void save() {
		System.out.println(" i am save method from the worldbank");
	}
	
	public void loan() {
		System.out.println(" i am loan method from the worldbank");
	}
	
	public void displayMessage() {
		System.out.println("welcome to WorldBank");
	}
	
	
}

class BB extends WorldBankC {
	String branchName;

	public BB(String cnt,String bn) {
		super(cnt);
		this.branchName = bn;	
	}
	
	
	public void save() {
		System.out.println("I am save from BB Butwal");
		
	}
	
	public void loan() {
		System.out.println("I am loan from BB Butwal");
	}
		
}

class NB extends WorldBankA {
	
	String branchName;

	public NB(String cnt,String bn) {
		super(cnt);
		this.branchName = bn;
		
	}
	
	
	

	public void save() {
		System.out.println("I am save from NB butwal");
		
	}
	
	public void loan() {
		System.out.println("I am loan from NB butwal");
	}
		

	
		
	}


