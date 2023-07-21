package javatutorial;

public class RevisionPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//conditional statement
		int numP = 80;
		if (numP> 0 && numP <= 5) {
			System.out.println("10%discount");
			
		}
		if (numP > 5 && numP <=15) {
			System.out.println("15%discount");
		
		
	}
		if (numP > 10 && numP <=20) {
			System.out.println("30%discount");
		
		
	}

//	Program 2
	int numP1 = 60;
	
	if (numP1 > 0 && numP1 <= 5) {
		System.out.println("10% discount");
	}
	else if (numP1 > 5 && numP1 <= 10) {
		System.out.println("20%discount");
	}
	
	else if (numP1 > 10 && numP1 <= 15) {
		System.out.println("20%discount");}
	
		else   {
			System.out.println("please put correct input");
	
}
	
	//Program 3
	 int a = 5;
	 int b = 10;
	 if(a>b) {
		 System.out.println("a is greater");}
		 else  {
			 System.out.println("b is greater"); 
		 }
	 
	//Program 3
	 
	 int a1 = 5;
	 int b1 = 10;
	 int c1 = 15;
	 if(a1>b1 && a1 > c1) {
		 System.out.println("a1 is greater");
	 }
	 else if(b1>a1 && b1 > c1) {
		 System.out.println("b1 is greater");}
	 
	 else {
			 System.out.println("c1 is greater");
	
	
	 }
	 // program 4
	 
	// Ternary operator
		
			int d = 70;
			int e = 100;
			String f = d > e ? "d is greater":"e is greater";
			System.out.println(f);
	}
	
	
}

	
	