
public class Timit {
	public static void code(Runnable r) {
		long start = System.currentTimeMillis();
		try {
			r.run();
		} catch (Exception e) {

		}
		start = System.currentTimeMillis() - start;
		System.out.println("Time Taken " + start / 1000 + " Seconds");

	}
}
