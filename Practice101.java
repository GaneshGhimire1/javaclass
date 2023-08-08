package javatutorial;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class Practice101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String>Fruits = new HashMap<String,String>();
		Fruits.put("apple", "red");
		Fruits.put("mango", "green");
		System.out.println(Fruits);
		for(Map.Entry<String,String>entry:Fruits.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
		}
		// looping through keys 
		 for(String Prop:Fruits.keySet()) {
			 System.out.println(Prop);
		 }
		 //looping through values
		 for(String Prop:Fruits.values()) {
			 System.out.println(Prop);
		 }
		 
		// Iterator
	     Iterator<Entry<String, String> > new_Iterator
	       = Fruits.entrySet().iterator();
	     
	}


}
