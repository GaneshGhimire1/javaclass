package javatutorial;

public class Practice34 {

	public static void main(String[] args) {
		// single inheritence

		Teacher1 ganesh1 = new Teacher1("ganesh", "ghimire", 23, 5000);
		System.out.println(ganesh1.firstname);
		System.out.println(ganesh1.lastname);
		System.out.println(ganesh1.age);
		System.out.println(ganesh1.salary);
	}

}

class Student3 {
	String firstname;
	String lastname;
	int age;

	public Student3(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;
	}

	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}

}

class Teacher1 extends Student3 {

	int salary;

	public Teacher1(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}

	public void displaysalary() {

	}
	

}