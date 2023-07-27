package javatutorial;

public class Practice89 {
// exceptional handling
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome");
System.out.println("4/0");
System.out.println("see you soon");		
		
	// program 2
		System.out.println("welcome");
		try {
			int dividedByzero = 4/0;
			System.out.println("rest of code in try block");
			System.out.println("rest of code in try block 2" );
			System.out.println("rest of code in try block 3" );
			System.out.println("rest of code in try block 4" );
		}
		catch(ArithmeticException e) {
		
			System.out.println(e.getMessage());
		
	}
System.out.println("see you soon");
	}}
