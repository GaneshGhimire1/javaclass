package javatutorial;
interface Animal4{
	public void eat();
	public void run();
}
interface Bird4 {
	public void fly();
	public void walk();
}





public class Practice80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Penguin A = new Penguin();
		A.displayeat();
		A.displayfly();
		A.displayrun();
		A.displaywalk();
	}

}
class Penguin implements Animal4,Bird4{
	public void displayfly() {
		System.out.println("penguin can eat");
	}
	public void displaywalk () {
		System.out.println("penguin can run");
		
		
	}
	public void displayeat() {
		System.out.println("penguin can fly");
		
	}
	public void displayrun() {
		System.out.println("penguin can walk");
	}
	
		
	}

