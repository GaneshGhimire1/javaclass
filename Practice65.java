package javatutorial;

interface Apple{
	public void methodApple();
}
interface Mango{
	public void methodMango();
}

interface Grapes{
	public void methodGrapes();
}






public class Practice65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits Healthy = new Fruits();
		Healthy.Pineapple();
		Healthy.Kiwi();
		Healthy.methodApple();
		Healthy.methodMango();
			
		
		
	}

}
class Pineapple{
	public void Pineapple() {
		System.out.println("This is first method for class pineapple");
	}
	
	public void Kiwi() {
		System.out.println("This is second method for class Kiwi");
	}
	
	
	
}

class Fruits extends Pineapple implements Apple, Mango{

	
	public void methodApple() {
		System.out.println("This is the method from interface Apple");
		
	}

	
	public void methodMango() {
		System.out.println("This is the method from interface Mango");
		
	}
	
	
	
}





