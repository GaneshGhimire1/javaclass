package javatutorial;
/// note ennum or ennumeration means which are not change or constant
//ennum is a way of defining constant variable
//  enum also have properties and fields same as class
// enum can have constant value as well as method also
// In this program (this) is the reference variable for size 

enum Sizee {
	small, medium, large, extralarge;

	public int getSize() {
		switch (this) {
		case small:
			return 3;
		case medium:
			return 4;
		case large:
			return 5;
		case extralarge:
			return 6;
		default:
			return 0;

		}
	}
}

public class Practice85ennum {

	public static void main(String[] args) {
	

		int order = Sizee.small.getSize();
		System.out.println(order);

	}

}
