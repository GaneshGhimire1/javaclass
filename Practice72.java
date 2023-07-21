package javatutorial;



public class Practice72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		University1 TU = new University1("Kathmandu ","Technology" );
		University1 KU = new University1("pokhara","ARTS");

		University1.College A = TU.new College();
		University1.College B = KU.new College();

		A.faculty();
		B.faculty();
	}

}

class University1 {
	String UniversityName;
	String UniversityBranch;

	public University1(String name, String branch) {
		this.UniversityName = name;
		this.UniversityBranch = branch;
	}

	public void welcome() {
		System.out.println("welcome in university \t".concat(UniversityName));
	}

// inner class

	class College {
		String faculty;

		// Accesing the outer class fields into inner class

		public void faculty() {
			if(University1.this.UniversityBranch.equals( " Technology")) {
				this.faculty = "medical";
				System.out.println(faculty);
			}
			 else if(University1.this.UniversityBranch.equals(" ARTS")) {
				this.faculty = "music";
				System.out.println(faculty);
			}
		}
	}


		
		
		
		
		
		
		
		
		
		
	}


