package javatutorial;

import java.util.Arrays;
import java.util.List;

public class Practice102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				// Stream - Imp for API testing 

				// count of blank strings
				List<String> names = Arrays.asList("ganesh","","ramesh","gopal","","ravi");
				System.out.println(names.stream().filter(x -> x.isEmpty()).count());

				// taking the blank string to list
				List<String> name2 = Arrays.asList("ganesh","","ramesh","gopal","","ravi");
				System.out.println(names.stream().filter(x -> x.isEmpty()).toList());

				//Only the string
				List<String> name3 = Arrays.asList("ganesh","","ramesh","gopal","","ravi");
				System.out.println(names.stream().filter(x -> !x.isEmpty()).toList());

				// names starts with "S"
				List<String> name4 = Arrays.asList("ganesh","","ramesh","gopal","","ravi");
				System.out.println(name4.stream().filter(x -> x.contains("i")).toList());

				// string greater then 4
				System.out.println(name4.stream().filter(x -> x.length() > 4).toList());


				// Working with every element of string 
				// ["ganesh","shyam","ram"] ===> //["GANESH","SHYAM","RAM"]
				// ["ganesh","raj","roshan"] ===>  // ["ganesh","raj"]

				List<Integer> transactions = Arrays.asList(200,-2000,1999,-900,-1230,98);

				System.out.println(transactions.stream().filter(tra -> tra >0).toList());
				System.out.println(transactions.stream().filter(tra -> tra < 0).toList());


				// Convert every list in map to Upper case()

				List<String> countries =Arrays.asList("Nepal","India","japan","Bhutan","London");
				System.out.println(countries.stream().map(x -> x.toUpperCase()).toList());


				List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
				System.out.println(numbers.stream().map(x -> x * 2).toList());

				List<Integer> salary = Arrays.asList(5000,6000,7000,8000,9000);
				System.out.println(numbers.stream().map(x -> x * 2).toList());

				System.out.println(salary.stream().map(x -> x + x * 0.20).toList());
	}

}
