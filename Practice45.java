package javatutorial;

public class Practice45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird3 peacock = new Bird3(4);
		peacock.displayAge();
		int p = peacock.updateAge(8);
		System.out.println(p);
		peacock.displaymessage();
	}

}

class Bird3 {
	private int age;

	public Bird3(int ag) {
		this.age = ag;
	}

	// method returning String
	private String displayname() {
		return " I am parrot";
	}

	public void displayAge() {
		System.out.println(this.age);
	}

	// methods returning int
	public int updateAge(int updatedAge) {
		this.age = updatedAge;
		return this.age;

	}

	public void displaymessage() {
		String msg = displayname();
		System.out.println(msg);
	}

	
}