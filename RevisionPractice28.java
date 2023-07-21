package javatutorial;

public class RevisionPractice28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reptile ganesh = new Reptile();
		System.out.println(ganesh.age);
		System.out.println(ganesh.fullname);
		ganesh.age = 30;
		ganesh.fullname = "ganesh sharma";
		
		
		System.out.println(ganesh.age);
		System.out.println(ganesh.fullname);
		
		
		Reptile2 Bipin  = new Reptile2("Bipin sharma",22);
		Bipin.displayName();
		
	}}


class Reptile{
int age;
String fullname;

	
	public void displayname() {
		System.out.println(this.fullname);
}}

class Reptile2 {

	String fullName;
	int age;

	public Reptile2(String fn, int ag) {
		this.fullName = fn;
		this.age = ag;
	}
	

	public void displayName(){
		System.out.println(this.fullName);
		
		  }
	}







