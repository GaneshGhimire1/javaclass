package javatutorial;



	class C{
		public void WelcomeC() {
			System.out.println("Namaste");
			
		}
	}
	
	
	class D{
		public void WelcomeD() {
			System.out.println("hello");
		}
	}
	
	//only one class can be inherited in the child class
	class E extends C{
		
	}
	
	public class Practice63 {
	
	public static void main(String[] args) {
		E ramesh = new E();
		ramesh.WelcomeC();

	}

}
