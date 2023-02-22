import java.util.Scanner;

public class JavaKnowledge_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *     Object Oriented Programming
		 *     
		 *     object ---> an instance of a class that contain attributes and methods. it is a blueprint.
		 *     				attributes are like characteristics, and methods are like actions the object can do
		 *     				ex: coffee cup has color , shape and volumes; they are attributes (characteristics)
		 *     					with a coffee cup, we can drink and spill, those are methods (actions)
		 *     
		 *     Constructor ---> special method that is called when an object is instantiated (created), and we can pass arguments as well
		 *     					
		 *     					
		 *     	
		 * 
		 *    Local variable ---> declared inside a method, visible only in that method
		 *    Global variable ---> declared outside a method, but within a class. visible to all parts of a class 
		 * 
		 *    Overloaded Constructor ---> multiple constructors within a class share the same name, but different parameters
		 *    							name + parameters = signature
		 *    
		 *    
		 *    	
		 *    toString() ---> special method that all objects inherit 
		 *    					returns a string that textually represents an object
		 *    					can be used both implicitly or explicitly
		 *    					use public + the type value you wish to return
		 *    
		 *    
		 *    create array object
		 *    pass object as arguments
		 *
		 * 
		 * 
		 * 	  static keyword ---> The static keyword is a non-access modifier used for methods and attributes. 
		 * 						Static methods/attributes can be accessed without creating an object of a class.
		 * 
		 * 
		 * 	  inheritance ---> In Java, it is possible to inherit attributes and methods from one class to another
		 * 						subclass (child) - the class that inherits from another class
		 *						superclass (parent) - the class being inherited from
		 *
		 *						child classes can not only inherit their parents attributes; in addition, they can develop their own unique attributes.
		 *
		 *
		 *
		 *
		 *    method overriding ---> declaring a method in sub class, which is already presented in parent class. therefore, that child class can give its own implementation.
		 *
		 *
		 *
		 *	  super ---> keyword that refers to the superclass (parent) of an object , similar to the "this" keyword
		 *				 to use super keyword, the child class should inherit all attributes from its parent class, and place them
		 *				 in the construct ( parameters) , and add super(attributes) first. 
		 *
		 *				super can also used in a method
		 *				ex: return super.toString(child class unique attribute) 
		 *
		 *
		 *
		 *
		 *    abstract ---> abstract classes cannot be instantiated, but they can have subclass 
		 *    				abstract methods are declared without an implementation
		 *    
		 *    				The abstract keyword is a non-access modifier, used for classes and methods:
         *
		 *					Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
		 *					Any subclass of an abstract class must either implement all of the abstract methods in the super-class, or be declared abstract itself.
		 *
		 *					Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
		 *					These methods are sometimes referred to as subclasser responsibility because they have no implementation specified in the super-class. Thus, a subclass must override them to provide method definition.
		 *
		 *
		 *	access modifiers ---> are layer of security to our program.
		 *										
		 *						Modifier     Class  Package   Subclass  World
		 *						---------------------------------------------
		 *						public        Y        Y         Y        Y
		 * 						protected     Y        Y         Y        N
		 * 						no modifier   Y        Y         N        N
		 * 						private       Y        N         N        N
		 * 
		 * 
		 * 
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 * */
		
		
		
//		Car myCar = new Car();
		
//		System.out.println(myCar.toString()); // explicitly
//		System.out.println(myCar);  // implicitly
		
//		System.out.println(myCar.model);
//		System.out.println(myCar.make);
//		
//		
//		myCar.drive();
//		myCar.brake();
//		
//		Car myCar2 = new Car();
		
//		Human human1 =  new Human("Justin", 33, 184.00);
//		Human human2 =  new Human("Morty", 17, 50);
//		
//		System.out.println(human1.age);
//		System.out.println(human2.name);
//		
//		human1.eat();
//		human2.drink();
		
		
//		DiceRoller roller = new DiceRoller();
//		
//		Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");
//		
//		System.out.println("Here are the ingredients of your pizza: ");
//		System.out.println(pizza1.bread);
//		System.out.printf("this pizza size is %d",pizza1.size);
		
		
//		int[] numbers = new int[5];
//		String[] strings = new String[5];
//		char[] characters = new char[5];
//		
//		Food[] refriger = new Food[3];  // creare an array object
//		
//		Food food1 = new Food("burger");  
//		Food food2 = new Food("sandwitch");
//		Food food3 = new Food("ice cream");
		
//		refriger[0] = food1;  //// to store the elements , method #1
//		refriger[1] = food2;
//		refriger[2] = food3;
		
//		Food[] refriger2 = {food1, food2, food3} ;// method 2
//		System.out.println(refriger[0].name);
//		System.out.println(refriger2[2].name);
		
//		Garage garage = new Garage(); // sending cars into garagde class --> pass an object as an argument
//		Cars car = new Cars("BMW");
//		Cars car2 = new Cars("Tesla");
//		
//		
//		garage.park(car); // car here is object but it's been sent as an argument
//		garage.park(car2);
				
//		Friend friend1 = new Friend("sponegbob");
//		Friend friend2 = new Friend("Patrick");
//		System.out.println(Friend.numOfFriends); // both friend1 and friend2 share the numOfFriends. because static variable is a copy that can be shared
//		Friend.displayFriends(); 
		
//		Car car = new Car();
//		Bicycle bike = new Bicycle();
//		System.out.println(car.speed);
//		System.out.println(bike.speed);
//		System.out.println(car.doors);
//		System.out.println(bike.pedals);
		
		
		
//		Animal animal = new Animal();
//		Dog dog = new Dog();
//		dog.speak();
//		animal.speak();
		
		
//		Dog dog1 = new Dog("Bill", 4, 2);
//		Dog dog2 = new Dog("Ill", 3, 1);
//		
//		System.out.println(dog2.toString());
//		System.out.println(dog1.toString());
		
		
//		Car car = new Car();
//		car.go();
		
		
		
		
		
	/*
	 * 		Encapsulation ---> attributes of a class will be hidden or private, can be accessed only through methods(getters & setters)
	 * 						
	 *			ex: uses public String getMake(){ return make;} , we can send(retrieve)  private variables to the class that is calling .
	 *					 hence, getters() method and private variables should located in the same class
	 *
	 *			ex: uses public void setYear(int year){ this.year = year; }, you can change the value of the private variable. 
	 *					hence, if you wish to change the private value in the future , use setters() and place the name of method in the constructor
	 *
	 *      Copy objects
	 *      
	 *      file: Car_Encaapsulation & JavaKnowledge_OOP
	 *      
	 *      
	 * */
//		Car_Encaapsulation car1 = new Car_Encaapsulation("Chevrolet", "Camaro", 2020);
//		Car_Encaapsulation car2 = new Car_Encaapsulation("Ford", "Mustang", 1980);
//		
//		System.out.println(car1.getMake());
//		car1.setYear(2022);
//		System.out.println(car1.getYear());
//		
//		// if one wishes to copy car1 to car2. Hence, in other class, you have to create a copy() and arguments are all the attributes , within method, use setters() to change the values
//		car2.copy(car1); // car2 copy everying from car1
//		System.out.println(car1.getMake());
//		System.out.println(car2.getMake());
		
		
		
		/*
		 * 
		 *     Interface ---> a template that cane be applied to a class.
		 *     					similar to inheritance , but specifies what a class has/must do
		 *     					classes can aapply more than one interface, inheritance is limited to 1 super class
		 *     				
		 *     Files: rabbit, Hawk, Fish, interface: prey, predator	
		 *     
		 *     with interface, you can create variables and methods (mthods dont need body)
		 *     in order to implement the interface, the class that wants to use it have to 1) implement 2) override the method
		 *     
		 *     
		 * 
		 * */
		
//		Rabbit rabbit = new Rabbit();
//		rabbit.flee();
//		
//		Hawk hawk = new Hawk();
//		hawk.hunt();
//		
//		Fish fish = new Fish();
//		fish.flee();
//		fish.hunt();
		
		
		/*
		 *  Polymorphism ---> the ability of an object to identify as more than one type
		 *  				it occurs when we have many classes that are related to each other by inheritance
		 *  
		 *  
		 *  Dynamic Polymorphism  ---> a call to an overriden method is to resolve at runtime. 
		 *  
		 *  Static Polymorphism (Compile Time Polymorphism)    Dynamic Polymorphism (Run Time Polymorphism)
		 *  ------------------------------------------------------------------------------------------------ 
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  Files: vehicle_poly , car_poly, bicycle_poly, boat_poly
		 *  		Animal_dpoly, dog_dploy, cat_dploy
		 * */
		
		
//		Car_poly car = new Car_poly();
//		Bicycle_poly bicycle = new Bicycle_poly();
//		Boat_poly boat = new Boat_poly();
//		
//		
//		Vehicle[]  racers = {car, bicycle, boat}; //use array to group these objs, because objs are extended vehicle, vehicle is something they all identified
//		
//		for(Vehicle x: racers) {
//			x.go();
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		
//		Animal_dpoly animal; // animal is preant class, but now i dont know if i want to use dog or cat class
//		
//		
//		System.out.println("what animal do you want ? ");
//		System.out.println("(1=dog  or 2=cat)");
//		int choice = scanner.nextInt();
//		
//		if (choice == 1) {
//			animal = new Dog_dpoly();
//			animal.speak();
//			
//		}
//		else if (choice == 2) {
//			animal = new Cat_dpoly();
//			animal.speak();
//		}
//		else {
//			animal = new Animal_dpoly();
//			System.out.println("the choice was invalid");
//			animal.speak();
//		}

		
		/*
		 *    Exception ---> an event that occurs during the execution of a program that can disrupt the normal flow of instructions
		 *    
		 *     
		 *     try{
		 *     
		 *     			To do
		 *     }
		 *     catch(ArithmeticException e){  // there are many catch
		 *     		sysout
		 *     
		 *     }
		 *     catch(InputMismatchException e ){
		 *     	sysout
		 *     }
		 *     catch(Exception e) {// this exception can almsot catch all kinda errors
		 *   		sysout
		 * 		}
		 * 		finally{
		 * 			//The finally block in java is used to put important codes such as clean up code e.g. 
		 * 			closing the file or closing the connection.  EX: scanner.close()
		 * 			The finally block executes whether exception rise or not and whether exception handled or not. 
		 * 			A finally contains all the crucial statements regardless of the exception occurs or not.
		 * 		}
		 * 		
		 * */
		
		
		
		
		
		
		
		
		
		
		
	} // end of main()

}//end of class()
