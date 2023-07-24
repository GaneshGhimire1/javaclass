package javatutorial;

public class Test8 {
//overloadig 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(2, 3);
		Add(2, 3, 4);
		Add(2, 3, 4, 5);
	}

	public static void Add(int a, int b) {

		System.out.println(a + b);

	}

	public static void Add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void Add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
}