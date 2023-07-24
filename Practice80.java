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

		Reptile4 Lizard = new Reptile4();
		Lizard.displayeat();
		Lizard.displayfly();
		Lizard.displayrun();
		Lizard.displaywalk();
	}

}
class Reptile4 implements Animal4,Bird4{
	public void displayfly() {
		System.out.println("reptile can eat");
	}
	public void displaywalk () {
		System.out.println("reptile can run");
		
		
	}
	public void displayeat() {
		System.out.println("reptile can fly");
		
	}
	public void displayrun() {
		System.out.println("reptile can walk");
	}
	
		
	}

