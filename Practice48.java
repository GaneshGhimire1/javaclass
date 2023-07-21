package javatutorial;

public class Practice48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calling the function

		Calculator(4, 5);
	}

	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);

		// 2)
		Add();

// 3

		AddB(4, 5);

// 4
		int G = AddC(5, 5);
		System.out.println(G);
		System.out.println(G + G);
		System.out.println(G - G);
	}
//function without parameter and no return type

	public static void Add() {
		System.out.println(4 + 5);

	}

// function with parameter and no return type
	public static void AddB(int x, int y) {
		System.out.println(x + y);

	}
	// function with parameter with parameter with return type

	public static int AddC(int x, int y) {

		return x + y;

	}




	






}
