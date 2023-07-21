package javatutorial;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		
// ans 5 class vehicle with two property color and type

		Vehicle toyota = new Vehicle("toyota black", 2020);
		Vehicle bmw = new Vehicle(" bmw white", 2022);

		System.out.println(toyota.year);
		System.out.println(toyota.color);

		System.out.println(bmw.year);
		System.out.println(bmw.color);

		String a = toyota.run();
		System.out.println(a);

	}
}

class Vehicle {
	int year;
	String color;

	public Vehicle(String co, int mo) {
		this.color = co;
		this.year = mo;
	}

	public String run() {
		return "good speed";

	}

	
	
	// Ans 3 multidimensional array using for loop

	
	int[][] num = new int[3][3];
	{
		num[0][0] = 5;
		num[0][1] = 10;
		num[0][2] = 20;

		num[1][0] = 25;
		num[1][1] = 30;
		num[1][2] = 35;

		num[2][0] = 40;
		num[2][1] = 45;
		num[2][2] = 50;
		System.out.println(num[0][1]);
		System.out.println(num[1][1]);
		System.out.println(num[2][1]);

		// for loop

		for (int p = 0; p < num.length; p++) {
			System.out.println(p);

			int[] arr = num[p];
			for (int s = 0; s < arr.length; s++) {
				System.out.println(arr[s]);
			}
		}

	}

	
	// Ans 4												

	String[] cities = new String[4];
	{

		cities[0] = "rampur";
		cities[1] = "bharatpur";
		cities[2] = "gulmi";
		cities[3] = "chitwan";

		int i = 0;
		while (i < cities.length) {
			System.out.println(cities[i]);
			i++;
		}

		
		//  Ans 3

//reverse string

//reverse
		for (int t = cities.length - 1; t >= 0; t--) {
			System.out.println(cities[t]);

		}
	}

	int t1 = cities.length - 1;
	{
		while (t1 >= 0) {
			System.out.println(cities[t1]);
			t1 = t1 - 1;
		}

		
		// Ans 1 Writing a function with parameter and with return type

		// calling the function
		int F = AddG(20, 10);
		System.out.println(F);
		System.out.println(F + F);
	}

	public static int AddG(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}
}
