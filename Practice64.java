package javatutorial;

interface LB{
	public void Save();
	public void Loan();
	
}

interface GB {
	public void DisplayCountry();
	public void DisplayCity();
	
}
public class Practice64 {

	public static void main(String[] args) {
		
		Bank1 Btl = new Bank1();
		Btl.DisplayCity();
		Btl.DisplayCountry();
		Btl.Loan();
		Btl.Save();
		

	}

}
//more than one interface can be implemented by class


class Bank1 implements LB, GB{

	
	public void DisplayCountry() {
		System.out.println("this is Nepal");
		
		
	}

	
	public void DisplayCity() {
		System.out.println("Kathmandu");
		
		
	}

	
	public void Save() {
		System.out.println("Save method");
		
	}

	
	public void Loan() {
		System.out.println("loan method");
		
	}
	
	
	
	
	
}

