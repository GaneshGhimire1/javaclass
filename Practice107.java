package javatutorial;
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map;
public class Practice107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<String , Integer> hashMapone = new HashMap<>(); 
		  System.out.println(hashMapone); 
		  
		// add 
		  //            key - value 
		  hashMapone.put("apple", 1); 
		  hashMapone.put("banana", 2); 
		  hashMapone.put("mango", 3); 
		  System.out.println(hashMapone);
	
	
		  // update  
		  hashMapone.put("banana",23); 
		  System.out.println(hashMapone); 

		// getting the value (retrive ) 
		  int a = hashMapone.get("mango"); 
		  System.out.println(a); 

		  hashMapone.remove("apple"); 
		  System.out.println(hashMapone); 
	
		  
		// how many key-values are there  

		  System.out.println(hashMapone.size());
	
		  HashMap<String , String> hashMapTwo = new HashMap<>(); 

		  hashMapTwo.put("NC", "Northcarolina"); 
		  hashMapTwo.put("ktm", "Nepal"); 
		  hashMapTwo.put("MD", "Maryland"); 
		  hashMapTwo.put("Dl", "delhi");
	
		// To check whether a key exist or not ?? 

		  if(hashMapTwo.containsKey("MD")) { 
		   System.out.println(hashMapTwo.get("MD")); 
		  } 
		  if(hashMapTwo.containsValue("nepal")) { 
			   System.out.println("value is available"); 
			  } 
		  
		// containskey() and containsvalue -- return boolea values  

		  for(String key:hashMapTwo.keySet()) { 
		    System.out.println(key); 
		    System.out.println(hashMapTwo.get(key)); 
		  } 
		  System.out.println(hashMapTwo.keySet()); 
		  System.out.println(hashMapTwo.values()); 

		  for(Map.Entry<String, String>entry:hashMapTwo.entrySet()) { 
			   System.out.println(entry.getKey()+" "+entry.getValue()); 
			  } 
		  HashMap<String , String> hashMapThree = new HashMap<>(); 
		  hashMapThree.put("ganesh","sharma"); 
		  hashMapThree.put("ram","pandey"); 
		  hashMapThree.put("ramesh ","rao"); 
		  hashMapThree.put("suresh","pun"); 
		   
		  System.out.println(hashMapThree); 

		  Iterator<Map.Entry<String, String>> abc = 
		    hashMapThree.entrySet().iterator(); 

		  while(abc.hasNext()) { 
		   Map.Entry<String, String> entry = abc.next(); 
		   System.out.println(entry.getKey()); 
		   System.out.println(entry.getValue()); 
		  
	}

}}
