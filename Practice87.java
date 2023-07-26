package javatutorial;

enum Fruits1 {
	apple,mango,banana,orange;
	public String getfruit() {
		switch(this) {
		case apple:
		return "red apple";
		case mango:
			return "red apple";
		case banana:
			return "red apple";
		case orange:
			return "red apple";
			default: 
				return null;
			
		}
	}
	
}

public class Practice87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String order = Fruits1.apple.getfruit();
		System.out.println(order);
	}

}
