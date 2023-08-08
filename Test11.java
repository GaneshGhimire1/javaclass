package javatutorial;
import java.util.HashMap;

import java.util.Map;
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> Flowers = new HashMap<String,String>();

Flowers.put("rose","red");
Flowers.put("marygold","yellow");
Flowers.put("sunflower","pink");

System.out.println(Flowers);
for (Map.Entry<String,String> entry : Flowers.entrySet()){
	System.out.println(entry.getKey() + entry.getValue());
		
		}
// looping through keyset
for(String A:Flowers.keySet()) {
	 System.out.println(A);
}
//looping through values
for(String B:Flowers. values()) {
	 System.out.println(B);
}

	}

}
