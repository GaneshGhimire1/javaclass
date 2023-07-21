package javatutorial;

public class Practice31 {

	public static void main(String[] args) {
		
Owner1 sunil = new Owner1("sunil","pandey",234);
System.out.println(sunil.firstname);
System.out.println(sunil.lastname);
System.out.println(sunil.ssn);
sunil.displayname();


Employee1 sunilA = new Employee1("sunilA","pandeyee",234,4000);
System.out.println(sunilA.firstname);
System.out.println(sunilA.lastname);
System.out.println(sunilA.ssn);
System.out.println(sunilA.salary);


sunilA.displayname();
sunilA.displaysalary();
	}

}

class Owner1 {
	String firstname;
	String lastname;
	int ssn;
	
	public Owner1(String fn, String ln, int ss) {
		this.firstname = fn;
		this.lastname = ln;
		this.ssn = ss;
		
		
	}
	public void displayname() {
		System.out.println(this.firstname +this.lastname);
	}
	
}
class Employee1 extends Owner1{
	int salary;
	
	public Employee1(String fn, String ln, int ss,int sal) {
		super(fn,ln,ss);
		this.salary = sal;
	}
	public void displaysalary() {
		System.out.println(this.salary);
	}
	
}