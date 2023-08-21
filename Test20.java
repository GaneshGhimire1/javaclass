package javatutorial;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welldone");
		try {
			int dividedByzero = 3/0;
			System.out.println("rest of code in try block ");
			System.out.println("rest of code in try block 1");
			System.out.println("rest of code in try block 2");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Goodbye");
		}
	}


