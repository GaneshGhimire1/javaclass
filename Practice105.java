package javatutorial;
import java.util.List;
import java.util.stream.Collectors;
public class Practice105 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PersonA> peoples = List.of(

				new PersonA(" ganesh sharma", 28, "Butwal"), 
				new PersonA("Ravi shrestha", 34, "Chitwan"),
				new PersonA("Raj pandey", 35, "gulmi"), 
				new PersonA("seema pandey", 23, "Kathmandu")
				

		);

		List<PersonA> above25Age = peoples.stream().filter(person -> person.getAge() > 25).collect(Collectors.toList());

		System.out.println(above25Age);

		for (int i = 0; i < above25Age.size(); i++) {
			System.out.println(above25Age.get(i).getAge());
			System.out.println(above25Age.get(i).getCity());
			System.out.println(above25Age.get(i).getName());
		}


		// program 2


		// Map and collect
		// ["ganesh sharma","ravi shrestha","raj pandey","Seema pandey"]

		List<String> names = peoples.stream().map(person -> person.getName()).collect(Collectors.toList());

		for(String A:names) {
			System.out.println(A);
		}

		// Program 3
		// Person and city
		//"ganesh:butwal"
		List<String> hhh = 
				peoples.stream()
				.map(person -> person.getName()
						.concat(" :")
						.concat(person.getCity()))
				.collect(Collectors.toList());


		for(String nc:hhh) {
			System.out.println(nc);
		}















	}

}

class PersonA {

	private String name;
	private int age;
	private String city;

	public PersonA(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

}
		
	


