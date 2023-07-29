package javatutorial;

import java.util.ArrayList;

public class Practice94collection {

	public static void main(String[] args) {

		Person5 ganesh = new Person5("ganesh", "sharma");
		Person5 Ramesh = new Person5("Ramesh", "sharma");
		Person5 shyam = new Person5("shyam", "sharma");
		Person5 gopal = new Person5("gopal", "sharma");
		Person5 Ravi = new Person5("Ravi", "sharma");

		ArrayList<Person5> students = new ArrayList<>();
		students.add(ganesh);
		students.add(Ramesh);
		students.add(shyam);
		students.add(gopal);
		students.add(Ravi);

		students.get(1).display();

		// for

		for (int i = 0; i < students.size(); i++) {
			System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();
		}

		// while loop
		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).display();
			t1++;
		}

		// for each

		for (Person5 a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.display();
		}

	}

}

class Person5 {
	String firstName;
	String lastName;

	public Person5(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void display() {
		System.out.println(this.firstName + this.lastName);
	}
}