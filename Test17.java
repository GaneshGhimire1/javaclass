package javatutorial;

enum Size5{
	small,medium,large,extralarge;
	
}
class Order5{
Size pizzaSize;
public Order5(Size pizzasize) {
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



public class Test17 {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order5 A = new Order5(Size. small);
		A.orderconfirmation();
	}


	}


