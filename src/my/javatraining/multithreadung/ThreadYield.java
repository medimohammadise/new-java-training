package my.javatraining.multithreadung;
/*
 * Yield method
 * What does this code do :It prints from 5-500
 */
public class ThreadYield implements Runnable {
	private int i;

	@Override
	public synchronized void run() {
		if (i % 5 != 0) //divide by 5 
			i++;
		for (int x = 0; x < 5; x++, i++) {
			if (x > 1)
				Thread.yield();// allow other threads to run
		}
		System.out.print(i + " ");

	}

	public static void main(String[] args) {
		ThreadYield n = new ThreadYield();
		for (int x = 100; x > 0; --x) {
			new Thread(n).start();
		}
	}

}
