package javatutorial;

public class RevisionPractice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String bigcities[][] = {
			{"butwal","bhairahawa"},
			{"gulmi","palpa"},
			{"bharatpur","dang"}
	};

	
	for(int i= 0; i<bigcities.length;i++) {
		String city[]=bigcities[i];
		for(int j = 0;j<city.length;j++ ) {
			System.out.println(city[j]);
		}
	}

	
	// program 2
	int k =0;
	while(k<bigcities.length) {
		String city[] = bigcities[k];
		int k1 = 0;
		while (k1<city.length) {
			System.out.println(city[k1]);
			k1++;
		}
		k++;
	}
	
	
	// for each
	for(String[]a:bigcities) {
		for(String b : a) {
			System.out.println(b);
	}
	}}}

