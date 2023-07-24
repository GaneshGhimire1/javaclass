package javatutorial;

public class Practice74 {

	/// singleton
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database db5 = Database.getInstance();
		db5.getConnection();

		   
		    

		  }

		}

		class Database {
		  
		  private static Database dbobject ;

		  private Database() {
		  }

		  public static Database getInstance() {
		    if (dbobject == null) {
		      dbobject = new Database();
		    }

		    // returns you singleton object
		    return dbobject;
		  }

		  public void getConnection() {
		    System.out.println("you are connected to database");
		  }
		}
		
		
		
