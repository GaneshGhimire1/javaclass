package javatutorial;

public class Practice96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello everyone");
		 System.out.println(2/0);
		 System.out.println ("Nameste");
			//program 2
		System.out.println("goodbye");
		try {
			int dividedByzero = 2/0;
			System.out.println("rest of code in try block ");
			System.out.println("rest of code in try block 1");
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Goodbye");
		}}
	


