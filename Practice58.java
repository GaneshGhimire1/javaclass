package javatutorial;

public class Practice58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 peacock  lily = new peacock();
			lily.fly();
			lily.eat();
		}
		
		
	}


abstract class birds{
	abstract void fly();
	
	
	public void eat() {
	System.out.println("I am eating grains");
	
	}
}
class peacock extends birds{
	public void fly() {
		System.out.println("I am not flying for long distance");
	}
}
abstract class mammal{
	abstract void walk();
	
	public void sense() {
		System.out.println("mammal have a sense organ");
	}
}
class Buffalo extends mammal{
	public void walk() {
	System.out.println("mammal can walk");
}}