package my.javatraining.multithreadung;

public class LambdaThreadHelloWorld {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello World!");
			}
		});
		thread.start();
		Thread myThread = new Thread(() -> {
			System.out.println("Hello World Lambda Thread!");
		});

		myThread.run();
	}
}
