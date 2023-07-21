package javatutorial;

public class Test5 {

	public static void main(String[] args) {
		
		Human4 Ram = new Human4("Ram Pandey",22);
	System.out.println(Ram.name);
	System.out.println(Ram.age);
	
	String a = Ram.eat();
	System.out.println(a);
	}

}
class Human4 {
	String name;
	int age;
	public Human4(String nm,int ag) {
		this.name = nm;
		this.age = ag;
	}
	public String eat() {
		return "Delicious";
		
		
}
	public void run() {
		System.out.println("I am running");
	}
	
}