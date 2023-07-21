package javatutorial;

public class Practice20 {

	public static void main(String[] args) {

		// creating a instance or object

		Human Ganesh = new Human();
		System.out.println(Ganesh.age);
		System.out.println(Ganesh.name);
		Ganesh.eat();
		Ganesh.sing();

		Ganesh.age = 36;
		Ganesh.name = "Ganesh Sharma";
		System.out.println(Ganesh.age);
		System.out.println(Ganesh.name);

	}

	
}

class Human {

	// Properties and methods
	int age;
	String name;

	// methods

	public void eat() {
		System.out.println("I am eating");
	}

	public void sing() {
		System.out.println("I am singing");
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
		