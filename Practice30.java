package javatutorial;

public class Practice30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
owner Anuj = new owner();
System.out.println(Anuj.firstname);
System.out.println(Anuj.lastname);		
System.out.println(Anuj.id);
Anuj.fullname();



employee Anuj1 = new employee();
System.out.println(Anuj1.salary);
System.out.println(Anuj1.firstname);
System.out.println(Anuj1.lastname);
System.out.println(Anuj1.id);

Anuj1.displaysalary();
Anuj.fullname();

	}

}

class owner{
	String firstname = "ganesh";
	String lastname ="sharma";
	int id = 123;
	
	public void fullname() {
		System.out.println(this.firstname = this.lastname);
	}
}
class employee extends owner{
	int salary = 2000;
	public void displaysalary() {
		System.out.println(this.salary);
	}
}
