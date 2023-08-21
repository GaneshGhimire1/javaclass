package javatutorial;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla A  = new Gorilla();
		A.respire();
		A.run();
		
	}

}



abstract class Animal2{
abstract void run();

public void respire() {
System.out.println("mammal respire");
	
}
	
}
class Gorilla extends Animal2{

	public void run() {
		System.out.println("gorilla can run");
	}


		
	}


