package javatutorial;

public class Practice37 {

	public static void main(String[] args) {
	CalculatorA a = new CalculatorA(); 
	a.Addition(4, 5);
	a.Addition(3, 4,5);
	a.Addition(3, 4,5,6);

}
}
class CalculatorA{
	public void Addition(int x, int y) {
		System.out.println(x+y);
		
	}
	public void Addition(int x, int y,int z) {
		System.out.println(x+y+z);
}
	
	public void Addition(int x, int y,int z,int a) {
		System.out.println(x+y+z+a);}
}
