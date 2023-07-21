package javatutorial;

public class Practice47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor g = new Professor("Biology");
		g.displaySubjects();
		g.abc();

	}

}

class TeacherB {
	protected String subject;

	public TeacherB(String sub) {
		this.subject = sub;
	}

	public void abc() {
		System.out.println("teacher abc");

	}
}


class Professor extends TeacherB {

	String subject = "physics";

	public Professor(String sub) {
		super(sub);
	}

	public void displaySubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}

	public void abc() {
		System.out.println("professor abc");
		super.abc();
	}

}