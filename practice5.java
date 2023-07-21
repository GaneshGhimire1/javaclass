package javatutorial;

public class practice5 {

	public static void main(String[] args) {

		// program1
		int numS = 15;

		if (numS > 0 && numS <= 8) {

			System.out.println("5 % discount");
		}
		if (numS > 6 && numS <= 11) {
			System.out.println("10%discount");

		}

		if (numS > 14) {
			System.out.println("20% discount");
		}
		
		 // program2
		
		int numP = 30;
		
		if (numP > 0 && numP <= 5 ) {
			System.out.println("5 % discount");
			
		}
		else if (numP > 6 && numP <= 15) {
			System.out.println("10 % discount");
		}
		
		else if (numP > 10 && numP <= 25) {
			System.out.println("10 % discount");
		
		}
		
		else  {
			System.out.println("incorrect input");	
		
		}
		
				
	

	

	
	// program 3
	
	int marks = 50;
	
	if (marks > 40) {
		System.out.println("Grade A");
	}
	
	if (marks > 25) {
		System.out.println("Grade B");
	}
	if (marks>10) {
		System.out.println("Grade C");
		
	}
	
	//program 4
	 
	int marksA	=75;
	
	if (marksA > 60) {
		System.out.println("Grade A");
	}
	else if (marksA > 50 ) {
		System.out.println("Grade B");
	}
	else if (marksA > 20 ) {
		System.out.println("Grade C");
	}
	else {
		System.out.println("Fail try again");
	}
	
	// program 5
	
	int a = 5;
	int b = 10;
	
	if (a > b) {
		System.out.println("a is greater");
		}
	
	else {
		System.out.println("b is greater");
	}
	
	
	// program 6
	
	
	int x = 20;
	int y = 30;
	int z = 100;
	
	if (x > y && x > z) {
		System.out.println("x is greater");
	}
	else if (y > x && y > z) {
		System.out.println("y is greater");
	}
	else {
		System.out.println("z is greater");
		
	}
	
	//program 7
	// Switch case without break statement
	
	String city  = "Butwal";
	
	switch (city) {
	case "palpa":
	System.out.println("PA");
	
	case "lamahi":
		System.out.println("DG");
	case "Tamgas":
		System.out.println("GU");
	
	case "Butwal":
		System.out.println("RP");
	
	
	default:
		System.out.println("incorrect city name");
		
	}
	
	
	//program 2
	
	String city2 = "Butw";
	switch (city2) {
	case "Palpa":
		System.out.println("PA");
		break;
	case "lamahi":
		System.out.println("DG");
		break;
		
	case "Tamgas":
		System.out.println("GU");
		break;
		
	
	case "Butwal":
		System.out.println("RP");
		break;
	
	
	default:
		System.out.println("incorrect city name");
		
	}
	
	
	
	//program 3
	
	String city3 = "Butwal";
	switch (city3) {
	case "Palpa":
	case "Rampur":	
	
		System.out.println("PA");
		break;
	case "lamahi":
	case "Tulsipur":	
		System.out.println("DG");
		break;
		
	case "Tamgas":
	case "Ridi":
		System.out.println("GU");
		break;
		
	
	case "Butwal":
	case "Tilottama":
		System.out.println("RP");
		break;
	
	
	default:
		System.out.println("incorrect city name");
		
		
		
		//Program 4 
		String city4 = "Huntersville";
		switch (city4) {
		case "concord":
			
			System.out.println("Ch");
			
		}
		
		
		
		
		
		
	}
	
	
	}
	
	
	}
	
	

	

