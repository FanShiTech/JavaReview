
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("This thread is running");
		
		if(this.isDaemon()) {
			System.out.println("YES, THIS IS");

		}
		else {
			System.out.println("this is user thread");
		}
	}

}
