
public class RunnableDemo extends Thread {
	private Thread t;
	private String threadName;

	RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating" + threadName);
	}

	public void run() {
		System.out.println("Running" + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread:" + threadName + " " + i);

			Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread" + threadName);
		}
		System.out.println("Thread" + threadName);
			//e.printStackTrace();
		}

	public void start() {
		System.out.println("starting" + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
