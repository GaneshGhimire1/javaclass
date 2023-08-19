package javatutorial;

 public class Practice111 {

	
	 
	 
	 
	 
	 public static void main(String[] args) {
	
		//caling the function
		 calculator(2,2);
		 // calling the function
		 Add();
		 	
	 // add
	 AddB(4,5);
	 //add
	 int D = AddG(5,8);
	 System.out.println(D);
	 System.out.println(D+D);
	 System.out.println(D-D);
	 }
	 
	 
	 
public static void calculator(int x,int y) {
System.out.println( x +  y);
	
	}

//writing a function without parameter and no return type
public static void Add() {
System.out.println(5+5);
}
// writing function with parameter but no return type
public static void AddB(int x,int y) {
	System.out.println( x +  y);
}
// with parameter and return type
public static int AddG(int x , int y) {
 return x + y;
 }}

