package javatutorial;

public class Practice28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//program 1

	Person[]students = {new Person("ganesh","Sharma",34),
		new Person("ram","pandey",33),new Person("anuj","chetri",25)
		};

//for loop 
	for (int i = 0; i < students.length; i++) {
		students[i].displayName();
	}
//while
	int t1=0;
	while(t1<students.length) {
		students[t1].displayName();
		t1++;
	}

	
// for each
	for(Person student : students) {
		student.displayName();
	}


	
	// program 2
			Calculator Feb = new Calculator();
			Feb.addition(4,5);
			Feb.addition(4,5, 6);
			Feb.addition(4,5,6,7);
		
	}
}




	class Person{
		String firstName;
		String lastName;
		int age;
		
		public Person(String fn, String ln, int ag) {
			this.firstName = fn;
			this.lastName = ln;
			this.age = ag;
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}}
	
	
	class Calculator{
		
	
		public void addition(int x,int y) {
			System.out.print(x +y);
		}public void addition(int x,int y,int z) {
			System.out.print(x +y + z);
		}
		public void addition(int x,int y,int z, int b) {
			System.out.print(x +y + z + b);
	}
	
}
	
	
	
	
	
	
	