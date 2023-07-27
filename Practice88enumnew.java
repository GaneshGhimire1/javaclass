package javatutorial;



enum Size4{
	small,medium, large,extralarge;
	public String getsize() {
		
		switch (this) {
		case small:
			return ("ordered small size pizza");
		case medium:
			return ("ordered small medium pizza");
		case large:
			return ("ordered small large pizza");
			default:
				return null;
		}
	}
}

public class Practice88enumnew {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String order = Size4.small.getsize();
System.out.println(order);

	}}


