package javatutorial;

public class Practice90 {
// Exceptional Handling is a mechanism to handle runtime errors.
	
	//the core advantage of exception handling is to maintain the normal flow of the application
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program 3
		System.out.println("define a array with value");
		int []marks = {10,20,30};
		try {
			System.out.println(marks[1]);
			System.out.println(marks[3]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Moving ahead after managing the exception");
	}

}
