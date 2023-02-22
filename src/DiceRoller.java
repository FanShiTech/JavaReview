import java.util.Random;

public class DiceRoller {
	
	Random random;
	int number; // by changing these two variables to global variables, roll() can have access to them.
	
	DiceRoller(){
		
		random = new Random();
		roll();
		
		
	}
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}
