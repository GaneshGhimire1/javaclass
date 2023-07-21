package javatutorial;

public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// loops 

		// program 1
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// program 2

		for (int i = 6; i >= 1; i--) {
			System.out.println(i);
		}

		// program 3

		for (int i = 4; i <= 16; i = i + 2) {
			System.out.println(i);
		}

		// program 4

		// for loop with break;
		for (int i = 2; i < 8; i++) {
			if (i == 3) {
				break;
			}

		}
		// program 5

		for (int i = 4; i >= 1; i--) {
			if (i == 2) {
				break;
			}
			System.out.println();
		}

		// Program 6

		for (int i = 30; i >= 5; i = i - 5) {
			System.out.println(i);
		}

		// program 7
		// continue statement with for

		for (int i = 2; i <= 4; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}

		// program 8
		for (int i = 6; i >= 1; i--) {
			if (i == 2) {
				continue;
			}
			System.out.println();
		}
		
		// program 9
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("hello");
			
		}
		
		for(int i = 5 ; i >= 1 ; i --) { // 4 // 3 // 2 // 1 // 0
			if(i == 2) {
				continue ;
			}
			System.out.println(i); // 5 // 4 // 3 // 1
			
		//problem 10
			
			
	}}
}

