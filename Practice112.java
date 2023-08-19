package javatutorial;

class MyException extends Exception {
	public MyException(String s) {
		// call constructor of parent Exception
		super(s);
	}
}

class InvalidMobileNumber extends Exception {
	public InvalidMobileNumber(String s) {
		// call constructor of parent Exception
		super(s);
	}
}

// A class that uses above MyException
public class Practice112 {

	// Driver Program

	public static void main(String[] args) {

		try {
			String password = "abcdefgh";
			if (password.length() <= 7) {
				throw new MyException("password length is small");
			}
			String mobile = "abcdefghi";
			if (mobile.length() <= 10) {
				throw new InvalidMobileNumber("please enter correct mobile number");
			}

			System.out.println("user registered");
		} catch (Exception e) {
			System.out.println("function called");
			System.out.println("caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
