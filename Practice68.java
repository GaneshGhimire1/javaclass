package javatutorial;

interface Three{
  public void methodThree();
  
}
interface Four{
  public void methodFour();
}

interface Five{
  public void methodFive();
}

public class Practice68 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Seven ObjSeven = new Seven();
    ObjSeven.SixA();
    ObjSeven.SixB();
    ObjSeven.methodFour();
    ObjSeven.methodThree();
    ObjSeven.methodFive();
  }

}
class Six{
public void SixA() {
  System.out.println("This is first method for class six");
}

public void SixB() {
  System.out.println("This is second method for class six");
}



}

class Seven extends Six implements Three, Four ,Five{


public void methodFour() {
  System.out.println("This is the method from interface four");
  
}


public void methodThree() {
  System.out.println("This is the method from interface three");
  
}
public void methodFive() {
	  System.out.println("This is the method from interface five");


}}

