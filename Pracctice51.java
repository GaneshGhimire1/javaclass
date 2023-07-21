package javatutorial;

public class Pracctice51 {

	public static void main(String[] args) {
		
		
		// whole package(overloading, overriding,inheritence,private, protected)
		
		
		Home a = new Home("white", "Townhouse", 123);
		System.out.println(a.color);
		System.out.println(a.model);
		// System.out.println(a.keyno); private
		// calling out method

		a.displaycolor();
		a.displaykeynoandModel();

		// creating a instance of childclass
		Apartment Skybrook = new Apartment("white", "Townhouse", 123, "skybrook");
		System.out.println(Skybrook.color);
		System.out.println(Skybrook.model);
		System.out.println(Skybrook.name);

		Skybrook.displaykeynoandModel();
		Skybrook.displaycolor();

		// overloading

		Skybrook.handoverDate(2023);
		Skybrook.handoverDate(2023, "Apr");
		Skybrook.handoverDate(2023, "Apr", 15);

		// calling out parent method
		Skybrook.welcomeMsg();

		int bedrooms = Skybrook.displaynoofbedrooms();
		System.out.println(bedrooms);

	}

}

class Home {
	String color;
	String model;
	private int keyno;

	public Home(String cl, String mo, int Kn) {
		this.color = cl;
		this.model = mo;
		this.keyno = Kn;
	}

	public void displaycolor() {
		System.out.println(this.color);

	}

	public void displaykeynoandModel() {
		System.out.println(this.keyno);
		this.displayModelno();

	}

	private void displayModelno() {
		System.out.println(this.model);
	}

	public void welcomeMsg() {
		System.out.println("welcome  home");
	}

	protected void welcomeMsg2() {
		System.out.println("Welcome home msg2 ");
	}
}

class Apartment extends Home {
	String name;

	private int bedroom = 4;

	public Apartment(String cl, String mo, int Kn, String nm) {
		super(cl, mo, Kn);
		this.name = nm;

	}
// overloading
// same class ,same method name, different signature

	public void handoverDate(int year) {
		System.out.println(year);
	}

	public void handoverDate(int year, String month) {
		System.out.println(year);
		System.out.println(month);

	}

	public void handoverDate(int year, String month, int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);

	}

	public int displaynoofbedrooms() {
		return this.bedroom;
	}

// override
	public void welcomeMsg() {
		System.out.println("welcome home from Skybrook");
		super.welcomeMsg();
		this.welcomeMsg2();
	}
}