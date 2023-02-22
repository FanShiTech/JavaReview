
public class Human {
	
	String name;
	int age;
	double weight;

	Human(String name, int age, double weight){  // construct
		this.name = name;  // this represents human instance that we created in main()
		this.age = age;
		this.weight = weight;
		
		
		
	}
	
	void eat() {
		System.out.println(this.name + " is eating.");
	}
	
	void drink() {
		System.out.println(this.name + "is drinking");
	}
}
