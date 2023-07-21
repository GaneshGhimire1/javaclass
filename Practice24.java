package javatutorial;

public class Practice24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal anuj = new Animal("anuj ghimire",6);
		Animal ram = new Animal("ram pandey",7);
		
		System.out.println(anuj.name);
		System.out.println(anuj.age);
		
		
		
		System.out.println(ram.name);
		System.out.println(ram.age);
		
		String a = ram.talk();
		System.out.println(a);
		
			
		
	}}
class Animal{
	int age;
	String name;
	
	public Animal(String nm,int ag) {
		this.age = ag;
		this.name = nm;
	}
	
	public String talk() {
	return "wellcome" ;
	
	}
	public void walk() {
		System.out.println("i am walking");
		
		
	}
	
	
	
	
	
	
	
	
	
}