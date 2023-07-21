package javatutorial;
interface AsianBank{
public void Save(int x);
public void loan(int y);
	
	
	
}
public class practice61 {

	public static void main(String[] args) {
		
NBL2 nepal = new NBL2();
nepal.loan(2);
nepal.save(2);

BBL Butwal = new BBL();
Butwal.loan(1);
Butwal.save(1);
	}

}
class NBL2 implements AsianBank{
	
	public void save(int x) {
		System.out.println("This is save method for NBL2");
	}
	public void loan(int y ) {
		System.out.println("This is loan method for NBL2");
	}
}

class BBL implements AsianBank{
	public void save(int x) {
		System.out.println("This is save method for BBL");
	}
	public void loan(int y ) {
		System.out.println("This is loan method for BBL");
	}
}


