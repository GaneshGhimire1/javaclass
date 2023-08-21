package javatutorial;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int [][] marks = {
			{2,3,4},
			{5,6,7},
			{8,9,10}
	};
	
	for(int i= 0;i<marks.length;i++) {
		int[]arry = marks[i];
		for(int j = 0;j<arry.length;j++) {
			System.out.println(arry[j]);
		}
	}
	int k = 0;
	while(k < marks.length) {
		int [] arry = marks[k];
		int l = 0;
		while(l<arry.length) {
			System.out.println(arry[l]);
			l++;
		}
		k++;
		
			
	}
	
	//for each
	for(int []a: marks) {
		for(int b:a) {
			System.out.println(b);
		}
	}
	}
	}
	


