package javatutorial;

public class Practice15 {

	public static void main(String[] args) {

		// Program 1
		String city1 = "Butwal";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("Hello ".toUpperCase() + uc);

		// Program 2

		String city2 = "BUTwal";
		String lc = city2.toLowerCase();
		System.out.println(lc);

		// Program 3

		String city3 = "Kathmandu";
		int toc = city3.length();
		System.out.println(toc);

		// Program 4

		String city4 = "Chitwan";
		int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);

		// Program 5

		String city5 = "Bhairahawa";
		char c = city5.charAt(city5.length() - 3);
		System.out.println(c);

		// Program 6

		String city6 = "Kathmandu";
		String s2 = city6.substring(2, 5);
		System.out.println(s2);

		// program 7
		String City7 = "Gulmi";
		String UC = City7.toUpperCase();
		System.out.println(UC);
		System.out.println(City7.toUpperCase());
		System.out.println("Goodmorning".toUpperCase()+UC);
		
		
		// program 8
		
		String City8 = "Gulmi";
		String LC = City8.toLowerCase();
		System.out.println(LC);
		
		// Program 9
		
		String City9 = "Lalitpur";
		int tol = City9.length();
		System.out.println(tol);
		
		// program 10
		
		 String City10 = "Lalitpur";
		 int tol2 = City10.toUpperCase().toLowerCase().length();
		System.out.println(tol2);
		
		// program 11
		String city11 = "Gulmi";
		char C = city11.charAt(city11.length()-3);
		System.out.println(C);
		
		// program 12
		String City12 = "Gulmi";
		String s3 = City12.substring(1,2);
		System.out.println(s3);
		
		
		
		
	}
}