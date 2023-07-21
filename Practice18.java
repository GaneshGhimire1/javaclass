package javatutorial;

public class Practice18 {

	public static void main(String[] args) {
	 
		
		// multidimensional array
		int[][] num = new int[3][3];
		
		num[0][0] = 5;
		num[0][1] = 10;
		num[0][2] = 15;
		
		num[1][0] = 20;
		num[1][1] = 25;
		num[1][2] = 30;
		
		num[2][0] = 35;
		num[2][1] = 40;
		num[2][2] = 45;
		
		System.out.println(num[0][2]);
		System.out.println(num[1][0]);
		System.out.println(num[2][1]);
		
		// program 1
		//for loop 
		
		for (int i = 0; i < num.length; i++) {
			 System.out.println(i);
			 
			 int[]arr = num[i];
			 for (int p = 0; p < arr.length; p++) {
				 System.out.println(p);
		}
		

	}
		
		//Program 2
		int[][]num1 = {
				
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
				
		for (int i = 0; i< num1.length; i++)	{
			int[] arr = num1[i];
			for (int p = 0; p < arr.length; p++) {
				System.out.println(arr[p]);
			}
		}
		
		// Program 3
		// while loop
		
		int p1 = 0;
		while(p1 < num1.length) {
			int arr[] = num1[p1];
			int s = 0;
			while(s < arr.length) {
				System.out.println(arr[s]);
				s = s +1;
			}
			p1++;
		}
		
		
		// program 4 each loop
		 for(int[]row:num1) {
			 for(int col : row) {
				 System.out.println(col);
			 }
		 }
// program 5
		 

}}
