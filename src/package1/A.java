package package1;
import package2.*;


public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C c = new C();
//		System.out.println(c.defaultMessage); // not visible. 
//		System.out.println(c.publicMessage); // visible . with public modifier , it can be accessed as long as they are located in the same project file

//		protected String protectedMessage = "This is protected";
		
		B b = new B();
		System.out.println(b.privateMessage); // not visible
	
	}
	

}
