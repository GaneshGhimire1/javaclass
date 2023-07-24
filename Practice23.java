package javatutorial;

public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Bird2 Ram = new Bird2("Ram Pandey", 4);
	Bird2 Gopal = new Bird2("Gopal Sharma", 5);
	
	System.out.println(Ram.name);
	System.out.println(Ram.age);
	
	System.out.println(Gopal.name);
	System.out.println(Gopal.age );
	
	String a = Ram.eat();
	System.out.println(a);
		
		
		
	}

}
class Bird2{
	int age;
	String name;
	
	public Bird2(String nm, int ag) {
		this. name = nm;
		this.age = ag;
	}
	public String eat() {
		return "well done";
		
	}
	public void sing() {
		System.out.println("I am singing");
	}
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
