package javatutorial;

public class Practice82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Monkey A  = new Monkey();
		A.respire();
		A.run();
		
	}

}



abstract class Mammalia{
abstract void run();

public void respire() {
System.out.println("mammal respire");
	
}
	
}
class Monkey extends Mammalia{

	public void run() {
		System.out.println("monkey can run");
	}
}

		
	


