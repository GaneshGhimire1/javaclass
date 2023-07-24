package javatutorial;

public class Test9 {
//question 2 abstract
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird2 sparrow  = new Bird2();
		sparrow.respire();
		sparrow.run();
		
	}

}



abstract class Mammal{
abstract void run();

public void respire() {
System.out.println("mammal respire");
	
}
	
}
class Birds2 extends Mammal{

	public void run() {
		System.out.println("birds can run");
	}
}