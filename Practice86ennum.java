package javatutorial;


enum Size2 {
	small,medium,large,extralarge;
	public String getSize() {
		switch(this) {
		case small:
		return("order small size pizza");
		case large:
			return("order medium size pizza");
		case medium:
			return("order large size pizza");
		case extralarge:
			return("order extralarge pizza");
		 default:
			return null;
	}
	
	
}




public class Practice86ennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String order = Size2.large.getSize();
		System.out.println(order);
		
		
	}

}}
