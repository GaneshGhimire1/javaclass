package javatutorial;

public class Practice78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Database7 db6 = Database7.getinstance();
db6.getconnection();
	}

}

class Database7{
	private static Database7 dbobject;
	
	private Database7() {
		
	}
	public static Database7 getinstance() {
		if(dbobject == null) {
			dbobject = new Database7();
		}
		return dbobject;
	}
	public void getconnection() {
	System.out.println("you are connected to database7");
}
}

