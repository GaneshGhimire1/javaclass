package javatutorial;

public class Practice70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mall concord = new Mall();
		System.out.println(concord.stallnumber);
		int stallnumberC = concord.displaystallnumber();
		System.out.println(stallnumberC);

		Mall.Restuarent veg = concord.new Restuarent();
		Mall.Restuarent nonveg = concord.new Restuarent();

		System.out.println(veg.name);
		System.out.println(nonveg.foodquality());
	}

}

class Mall {

	int stallnumber = 102;

	class Restuarent {
		String name = "subway";

		public String foodquality() {
			return "good";
		}
	}

	public int displaystallnumber() {
		return this.stallnumber;
	}
}
