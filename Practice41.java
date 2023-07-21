package javatutorial;

public class Practice41 {
//overriding
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NBL Butwal = new NBL("Nepal", "Butwal");
		  Butwal.Loan();
		  Butwal.Save();
		  Butwal.DisplayMessage();
		  
		  BNB Palpa = new BNB("Nepal", "Palpa");
		  Palpa.Save();
		  Palpa.DisplayMessage();
		  Palpa.Loan();
		  
		  
		  

		 }

		}

		class GlobalBank{
		 String Country;
		 
		 public GlobalBank(String CN) {
		  this.Country = CN;
		 }
		 
		 public void Save() {
		  System.out.println("This is save method for Globalbank");
		  
		 }
		 
		 public void Loan() {
		  System.out.println("This is loan method for Globalbank");
		  
		 }
		 
		 public void DisplayMessage() {
		  System.out.println("Welcome to our bank");
		  
		 }
		}
		


		class NBL extends GlobalBank{
		 String City;
		 
		 public NBL(String CN , String CT) {
		  super(CN);
		  this.City = CT;
		 }
		 
		 public void Save() {
		  System.out.println("This is save method for NBL");
		  
		 }
		 
		 public void Loan() {
		  System.out.println("This is loan method for NBL");
		  
		 }
		}

		class BNB extends GlobalBank{
		 String City;
		 
		 public BNB(String CN , String CT) {
		  super(CN);
		  this.City = CT;
		 }
		 
		 public void Save() {
		  System.out.println("This is save method for BNB");
		  
		 }
		 
		 public void Loan() {
		  System.out.println("This is loan method for BNB");
		  
		 }
		 public void DisplayMessage() {
			  System.out.println("Welcome to our bank");
			  
	}}


