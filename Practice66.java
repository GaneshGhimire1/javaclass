package javatutorial;
interface Hotel2{
public void veg(int x);
public void nonveg(int y);


}

public class Practice66 {
	public static void main(String[] args) {
		
	Restuarent Sunshine = new Restuarent();
	Sunshine.veg(1);
	Sunshine.nonveg(2);
		
	

	Cafe Bluebird = new Cafe() ;
	Bluebird.veg(1);
	Bluebird.nonveg(2);
}
}
	
	
class Restuarent implements Hotel2{
	public void veg(int x){
		System.out.println( "matar paneer is a veg item");
	}
	public void nonveg(int y) {
System.out.println("chicken tikka is a nonveg item");
	
}}
class Cafe implements Hotel2{
	
	public void veg(int x) {
		System.out.println("vegan blueberry muffin is a veg item");
		
	}
	public void nonveg(int y) {
		System.out.println("chicken burgar is  nonveg item");
		
}}