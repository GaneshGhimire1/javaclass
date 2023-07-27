package javatutorial;

enum Size3{
	small,medium,large,extralarge;
	
}
class Order2{
Size pizzaSize;
public Order2(Size pizzasize) {
	this.pizzaSize = pizzasize;
}
	public void orderconfirmation() {
		switch(pizzaSize) {
		case small:
			System.out.println("you ordered small size pizza");
			break;
		case medium:
			System.out.println("you ordered small size pizza");
			break;
		case large:
			System.out.println("you ordered small size pizza");
			break;
		case extralarge:
			System.out.println("you ordered small size pizza");
			break;	
			
	}

	
}
	
}





public class Practice89ennumnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order2 A = new Order2(Size. small);
		A.orderconfirmation();
	}

}
