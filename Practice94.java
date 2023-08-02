package javatutorial;

public class Practice94 {

	enum Size3 {
		small, medium, large, extralarge;

		public String getSize() {
			switch (this) {
			case small:
				return ("order small size pizza");
			case medium:
				return ("order medium size pizza");
			case large:
				return ("order large size pizza");
			case extralarge:
				return ("order extra large size pizza");
			default:
				return null;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String order = Size3.large.getSize();
		System.out.println(order);
	}

}
