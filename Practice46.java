package javatutorial;

public class Practice46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 A = new Human1(105);
		System.out.println(A.SSN);

		Student1 b = new Student1(456);
		b.displaySSN();
	}

}

class Human1 {
	protected int SSN;

	public Human1(int ssn) {
		this.SSN = ssn;
	}
}

class Student1 extends Human1 {
	public Student1(int ssn) {
		super(ssn);
	}

	public void displaySSN() {
		System.out.println(this.SSN);
	}
}

