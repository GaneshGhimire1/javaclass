package javatutorial;

public class Practice26 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		int[] number = new int[5];
		number[0]= 5;
		number[1] = 10;
		System.out.println(number[0]);
		
		
		
		int[]number1 = {5,10,15};
		
		System.out.println(number1[1]);
		
		String[] cities = new String[2];
		cities[0]="Butwal";
		cities[1]= "palpa";
		System.out.println(cities[1]);
		
		
		//for loop
		
		int []marks = {5,10,15};
		
		for (int m =0;m<marks.length;m++) {
			System.out.println(marks[m]);
		}
			//reverse 
		
				for (int p1 = marks.length-1; p1>=0;p1--) {
					System.out.println(marks[p1]);}
		//while loop
			 int  p2 = 0;
		while (p2<marks.length) {
			System.out.println(marks[p2]);
		p2++;
		}
		
		//reverse
		
		int p3 = marks.length-1;
		while(p3 >= 0); {
		
		System.out.println(marks[p3]);
		
		p3--;
		}
		// each loop
		
		String names []= {"butwal","palpa"} ;
		int[]marks2 = {2,4,6};
		
		for (String b : names) {
		System.out.println(b);
		}
		for (int c : marks2) {
		System.out.println(c);
		
		// multidimensional array
		int [][]number4 = new int[2][2];
		number4[0][0]= 5;
		number4[0][1]=10;
		number4[0][2]=15;
		
		number4[1][0]=10;
		number4[1][1]=10;
		number4[1][2]=10;
		System.out.println(number4[0][2]);		
			
		
		// loop 
		for(int i = 0; i<number4.length; i++) {
			System.out.println(i);
			
			int[]arr = number4[i];
			for(int b = 0;b<arr.length;b++) {
				System.out.println(b);
			}
			
			
			
					}
					
		}
		}
		
		
		
	
		}
	
		
	
	
