package javatutorial;
/// note
//ennum is a way of defining constant variable

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
