
public class Fish implements Prey, Predator{
	
	@Override
	public void hunt() {
		System.out.println("fish is hunting other fish");
	}
	
	
	
	public void flee() {
		System.out.println("fish is running away");
	}

}
