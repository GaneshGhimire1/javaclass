package javatutorial;

public class RevisionPractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String city = "Butwal";
	switch (city) {
	case "palpa":
	System.out.println("lm");
	
	case "bhairaha":
		System.out.println("Ru");
	
	case "bharatpur":
		System.out.println("ch");
	case "Butwal":
		System.out.println("lm");
		
		
	default:
		System.out.println("ln correct city name");
	
	
	}
		
	switch (city) {
	case "palpa":
	System.out.println("lm");
	break;
	case "bhairaha":
		System.out.println("Ru");
		break;
	case "bharatpur":
		System.out.println("ch");
		break;
	default:
		System.out.println("ln correct city name");
	


	}
	
	switch (city) {
	case "palpa":
	case  "gulmi":
		System.out.println("lm");
	break;
	case "bhairaha":
	case "shankarnagar":
		System.out.println("Ru");
		break;
	case "bharatpur":
	case "govindpur":	
		System.out.println("ch");
		break;
	
		
	default:
		System.out.println("ln correct city name");
	
}
	// loops

//	for(intialzation ; conditionCheck ; increment/decrement) {
//		// statement
//	}
//	

	
	for (int i = 1; i <= 5; i++) {  
		System.out.println(i); 
	}

	for (int i = 5; i >= 1; i--) {
		System.out.println(i);
	}

	for (int i = 2; i <= 20; i = i + 2) {
		System.out.println(i);
	}

	for (int i = 50; i >= 5; i = i - 5) {
		System.out.println(i);
	}

	// break with for

	for (int i = 1; i <= 5; i++) { 
		if (i == 3) {
			break;
		}
		System.out.println(i); 
	}

	for (int i = 1; i <= 5; i++) {
		System.out.println(i);
		if (i == 3) {
			break;
		}

	}

	// for with continue
	for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 // 6
		if (i == 3) {
			continue;
		}

		System.out.println(i); // 1 // 2 // 4 // 5
	}

	// while

	



	int p1 = 1;

	while (p1 <= 5) {
		System.out.println("nameste");
		p1++;
	}

	int p2 = 1;
	while (p2 <= 4) {
		System.out.println(p2);
		p2++;
	}

	int p3 = 8;
	while (p3 >= 1) {
		System.out.println(p3);
		p3--;
	}

	int p4 = 4;
	while (p4 <= 40) {
		System.out.println(p4);
		p4 = p4 + 4;
	}

	int p5 = 50;
	while (p5 >= 5) {
		System.out.println(p5);
		p5 = p5 - 5;
	}

	int p6 = 8;
	while (p6 >= 1) {
		if (p6 == 5) {
			break;
		}
		System.out.println(p6);
		p6--;
	}

	int p7 = 1;
	while (p7 <= 10) {
		if (p7 == 4) {
			p7 ++; // 4
			continue;
		}
		System.out.println(p7); // 1 // 2 // 4 // 5
		p7++; // 2 // 3 // 5 //6
	}
	
	
	
	
	
	
	
	}}
	
	
