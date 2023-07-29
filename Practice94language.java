package javatutorial;

import java.util.ArrayList;

public class Practice94language {

	public static void main(String[] args) {

		// Collection
		
		// Defining  the arrayList 
		// Adding the value to arrayList 
		// Updating the value from arrayList
		// Deleting the value from arrayList


		// ArrayList ------> int 
		// ArrayList ------> string 
		// ArrayList ------> boolean 
		// ArrayLIst ------> person

		
		
		
		ArrayList<String> language = new ArrayList();

		// 0 1 2 3
		// [apple, mango, banana, grapes]

		language.add("apple");
		language.add("mango");
		language.add("banana");
		language.add("grapes");
		System.out.println(language);

		// retrive
		String a = language.get(0);
		String b = language.get(1);
		String c = language.get(2);
		String d = language.get(3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		for (int i = 0; i < language.size(); i++) {
			System.out.println(i);
			System.out.println(language.get(i));
		}
		// update the value of arraylist

		ArrayList<String> flowers = new ArrayList<>();
		
		flowers.add("rose");
		flowers.add("lily");
		flowers.add("sunflower");
		flowers.add("poppy");
		System.out.println(flowers);

		flowers.set(3, "tulip");
		System.out.println(flowers);

		flowers.remove(2);
		System.out.println(flowers);
		
		
		
		
		
	}

}
