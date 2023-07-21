package javatutorial;

public class RevisionPractice1 {

	public static void main(String[] args) {
	
		
		int a= 6;
		int b = 7;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		
	// 1)calling the function	
		
	Calculator(18,4); 	

		
	}

// 1) calling a function
 public static void Calculator(int x,int y) {
	 System.out.println(x+y);
	 System.out.println(x-y);
	 System.out.println(x/y);
	 System.out.println(x*y);
	
	// 2)
	 addA();
	
	 //3) 
	 
	 addB(5,6);
	
	 //4)
	 
	 int E = addc(10,4);
	 System.out.println(E);
	 System.out.println(E+E);
	 System.out.println(E-1);
 }

 
 // 2)function without parameter and without return type
 
 public static void addA() {
	 System.out.println(9+9);}
 
 
 // 3) function with parameter and without return type

public static void addB(int i, int j) {
	System.out.println(i+j);
}

// function with parameter and with return type
	
public static int addc(int a,int b) { 
		return a+b;

}



}






