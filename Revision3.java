package javatutorial;

public class Revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//question 1
		
		int[] numbers = new int[3];
		numbers[0] = 11;
		numbers[1] = 12;
		numbers[2] = 13;

		System.out.println(numbers[2]);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(i);
			System.out.println(numbers[i]);
		}

		// while loop
		int i = 0;
		while (i < numbers.length) {
			System.out.println(numbers[i]);
			i++;
		}

		// question 2

		int[] numbers2 = { 11, 22, 33 };
		for (int i1 = 0; i1 < numbers2.length; i1++) {
			System.out.println(numbers2[i1]);
		}

		// while loop

		int i2 = 0;
		while (i2 < numbers2.length) {
			System.out.println(numbers2[i2]);

			i2++;

		}
		// each

		for (int a : numbers2) {
			System.out.println(a);
		}

		
		//question 3
		
		String[] names = new String[2];
		names[0] = "ram";
		names[1] = "sham";

		for (int i3 = 0; i3 < names.length; i3++) {
			System.out.println(names[i3]);
		}

		int i4 = 0;
		while (i4 < names.length) {
			System.out.println(names[i4]);
			i4++;
		}
		
		//question 4
		
		String[] names2 = { "ram", "sham" };

		for (int i5 = 0; i5 < names2.length; i5++) {
			System.out.println(names2[i5]);
		}
		// while
		int i6 = 0;
		while (i6 < names2.length) {
			System.out.println(names2[i6]);
			i6++;

		}
		// for each

		for (String b : names) {
			System.out.println(b);
		}

	}
}
