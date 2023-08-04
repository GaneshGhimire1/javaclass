package javatutorial;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
	// Program 2
	 Map<String,String> employees = new HashMap<String,String>();
	 employees.put("firstName","ganesh");
	 employees.put("lastName","sharma");
	 employees.put("ID","105A");
	 employees.put("age","33");
	 
	 for(String Prop:employees.values()) {
		 System.out.println(Prop);
	 }
	 for(String Prop:employees.values()) {
		 System.out.println(Prop);
	 }
	 
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
	 

}}
