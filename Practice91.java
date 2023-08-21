package javatutorial;

public class Practice91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Define a array with values ");
int[]marks = {5,10,15,20};

try {
	System.out.println(marks[1]);
	System.out.println(marks[5]);
	System.out.println(4/0);
	
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("please enter a valid index for array");
System.out.println(e.getMessage());


}
catch(Exception e) {
	System.out.println("Exception handled succesfully");
}
System.out.println("moving ahead after managing the exception");
	}

}
