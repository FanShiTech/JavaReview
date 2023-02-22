package package2;
import package1.*;


public class C {
	String defaultMessage = "This is the default."; // no access modifier, can only been seen in the same package
	
	public String publicMessage = "This is the public."; // can be seen as long as in the same project file
	
//	protected String protectedMessage = "This is the protected"; //
	

}
