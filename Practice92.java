package javatutorial;

public class Practice92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome");
		try {
			System.out.println(6/6);
		}
		catch(Exception e) {
			System.out.println("Exception managed sucesfully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		finally {
		
	System.out.println("I will be executed anyhow");
	}}}


