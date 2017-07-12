class BoxPrinter<T, Q> {
	private T val;
	private Q val1;

	public BoxPrinter(T arg, Q arg1) {
		val = arg;
		val1 = arg1;
	}

	public String toString() {
		return "[" + val + " " + val1 + "]";
	}
}

class BoxPrinterTest {
	public static void main(String[] args) {
		BoxPrinter<Integer, Integer> value1 = new BoxPrinter(new Integer(10),new Integer(10));
		System.out.println(value1);
		BoxPrinter<String, String> value2 = new BoxPrinter("Hello","World");
		System.out.println(value2);
		
//		Car c = new Car("Audi", "A6", "red");
//		BoxPrinter<Car> value3 = new BoxPrinter<Car>(c);
//		System.out.println(value3);

	}

}