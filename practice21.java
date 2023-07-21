package javatutorial;

public class practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Human2 Ganesh = new Human2("Ganesh Sharma",36);
			Human2 Shyam = new Human2("Shyam Pandey",30);
			
			System.out.println(Ganesh.age);
			System.out.println(Ganesh.name);

			System.out.println(Shyam.age);
			System.out.println(Shyam.name);

			String a = Ganesh.eat();
			System.out.println(a);
			
			
		}
	}

	class Human2 {
		int age;
		String name;

		public Human2(String nm, int ag) {
			this.name = nm;
			this.age = ag;
		}

		public String eat() {
			return "yum yum";
		}

		public void	sing() {
				System.out.println("I am singing");
			}


		}
	
	
	
	
	

	


