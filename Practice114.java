package javatutorial;
import java.io.FileWriter;
import java.io.IOException;
public class Practice114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "example.txt";
		try {
			FileWriter writer = new FileWriter(fileName);
		writer.write("Namaste");
		writer.write("I am learning javascript");
		writer.write("I am learning sql");
		writer.write("I am learning git");
		writer.close();
		System.out.println("we are still learning");
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		
		
		
		}
		
		
		
	}

}
