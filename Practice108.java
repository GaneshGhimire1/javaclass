package javatutorial;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Practice108 {
 //important all in one
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<String,Integer>students = new HashMap<>	();
	students.put("ganesh", 34);
	students.put("Ram",25);
	students.put("shyam", 30);
	
	System.out.println(students);
	
	
	//retrive to get the value
	int a = students.get("Ram");
	System.out.println(a);
	
	// update 
	
	students.put("shyam", 37);
	System.out.println(students);
		
	// remove
	students.remove("ganesh");
	System.out.println(students);
	
	// to know the size of the key value
	students.size();
	System.out.println(students.size());
	 // contains
	boolean b = students.containsKey("Ram");
	System.out.println(b);
	

	for(Map.Entry<String,Integer> entry : students.entrySet()) {
		System.out.println(entry.getKey() + "" + entry.getValue());
	}
	
	Iterator<Map.Entry<String,Integer>>abc = students.entrySet().iterator();
	
	while(abc.hasNext()) {
		Map.Entry<String,Integer>entry = abc.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	for(String key : students.keySet()) {
	System.out.println(key);
	}
	for (Integer value : students.values()) {
		System.out.println(value);
	}
}}
