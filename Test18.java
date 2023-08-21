package javatutorial;
interface Hotel3{
public void veg(int x);
public void nonveg(int y);

	
}
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restuarent2 mayuri = new Restuarent2();
		mayuri.veg(1);
		mayuri.nonveg(2);
			
		

		Cafe2 sagarmatha = new Cafe2() ;
		sagarmatha.veg(1);
		sagarmatha.nonveg(2);
	}
	}
		
		
	class Restuarent2 implements Hotel3{
		public void veg(int x){
			System.out.println( "matar paneer is a veg item");
		}
		public void nonveg(int y) {
	System.out.println("chicken tikka is a nonveg item");
		
	}}
	class Cafe2 implements Hotel3{
		
		public void veg(int x) {
			System.out.println("vegan blueberry muffin is a veg item");
			
		}
		public void nonveg(int y) {
			System.out.println("chicken burgar is  nonveg item");
			
	}
		
	}


