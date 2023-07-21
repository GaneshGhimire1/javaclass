package javatutorial;

public class practice16 {

	public static void main(String[] args) {
		// program 1

		// starts with()

		String city1 = "Butwal";
		Boolean p = city1.startsWith("B");
		System.out.println(p);

		// Program 2

		// EndsWith()

		String city2 = "Butwal";
		Boolean p1 = city2.endsWith("wal");
		System.out.println(p1);

		// Program 3
		
		
		// replaceFirst()
		
		String city3 = "I like pizza";
		String p2 = city3.replaceFirst("I", "we");
		System.out.println(p2);

		// program 4
		
		// replace()

		String city4 = "Ram is a good soccer player";
		String p3 = city4.replace("a", "e");
		System.out.println(p3);

		
		// program 5
		
		// replaceAll
		String city5 = "Ram is a good soccer player";
		String p4 = city4.replaceAll("a", "e");
		System.out.println(p4);
		
		// program 6
		
		// concat()
		String city6 = " Shyam ";
		String city7 = "How are you";
		String p5 = city7.concat(city6);
		System.out.println(p5);

		
		// program 7

		// contains()
		String city8 = "I am playing cricket";
		Boolean p6 = city8.contains("playing");
		System.out.println(p6);

		
		// program 8
		
		// equal()
		String city9 = "Butwal";
		String city10 = "butwal";
		boolean p7 = city10.equals(city9);
		System.out.print(p7);

		
		// program 9
		
		// equalIgnoreCase()
		
		String city11 = "Butwal";
		String city12 = "butwal";
		boolean p8 = city11.equalsIgnoreCase(city12);
		System.out.print(p8);

		
		// Program 10
		
		// trim()
		
		String city13 = " Ram is a good boy ";
		System.out.println(city13.length());
		String p9 = city13.trim();
		System.out.println(p9.length());

		
		
		
	}

}
