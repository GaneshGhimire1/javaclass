package javatutorial;

public class Practice33 {

	public static void main(String[] args) {
		
Student2 ganesh = new Student2();
System.out.println(ganesh.firstname);
System.out.println(ganesh.lastname);
System.out.println(ganesh.age);	

ganesh.age = 30;
ganesh.firstname = "ganesh";
ganesh.lastname = "ghimire";

System.out.println(ganesh.firstname);
System.out.println(ganesh.lastname);
System.out.println(ganesh.age);		

ganesh.displayname();
		
	}

}
class Student2{
	String firstname;
	String lastname;
	int age;
	
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
		}
	}


class TeacherA extends Student2{
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}



