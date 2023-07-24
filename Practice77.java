package javatutorial;

public class Practice77 {
/// overloading i,e same class, same method but different signature or parameter
	public static void main(String[] args) {
		Add(5,6);
		Add(5,6,7);
		Add(5,6,7,8);

	}



public static void Add(int a , int b) {
	
System.out.println(a + b);	
	
	
}
public static void Add(int a , int b , int c) {
	
System.out.println(a + b + c);

}
public static void Add(int a , int b , int c , int d) {
	
System.out.println(a + b + c +  d);
}}