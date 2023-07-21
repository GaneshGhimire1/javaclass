package javatutorial;

public class Practice42 {

	public static void main(String[] args) {
		// overriding 
		// overriding has different class,same method,same signature, inheritence
		PNC Baltimore = new PNC("USA", "Baltimore");
	    Baltimore.loan();
	    Baltimore.save();
	    Baltimore.displayMessage();

	  }

	}

	class USBank {
	  String country;

	  // constructor

	  public USBank(String cnt) {
	    this.country = cnt;

	  }

	  public void save() {
	    System.out.println("save method from USBank");

	  }

	  public void loan() {
	    System.out.println("loan method from USBank");

	  }

	  public void displayMessage() {
	    System.out.println("welcome to USBank");

	  }
	}

	class BOA extends USBank {
	  String branchName;

	  public BOA(String cnt, String bn) {
	    super(cnt);
	    this.branchName = bn;
	  }

	  // Overriding the parent method loan and save

	  public void save() {
	    System.out.println("save from BOA Baltimore");
	  }

	  public void loan() {
	    System.out.println("loan from BOA Baltimore");

	  }
	}

	class PNC extends USBank {
	  String branchName;

	  public PNC(String cnt, String bn) {
	    super(cnt);
	    this.branchName = bn;
	  }

	  // overriding the parent method loan and save

	  public void save() {
	    System.out.println("save from PNC Baltimore");
	  }

	  public void loan() {
	    System.out.println("loan from PNC Baltimore");

	  }

	
	
	


}
	


