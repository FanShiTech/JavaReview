
public class MyMultithead extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 10; i>0; i--) {
			System.out.println("thread #1 "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("thread #1 is finished ");
		
	}//end of method
	

}//end of class
