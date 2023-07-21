package javatutorial;

public class Practice55 {

	public static void main(String[] args) {
		motel Himalaya = new motel(20);
		System.out.println(Himalaya.room);
		Himalaya.doorkey();

	}

}

abstract class Hotel{
	int room;
	
	public Hotel(int rm) {
		this.room = rm;
	}
	
	abstract public void doorkey();
	
	
}
class motel extends Hotel{
	public motel(int rm) {
		super ( rm);
		
	}
	public void doorkey() {
		System.out.println("good  room for motel");
	}
}