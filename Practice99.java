package javatutorial;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Practice99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,String> Fruits = new HashMap<String,String>();
		Fruits.put("Apple","Red");
		Fruits.put("Mango","Green");
		Fruits.put("Banana","Yellow");
		Fruits.put("grapes","black");
		
		System.out.println(Fruits);
		
		for (Map.Entry<String,String> entry : Fruits.entrySet()){
	System.out.println(entry.getKey() + entry.getValue());
		
		}
		
		// Iterator
	     Iterator<Entry<String, String> > new_Iterator1
	         = Fruits.entrySet().iterator();

	     // Iterating every set of entry in the HashMap
	     while (new_Iterator1.hasNext()) {
	         Map.Entry<String, String> new_Map
	             = (Map.Entry<String, String>)
	                   new_Iterator1.next();

	         // Displaying HashMap
	         System.out.println(new_Map.getKey() + " = "
	                 + new_Map.getValue());
	     }
	// Program 2
	 Map<String,String> employees = new HashMap<String,String>();
	 employees.put("firstName","ganesh");
	 employees.put("lastName","sharma");
	 employees.put("ID","105A");
	 employees.put("age","33");
	 
	 // looping through keys 
	 for(String Prop:employees.keySet()) {
		 System.out.println(Prop);
	 }
	 //looping through values
	 for(String Prop:employees.values()) {
		 System.out.println(Prop);
	 }
	// Iterator
     Iterator<Entry<String, String> > new_Iterator2
         = employees.entrySet().iterator();

     // Iterating every set of entry in the HashMap
     while (new_Iterator2.hasNext()) {
         Map.Entry<String, String> new_Map1
             = (Map.Entry<String, String>)
                   new_Iterator2.next();

         // Displaying HashMap
         System.out.println(new_Map1.getKey() + " = "
                 + new_Map1.getValue());

	 
	 
	 
	 
	 
	 
	 // Program 3 
	 Map<String,String> Furniture = new HashMap<String,String>();
	 Furniture.put("Color", "white" );
	 Furniture.put("type", "sofa" );
	 Furniture.put("company", "Rooms to go" );

	 System.out.println(Furniture);
	 
	 System.out.println(Furniture.get("color"));
	 for(String key : Furniture.keySet()) {
		 System.out.println(key);
		 System.out.println(Furniture.get(key));
	 }
	// Iterator
     Iterator<Entry<String, String> > new_Iterator
         = Furniture.entrySet().iterator();

     // Iterating every set of entry in the HashMap
     while (new_Iterator.hasNext()) {
         Map.Entry<String, String> new_Map
             = (Map.Entry<String, String>)
                   new_Iterator.next();

         // Displaying HashMap
         System.out.println(new_Map.getKey() + " = "
                 + new_Map.getValue());

}}}}
