package javatutorial;

interface Wholeseller {
	public void sold(int x);

	public void stock(int y);

}

public class Practice67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RetailerA Shyam = new RetailerA();
		Shyam.sold(0);
		Shyam.stock(0);

		Local Ram = new Local();
		Ram.sold(0);
		Ram.stock(0);

	}

}

class RetailerA implements Wholeseller {
	public void sold(int x) {
		System.out.println("I am selling vegetable from ReatailerA");
	}

	public void stock(int y) {
		System.out.println("I have lot of stock vegetable from ReatailerA");
	}
}
	class Local implements Wholeseller {
		public void sold(int x) {
			System.out.println("I am selling vegetable from local market");
		}

		public void stock(int y) {
			System.out.println("I have lot of stock vegetable from local");
		}
	}
