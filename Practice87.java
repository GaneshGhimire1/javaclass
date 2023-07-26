package javatutorial;

enum Fruits1 {
	apple,mango,banana,orange;
	public String getfruit() {
		switch(this) {
		case apple:
		return "red apple";
		case mango:
			return "delious mango";
		case banana:
			return "green banana";
		case orange:
			return "sour orange";
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
