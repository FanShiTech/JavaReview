import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class JavaKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * difference between print() and println()
		 * 
		 * */
		
//		System.out.print("Hello world, ");
//		
//		System.out.print("I am back to \n");
//		System.out.print("Java");
//		System.out.println();
//		
		/*
		 * Variables
		 *  8 types
		 *  
		 *  type         size(bit/byte)        primitive/reference       value
		 *  boolean        1 bit                 p                        true/false
		 *  byte           1 byte                p                        -128 --- 127
		 *  short          2 bytes               p                        -32768 --- 32767
		 *  int            4 bytes               p                        -2 billion --- 2 billion
		 *  long           8 bytes               p                        -9 quintillion --- 9 quintillion
		 *  float          4 bytes               p                        fractional , up to 6 - 7 digits
		 *  double         8 bytes               p                         .........,  ..... 15 digits
		 *  char           2 bytes               p                         
		 *  string         unlimited             r               
		 * 
		 * */
		
		
//		/*
//		 *   Declaration + assignment = initialization
//		 * */
//		
//		//int x = 123;
//		
//		//System.out.println("x is: " + x);
		
		/*
		 * Input
		 * 
		 * 
		 * import scanner
		 * pay attention on what kinda type of input you wish to use
		 * once you entered enter key, the scanner'd read entire line includes  \n , but nextInt() will not read \n, so 
		 * if there is another nextLine(), the scanner'd notice there is \n left behind , and read it
		 * 
		 *                                    nextLine() vs next()
		 *    nextLine() ---- can take input until the line change or new line and ends input of getting ‘\n’ or press enter. 
		 *    next() --- can read the input only until a space(” “) is encountered
		 * 
		 * */
//		//Scanner scanner = new Scanner(System.in);
//		
//		//System.out.println("what is your name? ");
//		//String name = scanner.nextLine();
//		
//		//System.out.println("How old are you ?");
//		//int age = scanner.nextInt();
//		
//		// here 
//		//scanner.nextLine();
//		
//		//System.out.println("What is your faviorite food? ");
//		//String food = scanner.nextLine();
//		//System.out.print("Hello "+ name + " Your age is: "+ age + "\nYour faviorite foods is "+ food);
		
		
		/*
		 *  Operators
		 *   +
		 *   -
		 *   *
		 *   /
		 *   %
		 *   ++
		 *   --
		 *   
		 *   
		 *   
		 *   Logical Operators
		 *   && 
		 *   ||
		 *   ! --- NOT, rerverse boolean value of condition
		 *   
		 *   
		 *   
		 *   
		 *   Math class
		 *   	Math.sqrt(), Math.max, Math.round(), Math.ceil(), Math.floor()
		 *   
		 *   Generate random numbers
		 *   	limit your values
		 *   
		 *   
		 *   
		 *   
		 * */
		
//		double x ;
//		double y;
//		double z;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter side x: ");
//		x = scanner.nextDouble();
//		System.out.println("Enter side y: ");
//		y = scanner.nextDouble();
//		
//		z = Math.sqrt((x*x)+(y*y));
//		System.out.println("The hypotenuse is " + Math.round(z));
//		System.out.printf("Value with 3 digits after decimal point %.3f %n", z);
//		scanner.close();
//		
//		Random random = new Random();
//		
//		int a = random.nextInt(6); // generate number 1-5
//		System.out.println("random number is "+ a);
		
		/*
		 *  If statement 
		 * 
		 * 
		 * 
		 * */
			
//		int age = 79;
//		
//		if (age >= 18 &&  age < 60) {
//			System.out.println("You are an adult. ");
//		}
//		else if (age >= 60) {
//			System.out.println("You are a senior ");
//		}
//		else {
//			System.out.println("Go home. ");
//		}
		
		
		/*
		 * Switch statement
		 * 
		 * */
		
//		String day = "Friday";
//		switch(day) {
//			case "Sundy": System.out.println("Today is sunday !");
//			break;
//			case "Monday": System.out.println("Today is monday !");
//			break;
//			case "Tuesday": System.out.println("Today is tuesday !");
//			break;
//			case "Wednesday": System.out.println("Today is wednesday !");
//			break;
//			default: System.out.println("N/A");
//		}
		
		
		/*
		 * While Statement
		 * 
		 *  while(){}
		 *  do{}while()
		 * */
		
//		Scanner scanner = new Scanner(System.in);
//		String name = "";
//	
//		
//		while (name.isBlank()) {
//			System.out.print("Enter your name: ");
//			name = scanner.nextLine();
//			
//		}
//		System.out.println("Hello "+ name);
		
	
		/*
		 * for loop
		 * unlike python, java will continue till the limit you assigned.
		 * 
		 * nestloop
		 * 
		 * */
		
//		for(int index = 0; index <= 10; index++) {
//			System.out.println("index is "+ index);
//		}
//		for (int i = 10; i >= 0; i--) {
//			System.out.println("Countdown : "+ i);
//		}
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		int rows;
//		int cols;
//		String symbol = "";
//		System.out.println("Enter your rows");
//		rows = scanner.nextInt();
//		System.out.println("Enter your columns");
//		cols = scanner.nextInt();
//		System.out.println("Enter the symbol");
//		symbol = scanner.next();
//		
//		for (int i = 1; i<=rows; i++) {
//			System.out.println();
//			for (int j = 1; j<=cols; j++) {
//				System.out.print(symbol);
//			}
//			
//		}
		
		/*
		 *  Array
		 *    In Java, array is an object of a dynamically generated class. 
		 *    Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces.
		 *    We can store primitive values or objects in an array in Java.
		 *    
		 *    make sure what type of value you wanna store
		 *  
		 * */
		
//		String[] cars = {"Toyota","BMW","Tesla"};
//		System.out.println(cars[0]);
//		cars[0] = "Audi";
//		System.out.println(cars[0]);
////		System.out.println(cars[4]);
//		
//		String[][] brands = {
//							{"camaro", "corvette", "silverado"}, 
//							{"mustang", "rander", "f-150"}, 
//							{"ferrari", "lambo", "tesla" } 
//							};
//		
//		for (int i =0; i<brands.length;i++) {
//			System.out.println();
//			for(int j=0; j<brands[i].length; j++) {
//				System.out.print(brands[i][j]+" ");
//			}
//		}
		/*
		 *   Some String methods
		 *   
		 *   equals("x") --- return True or False
		 *   length()
		 *   charAt(0) --- return single char 
		 *   indexOf("x") --- return index number
		 *   isEmpty() --- return True or False
		 *   toUpperCase()
		 *   toLowerCase()
		 *   trim() --- remove empty space before and after
		 *   replace( old character, new character)
		 *   
		 * */
		
		
		/*
		 *   Wrapper class
		 *   
		 *   	Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
		 *   
		 *   	primitive           wrapper
		 *   ---------------------------------
		 *      boolean             Boolean
		 *      char                Character
		 *      int                 Integer
		 *      double              Double
		 *      
		 *      
		 *      autoboxing --- conversion  primitive types ---> their corresponding object wrapper classes
		 *      unboxing --- the reverse of autoboxing
		 *      
		 *      
		 * */
		
//		Boolean a = true;
//		Character b = '@';
//		Integer c = 123;
//		Double d = 3.14;
//		String = "Justin";
		
		
		/*
		 * 		ArrayList 
		 * 
		 *  		resizable array. elements can be added and removed after compilation phase
		 *  		store reference data types
		 * */
		
//		ArrayList<String> food = new ArrayList<String>();
//		food.add("pizza");
//		food.add("steak");
//		food.add("chicken");
//		
//		for (int i =0; i<food.size(); i++) {
//			System.out.println(food.get(i));
//		}
//		
//		System.out.println();
//		
//		food.set(0, "sushi");
//		for (int i =0; i<food.size(); i++) {
//			System.out.println(food.get(i));
//		}
//		
//		System.out.println();
//		
//		food.remove(2);
//		for (int i =0; i<food.size(); i++) {
//			System.out.println(food.get(i));
//		}
//		
//		System.out.println();
//		food.clear();
		
		
		/*
		 *   2D ArrayList 
		 *   
		 *   	a dynamic list of lists
		 *   	able to change the size of lists during runtime
		 *   
		 *   	import java.util.*
		 * */
		
//		ArrayList<ArrayList<String>> groceryList = new ArrayList();
//		
//		ArrayList<String> bakeryList =  new ArrayList();
//		bakeryList.add("pasta");
//		bakeryList.add("garlic bread");
//		bakeryList.add("donuts");
//		System.out.println(bakeryList);
//		
//		
//		ArrayList<String> produceList =  new ArrayList();
//		produceList.add("tomatoes");
//		produceList.add("zucchini");
//		produceList.add("peppers");
//		System.out.println(produceList);
//	
//		
//		ArrayList<String> drunkList =  new ArrayList();
//		drunkList.add("soda");
//		drunkList.add("coffee");
//		System.out.println(drunkList);
//		
//		groceryList.add(bakeryList);
//		groceryList.add(produceList);
//		groceryList.add(drunkList);
//		
//		System.out.println(groceryList);
//		System.out.println(groceryList.get(0).get(1));
//		System.out.println(groceryList.get(1));
		
		/*
		 *   For Each
		 *   
		 *   	traversing technique to iterate through the elements in an array or collections
		 *   	less steps
		 *   	more readable
		 *   	less flexible
		 * 
		 * 
		 * 
		 * */
		
//		String[] animals = {"cat", "dog", "rat", "bird"};
//		ArrayList<String> animals2 = new ArrayList<String>();
//		
//		for(String i : animals) {
//			System.out.println(i);
//		}
//		
//		animals2.add("snakes");
//		animals2.add("ducks");
//		animals2.add("monkeys");
//		
//		for(String i : animals2) {
//			System.out.println(i);
//		}

		/*
		 *   Methods
		 *   
		 *   	a block of code that is executed whenever it is called upon
		 *   	methods have to be located outside of main()
		 *   	if we wish to return a variable, we should specific the return type in method header
		 *   	
		 * 		
		 * 
		 * */
//			String name = "Justin";
//			int year = 2023;
//			hello(name, year);
//			
//			
//			int x = 3;
//			int y = 4;
//			
//			int total = add(x,y); // total here is a local variable
//			
//			System.out.println("the sum is " + total); 
		
		
		
		/*
		 *     Overloaded method
		 *     
		 *     		methods that share the same name but have different parameters
		 *     		method name + parameters = method signature
		 *     		to fix overloaded, we can 1) change the name 2) place different parameters
		 *     
		 * 
		 * */
//			int x = 10;
//			int y = 20;
//			int c = 30;
//			
//			int total1 = add(x,y);
//			System.out.println("this is add method #1 and its sum is " + total1);
//			int total2 = add(x,y,c);
//			System.out.println("this is add method #2 and its sum is " + total2);
			
			
			
					
		/*
		 *   printf()
		 *   
		 *   	an optional method to control, format, and display text to the console window
		 *   	two arguments : format string + variable 
		 *   					%[flags] [precision] [width] [conversion-character]
		 *   	
		 *   	[width] --- minium number of characters to be written as output. ex %3s == 3 characters of the string
		 *   				ex: %10s,st --- > there are 10 empty character written before my string value 
		 *   					%-10s,st
		 *   
		 *   	[precision] --- sets number of digits of precision when outputting floating point values
		 *   				ex: %.3f, d --->10.000
		 *   
		 *   	[flags] --- adds an effect to output bsed on the flag added to format specifier
		 *   				- : left justify
		 *   				+ : positive sign or negative sign for a numeric value
		 *   				0 : numeric values are zero-padded; ex: x= 20.11, %010f,x  ---> 020.110000
		 *   				, : comma grouping separator if numbers > 1000 ex: %,f
		 *   				
		 *   
		 *   
		 * */
//		boolean b = true;
//		char c = '@';
//		String st = "hello";
//		int i = 50;
//		double d = 20.11;
		
//		System.out.printf("%b this is boolean value ", b);
//		System.out.printf("%c this is character value ", c);
//		System.out.printf("this is string value :%s", st);
//		System.out.printf("%b this is boolean value", b);
//		System.out.printf("%d this is integer value ", i);
//		System.out.printf("%f this is double value ", d);
			
//		System.out.printf("%-10s", st);
//		System.out.println();
//		System.out.printf("%10s", st);
//		System.out.printf("%010f",d);
		
		
		/*
		 *     Final keyword
		 *     		
		 *     		cannot be changed whatsoever
		 * 
		 * */
		
		
		
		

		
		
		} // end of main(){}
	
	static int add(int a, int b, int c) {
		System.out.println(" this is overloaded method");
		return a + b + c;
	}

	
	static void hello(String name, int year) {
		System.out.println("Hello World from "+ name );
		System.out.println("This is the year of "+ year);
	}
	
	static int add(int x, int y) {
		int total = 0;
		total = x+y;
				
				
		return total;
	}
		
		
	} // end of class{}


