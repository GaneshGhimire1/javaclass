package javatutorial;

public class day2 {

	public static void main(String[] args) {
		
		// calling the function 
		calculator(5,5);
		
		// calling the function 
		Add();
		
		// calling the function
		
		Sub();
		
		// calling the function 
		AddD(20,10);
		
		// calling the function
		int sum = AddG(20,10);
		System.out.println(sum);
		
	
	}

	public static void calculator(int x, int y) {

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x%y);
	}

	// writing a function without parameter and without return type

	public static void Add() {

		System.out.println(5 + 5);
	}
		
		public static void Sub() 
		{
			
			System.out.println(10-5);
			System.out.println(15-3);
		}
			
		//Writing a function with parameter and without return type
			
			public static void AddD(int x, int y) 
			{
				System.out.println(x+y);
				
			}
			
			//Writing a function with parameter and with return type
			
			public static int AddG(int x, int y) {
				System.out.println(x+y);
				return x+y;
			}
				
			
			}


