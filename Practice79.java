package javatutorial;

public class Practice79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Citrus lemon = new Citrus();
lemon.delicous();
lemon.sweet();
		
	}

}
abstract class Fruits2{
	abstract void sweet();
public void delicous() {
	System.out.println("mango is delicious");
}
	
}
class Citrus extends Fruits2{
	public void sweet() {
		System.out.println("lime is sour in taste");
	}
}