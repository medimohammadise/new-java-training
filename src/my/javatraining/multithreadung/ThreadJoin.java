package my.javatraining.multithreadung;
/*
 * Use of Join method for column :Join , join current thread with main thread , if it does not finish , other threads will not start
 */
public class ThreadJoin {
  Thread importantThread =new Thread(
	  new Runnable() {

		@Override
		public void run() {
			System.out.println("Main Thread");
			
		}
		  
	  }
  );
  
  Thread currentThread =new Thread(
		  new Runnable() {

			@Override
			public void run() {
				System.out.println("Current Thread");
				
			}
			  
		  }
	  );
  public void runThread() throws InterruptedException {
	  importantThread.start();
	  //importantThread.join();
	  currentThread.start();
  }
  
 public static void main(String[] args) {
	 ThreadJoin t=new ThreadJoin();
	 try {
		t.runThread();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}

