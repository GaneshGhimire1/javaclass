package javatutorial;

public class Practice60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]number = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
};
for (int p = 0;p<number.length;p++) {
	System.out.println(p);
	int []arr = number[p];
	for(int j = 0;j<number.length;j++) {
		System.out.println(arr[j]);
	}
}
int p1 = 0;
while(p1<number.length) {
	int[]arr = number[p1];
	int p2 = 0;
	while(p2<number.length) {
		System.out.println(arr[p2]);
		p2++;
		
	}
	p1++;
}
//for each
for (int[] a : number) {
	for (int b: a) {
		System.out.println(b);
	}
}}}


	