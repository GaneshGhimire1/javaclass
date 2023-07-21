package javatutorial;

public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird parrot = new Bird();
		System.out.println(parrot.name);
		System.out.println(parrot.age);
		parrot.sing();
		parrot.eat();
		
		
		parrot.name = "Ram";
		parrot.age = 4;
		System.out.println(parrot.name);
		System.out.println(parrot.age);
		
		
		
		
	}

}

class Bird{
	//Properties
	String name;
	int age;
	
	
	public void sing() {
		
	}
	public void eat() {
}}
