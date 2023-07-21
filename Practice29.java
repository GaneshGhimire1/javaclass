package javatutorial;

public class Practice29 {

	public static void main(String[] args) {

		//Note
		// Default constructor is always called;
		// Class can have multiple constructor (constructor overloaded)
		// Constructor don't have return type 
		// Constructor name should be similar to class name
		
		
		Vehicle2 nissan = new Vehicle2();
		Vehicle2 ford = new Vehicle2("ford");
		Vehicle2 tesla = new Vehicle2("tesla", "Q4");
	}

}

class Vehicle2 {
	String name;
	String model;

	public Vehicle2() {
		System.out.println("Default constructor is called");
	}

	public Vehicle2(String nm) {
		this.name = nm;
		System.out.println("The name of vehicle" + this.name);
	}

	public Vehicle2(String nm, String md1) {
		this.name = nm;
		System.out.println("The name of vehicle" + this.name + this.model);

	}
}

