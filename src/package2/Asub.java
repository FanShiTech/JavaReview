package package2;
import package1.*;

public class Asub extends A{
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		C c = new C();
//		System.out.println(c.defaultMessage); // visible becuase they are in the same package
//
//	}
	
	
	public static void main(String[] args) {
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage); //can assess it even it's in the different package, only printout is the subclass to where it's created 
	}

}
