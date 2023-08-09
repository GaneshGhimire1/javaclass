package javatutorial;

import java.util.Arrays;
import java.util.List;

public class Practice103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count of blank strings
		List<String> names = Arrays.asList("ganesh","","ramesh","gopal","","ravi");
		System.out.println(names.stream().filter(x -> x.isEmpty()).count());
	
		// taking the blank string to list
		List<String> name2 = Arrays.asList("ganesh","","ramesh","gopal","","ravi");
		System.out.println(names.stream().filter(x -> x.isEmpty()).toList());

	
	}

}
