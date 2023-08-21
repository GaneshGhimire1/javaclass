package javatutorial;

public class Test15 {
// overloading
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator1 A = new Calculator1();
A.Addition(2, 3);
A.Addition(2, 3,4);
A.Addition(2, 3,4,5);
	}

}
 class Calculator1 {
	 public void Addition(int a, int b) {
	 System.out.println(a + b );
	 
 }
 public void Addition(int a, int b, int c) {
 System.out.println( a + b + c);
 }
 public void Addition(int a, int b, int c, int d) {
 System.out.println(a + b+ c+ d);
 }
 }