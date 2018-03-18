package my.javatraining.multithreadung;

public class MyThreadForStop extends Thread {
	private volatile Thread ThreadToBeStopped;
    public void startThread() {
    	  ThreadToBeStopped= new Thread(this);
    	  ThreadToBeStopped.start();
    }
    public void stopThread() {
    		ThreadToBeStopped=null;
    }
	public void run() {
		System.out.println("Thread is running "+Thread.currentThread().getName());
		while(ThreadToBeStopped==Thread.currentThread())
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Thread is running "+Thread.currentThread().getName());
		
		MyThreadForStop threadTest=new MyThreadForStop();
		threadTest.startThread();
		threadTest.stopThread();
	}

}
