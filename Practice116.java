package javatutorial;

public class Practice116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.out.println("Welcome");
			System.out.println("2/0");
			System.out.println("see you soon");
			
			System.out.println("welcome");
			try {
				int dividedZero = 2/0;
			
			System.out.println("Rest will be in the try block" );
			System.out.println("rest will be in the 1st block");
			
			}
			catch (ArithmeticException e) {
			 System.out.println(e.getMessage());
			}
			System.out.println("see you soon");	
			}
			
			
			
			
		}
		

	


