package com.niit.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSample {

	public static void main(String args[]) {
		/*
		 * Thread th = new Thread(new Runnable() {
		 * 
		 * 
		 * public void run() {
		 * 
		 * System.out.println("Inside Thread");
		 * 
		 * }
		 * 
		 * });
		 */
		Thread th = new Thread(() -> System.out.println("Inside Thread"));
		th.start();

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		/*
		 * for(int i =0 ; i<numbers.size();i++){
		 * System.out.println(numbers.get(i)); }
		 */
		for (Integer i : numbers) {
			System.out.print(i);

			/*
			 * numbers.forEach(new Consumer<Integer>() {
			 * 
			 * public void accept(Integer t) { System.out.println(t); } });
			 */

		}
		// Lambda Expression
		// numbers.forEach((Integer value) -> System.out.print(value));
		// numbers.forEach((value) -> System.out.print(value));
		
		numbers.forEach(System.out::println); // method reference

	}
}
