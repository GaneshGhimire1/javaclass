package javatutorial;

public class Practice90 {

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
