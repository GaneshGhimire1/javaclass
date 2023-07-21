package javatutorial;

public class Practice40 {

	public static void main(String[] args) {
		// overloading - same class , same methodName , different signature
		
			CalculatorB b = new CalculatorB(); 
			b.Substraction(5, 4);
			b.Substraction(10, 6,5);
			b.Substraction(15, 10,6,5);

		}
		}
		class CalculatorB{
			public void Substraction(int x, int y) {
				System.out.println(x-y);
				
			}
			public void Substraction(int x, int y,int z) {
				System.out.println(x-y-z);
		}
			
			public void Substraction(int x, int y,int z,int a) {
				System.out.println(x-y-z-a);}
		}
	
	
		


