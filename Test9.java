package javatutorial;

public class Test9 {
//question 2 abstract
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monkey1 A  = new Monkey1();
		A.respire();
		A.run();
		
	}

}



abstract class Mammal2{
abstract void run();

public void respire() {
System.out.println("mammal respire");
	
}
	
}
class Monkey1 extends Mammal2{

	public void run() {
		System.out.println("monkey can run");
	}
}



