package javatutorial;

import java.util.Map;

interface Course{
	public void courseOne();
	public void courseTwo();
	public void courseThree();
	public void courseFour();
}

class Zorba implements Course{
	public void courseOne() {
		System.out.println("Zorba one");
	}
	
	public void courseTwo() {
		System.out.println("Zorba Two");
		
	}
	public void courseThree() {
		System.out.println("Zorba Three");
	}
	public void courseFour() {
		System.out.println("Zorba Four");
	
	
}
	
	
	}

class Ganesh implements Course {
	
	
	@Override
	public void courseOne() {
		// TODO Auto-generated method stub
	System.out.println("one");	
	}
	@Override
	public void courseTwo() {
		// TODO Auto-generated method stub
		System.out.println("Two");	
	}
	@Override
	public void courseThree() {
		// TODO Auto-generated method stub
		System.out.println("Three");	
	}
	@Override
	public void courseFour() {
		// TODO Auto-generated method stub
		System.out.println("Four");	
	}
	
	}

public class Practice98map {

	public static void main(String[] args) {
	
		Course firm;
		firm = new Zorba();
		firm.courseOne();
		
		firm = new Ganesh();
		firm.courseTwo();
	}

}
