package javatutorial;

public class Practice44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parrot a = new Parrot();
a.displaymessage();
		
	}

}
class Bird1{
public void display() {
System.out.println("I am bird");	
	
}
}
class Parrot extends Bird1{
	public void display() {
		System.out.println("I am parrot");
	}

public void displaymessage(){
display();
super.display();
}
}
