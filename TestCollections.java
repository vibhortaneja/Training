import java.util.*;

class TestCollection {
	public static void main(String args[]) {
		HashMap<Person, Car> myMap = new HashMap<Person, Car>();

		Car c = new Car("A1", "Red", "Audi");
		Person p = new Person("Amit", 30, 6);
		myMap.put(new Person("Amit", 31,1), new Car("A1", "White", "Audi"));
		myMap.put(new Person("Amit1", 32,2), new Car("A2", "Red", "Audi"));
		myMap.put(new Person("Amit2", 33,3), new Car("A3", "Blue", "Audi"));
		myMap.put(new Person("Amit3", 34,4), new Car("A4", "Black", "Audi"));
		myMap.put(p, c);
		myMap.put(p, c);

		for (Map.Entry<Person, Car> car : myMap.entrySet()) {
			System.out.println("Key: " + car.getKey() + " Value " + car.getValue());
		}
		System.out.println("value for 1, Amit is " + myMap.get(p));
	}
}