package javatutorial;



// innerclass

public class Practice72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				University3 TU = new University3("Kathmandu ", "Technology");
				University3 KU = new University3("pokhara", "ARTS");

				University3.College A = TU.new College();
				University3.College B = KU.new College();

				A.faculty();
				B.faculty();
			}

		}

		class University3 {
			String UniversityName;
			String UniversityBranch;

			public University3(String name, String branch) {
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
					if (University3.this.UniversityBranch.equals("Technology")) {
						this.faculty = "medical";
						System.out.println(this.faculty);
					} else if (University3.this.UniversityBranch.equals("ARTS")) {

						this.faculty = "music";
						System.out.println(this.faculty);
					}
				}
			}
		}
