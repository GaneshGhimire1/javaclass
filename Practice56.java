package javatutorial;

public class Practice56 {

	public static void main(String[] args) {
		Snake cobra = new Snake();
		cobra.swim();
		cobra.respire();
	}

}

abstract class Reptiles {
	abstract void swim();

	public void respire() {
		System.out.println("I can respire");

	}
}

class Snake extends Reptiles {
	public void swim() {
		System.out.println("cobra can swim");
	}
}