package javatutorial;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database5 db6 = Database5.getinstance();
		db6.getconnection();
			}

		}

		class Database5{
			private static Database5 dbobject;
			
			private Database5() {
				
			}
			public static Database5 getinstance() {
				if(dbobject == null) {
					dbobject = new Database5();
				}
				return dbobject;
			}
			public void getconnection() {
			System.out.println("you are connected to database7");
		}
		}

	


