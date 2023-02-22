import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import Tools.toolBoox;
import javax.swing.Icon;

public class JavaKnowledge_advanced {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		
		/*
		 *    Generic method and class
		 *    
		 *    	generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, methods
		 *      it can eliminate the need of creating multiple versinos of methods or classes for various data types
		 *      
		 *      for example, four types of array, double, char, string, and int; with generic method we can use one method to display each of them
		 *    
		 *    
		 * 
		 * */
		
//		Integer[] intArray = {1,2,3,4,5};  //hence use wrapper 
//		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
//		Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
//		String[] stringArray = {"aa","bb","cc", "dd", "ee"};
//		
//		display(intArray);
//		display(charArray);
//		display(stringArray);
//		display(doubleArray);
//		System.out.println();
//		System.out.println(getFirst(intArray));
//		System.out.println(getFirst(charArray));
		
		
		/*
		 *   Generic Class
		 * 
		 * 
		 *  Files: myIntergerClass, myDoubleClass, myCharClass, myStringClass, myGenericClass
		 * 
		 * 
		 * */
		
		
//		MyIntergerClass myInt = new MyIntergerClass(1);
//		MyCharClass myChar = new MyCharClass('@');
//		MyDoubleClass myDouble = new MyDoubleClass(5.5);
//		MyStringClass myString = new MyStringClass("hello");
		
		

		/*
		 *    Bounded Type  ---> create the objects of a generic class to have data of specific derived types
		 *    
		 *      Number class, in generic class, if you extend Number class, you can pass all relevant number types
		 *      
		 *   Files: myGenericClass
		 *    
		 * */

		
//		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,9);
////		MyGenericClass<Character> myChar = new MyGenericClass<>('@');
//		MyGenericClass<Double, Integer> myDouble = new MyGenericClass<>(5.5, 10);
////		MyGenericClass<String> myString = new MyGenericClass<>("hello");
//		
//		
//		System.out.println(myInt.getValue());
//		System.out.println(myInt.getValueY());
////		System.out.println(myChar.getValue());
//		System.out.println(myDouble.getValue());
//		System.out.println(myDouble.getValueY());
////		System.out.println(myString.getValue());
		
		
		/*
		 * 
		 *    Serialization ---> the process of converting an object into a byte stream. saving the state (obj) after program exits
		 *    						the byte stream can be saved as a file or sent over a network, and to different machines
		 *    
		 *    Deserialization ---> the reverse process
		 *    
		 *    
		 *    To serialize , first implements Serializable 
		 *    					second, import library third, 
		 *    						third:  FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
		 *									ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 *									out.writeObject(user);
		 *									out.close();
		 *									fileOut.close();
		 *    
		 *    File: user
		 *    
		 *    
		 * */
		
		// i am going to save the state of user 
		
		
		///////////////////// SERIALIZATION //////////////////////////
//		User user = new User();
//		user.name = "JUSTIN";
//		user.password = "123456";
//		
//		FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
//		ObjectOutputStream out = new ObjectOutputStream(fileOut);
//		out.writeObject(user);
//		out.close();
//		fileOut.close();
//		
//		System.out.println("saved ");
		
		///////////////////// DESERIALIZATION/////////////////////
//		User user = null;
//		FileInputStream fileIn = new FileInputStream("userInfo.ser");
//		ObjectInputStream in = new ObjectInputStream(fileIn);
//		user = (User) in.readObject();
//		in.close();
//		fileIn.close();
//		
//		
//		System.out.println(user.name);
//		System.out.println(user.password);
//		user.sayHello();
		
		
		
		/*
		 * 
		 * 		Timer , TimerTask, Thread
		 * 
		 *   timer ---> a facility for threads to schedule tasks for future execution in a background thread
		 *   timerTask ---> a task that can be scheduled for one-time or repeated execution by a timer
		 * 
		 * 	 Thread ---> a thread of execution in a program . the JVM allows an application to have multiple threads running
		 * 				concurrently. Each thread can execute parts oof your code in parallel with the main thread
		 * 					Each thread has a priority 
		 * 					Threads with higher priority are executed in preference compared to threads with a lower priority
		 * 				
		 *              JVM continues to execute threads until either of following conditions occur:
		 *              		the exit method of class runtime haas been called
		 *              		all user threads have died
		 *              
		 *              When a JVM starts up , there is a thread called main method
		 *              Daemon thread in Java is a low-priority thread that runs in the background to perform tasks such as garbage collection. 
		 *              Daemon thread in Java is also a service provider thread that provides services to the user thread. 
		 *              Its life depends on the mercy of user threads i.e. when all the user threads die, JVM terminates this thread automatically.
		 *              
		 *              
		 *              
		 *              
		 *     Multithreading ---> the process of executing multiple threads simultaneously . helps maximum utilization of CPU
		 *     						threads are independent, they dont affect the execution of other threads
		 *     						useful for serving multiple clients, games
		 *     
		 *     File: myThread, MyMultithead, myRunnable
		 *     
		 *     	
		 *     for multiple thread, you need to start() 
		 * */
		
//		Thread.currentThread().setName("JJJ");
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setPriority(10);  // 1-10 , 10 is heightest
//		System.out.println(Thread.currentThread().getPriority());
//		
//		System.out.println(Thread.currentThread().isAlive());
//		
//		for(int i = 5; i>0; i--) {
//			System.out.println(i);
//			Thread.sleep(2000);
//		}
//		
//		System.out.println("DONE");
		
		
		
		
//		MyThread thread2 = new MyThread();
//		
//		thread2.start();
//	
//		System.out.println(thread2.isAlive());
//		
//		System.out.println(thread2.getName());
//		
//		System.out.println(thread2.isDaemon());
		
		/////////////////  MULTITHREADING ///////////////////
		
//		
//		MyMultithead mt1 = new MyMultithead();
//		
//		MyRunnable ra1 = new MyRunnable();
//		Thread thread2 = new Thread(ra1);
//		
//		mt1.start();
//		thread2.start();
		
		
		
		
		/*
		 * 
		 *     Packages
		 *     
		 *     if the package is not default package, import the package 
		 *     
		 *     
		 *     
		 * */
	
//		toolBoox tools = new toolBoox();
		
		

	}// end of main()
	
//	public static <Thing> void display(Thing[] array) {  //you can replace Thing with any name you like
//		for(Thing x: array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//	
//	public static <T> T getFirst(T[] array) {
//		return array[0];
//	}

}// end of class
