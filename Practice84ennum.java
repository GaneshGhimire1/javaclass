package javatutorial;

enum Size {
	small, medium, large, extralarge;
}

class Order {
	Size pizzaSize;

	public Order(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void orderConfirmation() {

		switch (pizzaSize) {
		case small:
			System.out.println("you ordered a small size pizza");
			break;
		case medium:
			System.out.println("you ordered a medium size pizza");
			break;
		case large:
			System.out.println("you ordered a large pizza");
			break;
		case extralarge:
			System.out.println("you ordered a extralarge size pizza");
			break;

		}
	}
}

public class Practice84ennum {

	public static void main(String[] args) {

		Order A = new Order(Size.small);
		A.orderConfirmation();
	}

}
