package javatutorial;
interface WorldBank9{
	public void save(int x);
	public void loan(int y);
	
}

	
	
	

public class practice61 {

	public static void main(String[] args) {
	SBI10 nepal = new SBI10	();
	nepal.loan(0);
	nepal.save(0);
	
	PNB4 Butwal = new PNB4();
	Butwal.loan(0);
	Butwal.save(0);


}
}
class SBI10 implements WorldBank9{
	public void save  (int x) {
	System.out.println("I am implement from save");
	}
	public void loan (int y) {
		System.out.println(" I am implement from loan");
	}
	
}
class PNB4 implements WorldBank9{
	public void save (int x) {
		System.out.println("i am  implement from save of Pnb");
		
	}
	public void loan (int y) {
		System.out.println("I am implement from loan of pnb");

		
		
		
	}
}