package javatutorial;

public class Revisionpractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1

		String FirstName = "ganesh";
		// charAt()
		System.out.println(FirstName.charAt(3));

		// program 2
		// print every character of string using for loop, while loop,for each

		for (int i = 0; i < FirstName.length(); i++) {
			System.out.println(FirstName.charAt(i));
		}

		// program 3

		int i = 0;
		while (i < FirstName.length()) {
			System.out.println(i);
			System.out.println(FirstName.charAt(i));
			i++;
		}

		// program 4 each
		for (char bb : FirstName.toCharArray()) {
			System.out.println(bb);

			// program 5
			String city = "butwal";
			String c = city.toUpperCase();
			System.out.println(c);

			// program 6

			String city1 = "BUtwal";
			String d = city1.toLowerCase();
			System.out.println(d);

			// program 7

			String city2 = " Gulmi ";
			System.out.println(city2.length());
			String e = city2.trim();
			System.out.println(e.length());

			// program 8
			String city3 = "Butwal";
			boolean f = city3.startsWith("B");
			System.out.println(f);

			// program 9
			String city4 = "Butwal";
			boolean g = city4.endsWith("l");
			System.out.println(g);

			// program 10(replace)

			String p1 = "we are playing soccer";
			System.out.println(p1.replace("W", "I"));

			// program 11(replaceAll)

			String pp1 = "we are playing soccer";
			System.out.println(pp1.replaceAll("soccer", "Cricket"));

			// program 10

			String firstName1 = "Ganesh";
			String lastName2 = "Sharma";
			String fullName = firstName1.concat(lastName2);
			System.out.println(fullName);

			// program 12
			

			String city5 = "Butwal";
			String city6 = "Butwal";
			String city7 = "BUTwal";

			boolean j = city5.equals(city6);
			boolean k = city5.equalsIgnoreCase(city7);

			System.out.println(j);
			System.out.println(k);

			System.out.println(city5.contains("B"));
			System.out.println(city5.contains("Bu"));

			// program 13

			String city8 = "I am watching movie";

			String[] m = city8.split(" ");
			for (String cc : m) {
				System.out.println(cc);
			}

			// program 14

			String city9 = "kathmandu";

			String n = city9.substring(4);
			System.out.println(n);

			String o = city9.substring(2, 5);
			System.out.println(o);

			// program 15

			String city10 = "Butwal";
			String rev = "";

			for (int r = 0; r < city10.length(); r++) {
				rev = city10.charAt(r) + rev;
			}
			System.out.println(rev);

			String rev2 = "";
			for (int r = city10.length() - 1; r >= 0; r--) {
				rev2 = rev2 + city10.charAt(r);
			}

			System.out.println(rev2);

		}
	
	// Program 16
		
		
		String city = "Palpa";
		String rev = "";
		for(int r=0;  r<city.length();r++) {
			rev = city.charAt(r)+rev;}
		System.out.println(rev);
		}
		
	
	
	
	
	}
	
	
	

