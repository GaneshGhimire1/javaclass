package javatutorial;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// comparision operator boolean
		
		// <  --  less than 
				// >  --  greater than 
				// <= --  less than or equal to
				// >= --  greater than or equal to
				// != --  not equal 
				// == --  equal 
		
		
		System.out.println(15 < 3);
		System.out.println(6 > 3);
		System.out.println(6 >= 3);
		System.out.println(6<=3);
		System.out.println(6!=3);
		System.out.println(3 != 3);
		System.out.println(5 == 3);
		
		
		
		// logical operator
		
		// AND  ---  &&
		
				// true    &&     true  -------> true
				// false   &&     true  -------> false
				// true    &&     false -------> false 
				// false   &&     false -------> false
		
		
		System.out.println(9 == 4 && 8 == 2);
		System.out.println(9 != 9 && 8 == 2);
		System.out.println(9 == 9 && 9 == 9);
		System.out.println(8 != 4 && 2 == 2);
		
		
		//or operator ---||
		
		// true    ||     true  -------> true
		// false   ||     true  -------> true
		// true    ||     false -------> true
		// false   ||     false -------> false
		
		
		System.out.println(9 == 3 || 8 == 2);
		System.out.println(7 == 4 || 9 == 2);
		System.out.println(8 == 4 || 8 == 2);
		System.out.println(9 == 9 || 8 == 8);
		
		
		
		//Not --- !
		
		 // true  ---- false
		 // false ---- true
		
		 System.out.println(!(10 == 8));
		 System.out.println(!(6 == 6));
		
		
		
	}

}
