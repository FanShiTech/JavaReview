
public class Dog extends Animal{
	
	int ears;
	
	Dog(String movement, int legs, int ears){
		super(movement, legs);
		this.ears = ears;

	}
	
	public String toString() {
		return super.toString()+this.ears;
	}
	
	
	@Override
	void speak() {
		System.out.println("the dog goes *bark* ");
	}

}
