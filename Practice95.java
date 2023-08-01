package javatutorial;

import java.util.ArrayList;

public class Practice95 {

	
	//list ,clear remove,contains, set, indexOf, get, Userinput
	
	
	
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		// add()
		boolean a = names.add("Ganesh");
		System.out.println(a);
		names.add("Rahul");
		names.add("Amar");
		names.add("Birbal");
		System.out.println(names);

		// add(position , element)
		
		names.add(3, "Akbar");
		System.out.println(names);

		
		// remove
		// 0 1 2 3 4
		// [Ganesh,Rahul, Amar, Birbal, Akbar]

		
		names.remove(1);
		System.out.println(names);
		names.remove("Amar");
		System.out.println(names);

		// clear()
		names.clear();
		System.out.println(names);

		names.add("Roshan");
		names.add("Rohit");
		names.add("Ram");
		names.add("Roshni");
		System.out.println(names);

		
		// [Roshan,Rohit,Ram, Roshni]
		// set()
		names.set(2, "Atul");
		System.out.println(names);

		
		// contains()
		boolean A1 = names.contains("Ram");
		System.out.println(A1);

		// [Roshan,Rohit,Ram, Roshni]
		// get()
		String eleAtIndex1 = names.get(1);
		System.out.println(eleAtIndex1);

		// indexof()
		int nums = names.indexOf("Roshni");
		System.out.println(nums);

		int numsA = names.indexOf("Roshni");
		System.out.println(numsA);

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		System.out.println(fruits);

		String userInput = "cherry";
		if (fruits.contains(userInput)) {
			System.out.println("Element available");
		} else {
			System.out.println("Element is not available");
		}

		// index0f()
		if (fruits.indexOf("mango") >= 0) {
			System.out.println("Element available");
		} else {
			System.out.println("Element not avialabe");
		}

		ArrayList<String> cities = new ArrayList<>();
		cities.add("butwal");
		cities.add("Kathmandu");
		cities.add("palpa");
		cities.add("gulmi");
		cities.add("butwal");
		
		System.out.println(cities.size());
		System.out.println(cities);

		// [ butwal, kathmandu, palpa,gulmi,butwal ]
		System.out.println(cities.indexOf("butwal"));
		System.out.println(cities.lastIndexOf("butwal"));

		
		
	}

}
