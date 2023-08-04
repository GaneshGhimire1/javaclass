package javatutorial;

import java.util.HashMap;
import java.util.Map.Entry;

public class Practice97 {

	// HashMap 
	
	public static void main(String[] args) {

		HashMap<String, Integer> students = new HashMap<>();
		students.put("ganesh", 35);
		students.put("Roshan", 30);
		students.put("Ravi", 37);
		students.put("Raj", 34);
		System.out.println(students);

		// Accessing the value from HashMap()
		int a = students.get("ganesh");
		System.out.println(a);

		// check particular key exists
		boolean b = students.containsKey("Ravi");
		System.out.println(b);

		// total number of key value in HashMap()
		int c = students.size();
		System.out.println(c);

		// remove the value
		students.remove("ganesh");
		System.out.println(students);

		// update the value
		students.put("Ravi", 40);
		System.out.println(students);

		// looping through Hashmap

		System.out.println(students.values());
		System.out.println(students.keySet());

		// loop over it using above method
		// loop over it using above method 
				// print all keys and their values 


		for (String key : students.keySet()) {
			System.out.println(key);
		}

		for (int value : students.values()) {
			System.out.println(value);

		}
		for (Entry<String, Integer> set : students.entrySet()) {
		

           // Printing all elements of a HashMap
           System.out.println(set.getKey() + " = "
                              + set.getValue());
       }
		
    }
		
			
		}
	

