
public class TestRunTime {
	public static void main(String[] args) {

		try {
			doCalculation();
		} catch (SmallArrayException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Out of the block");
	}

	public static void doCalculation()throws SmallArrayException{
		//try{
			int a[] = new int[2];
			if(3>a.length)
				throw new SmallArrayException("not valid");
			System.out.println("Access element three" + a[3]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception thrown");
//		}
//		

	}
}
