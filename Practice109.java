package javatutorial;

public class Practice109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1 = new Dog1();

		System.out.println(d1 instanceof Dog1);
		System.out.println(d1 instanceof Animal1);

		Invoice inv = new Invoice("456","ganesh","sharma","123456","Butwal");
		System.out.println(inv instanceof Invoice);
	}

}

class Animal1 {

}

class Dog1 extends Animal1 {



}
class Invoice {

	String billNO ;
	String firstName;
	String lastName;
	String phoneNo ;
	String address;


	public Invoice(String bn , String fn ,String ln ,String phoneNo,String adress) {
		this.billNO = "123";
		this.firstName = "ganesh";
		this.lastName = "ghimire";
		this.phoneNo = "56789";
		this.address = "456";

	}








	}


