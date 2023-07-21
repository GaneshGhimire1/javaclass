package javatutorial;

public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//calling the function
		Calculator(5,6);
		Calculator(8,9);
		
	//calling the function without parameter	
		AddC();
	//calling the function 	
		
		SubC();
		
		
	//calling the function with parameter and no return type
		 AddD(3,6);
		 
		 
		 //calling the function with parameter and return type
		 int E = AddC(3,6);
		 System.out.println(E+E);
		 System.out.println(E-E);
		 System.out.println(E*5);
		 
		 
		 
		 
	// program 8 	
		 
		 String city = "Gulmi";
		 switch (city) {
		 case "butwal":
			 System.out.println("RU");
		 case "bharatpur":
			 System.out.println("CH");
			 default:
				 System.out.println("Incorrect  city name");}
				 
		 
	//program 9
	
	String city2 = "Dang";
	
			switch(city2) { 
			case "gulmi":
				System.out.println("lm");
				break;
				
				default:
					System.out.println("incorrect city name");
				
			}
		 
			
			
			
	}
		 
		 
		 
		 
		 
		 
	
	
	
	public static void Calculator(int x , int y) {
	
		
		
		System.out.println(x+y);
		System.out.println(x-y);
	}
	
	public static void AddC() {
		
		System.out.println(6+3);
		System.out.println(3+4);}
		
	public static void SubC() {	
		System.out.println(7-6);
		System.out.println(8-6);
	
	}

	public static void AddD(int x , int y) {
	System.out.println ( x + y );	
	}
	
	
	public static int AddC(int x , int y) {
		System.out.println(x + y);
		return  x+y;
	}}
	
