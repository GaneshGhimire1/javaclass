package javatutorial;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. calling the function with parameter and return type for addition of two
		// number
		int D = AddC(3, 6);
		System.out.println(D + D);

		// 2.calling the function for two variable and perform arthmetic operation
		calculator(8, 5);

		// QUESTION 3) 3 variables and print greatest variable
		int x = 20;
		int y = 50;
		int z = 80;

		if (x > y && x > z) {
			System.out.println("x is greater");

		} else if (y > x && y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}

		// Question 4

		String city = "Butwal";
		switch (city) {
		case "Palpa":

			System.out.println("PA");
			break;
		case "lamahi":

			System.out.println("DG");
			break;

		case "Tamgas":
		case "Ridi":
			System.out.println("GU");
			break;

		case "Butwal":
			System.out.println("RP");
			break;

		default:
			System.out.println("incorrect city name");

		}

	}

	// QUESTION 1
	public static int AddC(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}

	// Question 2
	public static void calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}

}
