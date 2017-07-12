import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSimple {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		double res = 0;
		for (int i = 0; i < list.size() && i % 2 == 0 && i > 3; i++) {
			res += (i * 1.5);
		}
		Timit.code(() -> System.out.println());
		System.out.println(res);
		/*
		 * Timit.code(() -> { list.forEach(LambdaSimple::printWithHello); });
		 */

		Timit.code(() -> System.out.println(list.parallelStream().filter(LambdaSimple::GT3)
				.filter(LambdaSimple::isPrime).mapToDouble(LambdaSimple::compute).sum()));
	}

	private static double covertTodouble(List<Integer> list) {
		double res = 0;
		for (int i = 0; i < list.size() && isPrime(i) && GT3(i); i++) {
			res += compute(i);
		}
		return res;
	}

	private static double compute(int value) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private static boolean isPrime(int value) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	private static boolean GT3(int value) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return value > 3;
	}
}