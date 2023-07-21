package javatutorial;

public class Practice69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University TU = new University("Kathmandu ", "Technology");
		University KU = new University("pokhara", "ARTS");

		University.College A = TU.new College();
		University.College B = KU.new College();

		A.faculty();
		B.faculty();
	}

}

class University {
	String UniversityName;
	String UniversityBranch;

	public University(String name, String branch) {
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
			if (University.this.UniversityBranch.equals("Technology")) {
				this.faculty = "medical";
				System.out.println(this.faculty);
			} else if (University.this.UniversityBranch.equals("ARTS")) {

				this.faculty = "music";
				System.out.println(this.faculty);
			}
		}
	}
}
