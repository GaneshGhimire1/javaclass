package javatutorial;

public class practice17 {

	public static void main(String[] args) {

		// program 1

		// type [] name of Array = new type [length of array]

		int[] numbers = new int[4];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);

		int[] numbers2 = { 10, 20, 30, 40 };
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);

		// program 2

		String[] cities = new String[4];

		cities[0] = "Butwal";
		cities[1] = "Palpa";
		cities[2] = "Gulmi";
		cities[3] = "Chitwan";

		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		// looping through array

		for (int i = 0; i < cities.length; i++) {
			System.out.println(i);
			System.out.println(cities[i]);
		}

		int[] marks = { 5, 10, 15, 20, 25 };
		for (int t = 0; t < marks.length; t++) {
			System.out.println(marks[t]);
		}

		// reverse
		for (int t = marks.length - 1; t >= 0; t--) {
			System.out.println(marks[t]);
		}

		// program 3

		int mks[] = { 10, 20, 30, 40 };
		int p = 0;
		while (p < mks.length) {
			System.out.println(mks[p]);
			p = p + 1;

		}

		int p1 = mks.length - 1;
		while (p1 >= 0) {
			System.out.println(mks[p1]);
			p1 = p1 - 1;

		}
		// program 4 ( for each loop)

		String[] names = { "Ganesh", "Ram", "Shyam" };
		int[] mks2 = { 5, 10, 20 };

		for (String b : names) {
			System.out.println(b);
		}

		for (int c : mks2) {
			System.out.println(c);

		}
	}
	
}
