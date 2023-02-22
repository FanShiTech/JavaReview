
public class Animal {
	
	String movement ;
	int legs ;
	
	
	Animal(String movement, int legs){
		this.movement = movement;
		this.legs = legs;
		
	}
	
	
	public String toString() {
		return this.movement + this.legs;
	}
	
	void speak() {
		System.out.println("the animal speak ");
	}
	

}
