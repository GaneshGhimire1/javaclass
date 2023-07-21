package javatutorial;

public class practice13 {

	public static void main(String[] args) {
		// program 1

		String name = "Ganesh";
		System.out.println(name);
		// 0 1 2 3 4 5
		// G a n e s h
		// String is collection on characters
		// String stores the value by index

		// program 2

		// charAt();

		char fifthChar = name.charAt(5);
		System.out.println(fifthChar);

		// length()
		// action - count total number of char
		// return -int

		// 0 1 2 3 4 5 6
		// G H I M I R E

// program 3

		
		String lastName = "Ghimire";
		int totalChar = lastName.length();
		System.out.println(totalChar);

		//  note : length -1 is always the last index

		// program 4

		String fatherName = "Devi";
		int totalC = fatherName.length();
		System.out.println(totalC);

		for (int i = 0; i < totalC; i++) {
			System.out.println(fatherName.charAt(i));
		}
		// program 4

		String city = "Butwal";
		for (int i = 0; i < city.length(); i++) {
			System.out.println(city.charAt(i));
		}

		// program 5
		// Print every char in reverse order
		String city1 = "Butwal";
		for (int i = city1.length() - 1; i >= 0; i--) {

			System.out.println(city1.charAt(i));
		}
		
		
		// program 6

		String city2 = "Kathmandu";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);

		
		
		// program 7
		String city3 = "KATmandu";
		String lowerCaseString = city3.toLowerCase();
		System.out.println(lowerCaseString);

	}
	
	
	
	
	
}
