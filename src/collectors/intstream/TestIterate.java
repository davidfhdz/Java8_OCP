package collectors.intstream;

import java.util.stream.IntStream;

public class TestIterate {
	/**
	 * The first element is seed = 10 and then apply f(seed), f(f(seed)) infinitely
	 * @param args
	 */
	public static void main(String[] args) {
		IntStream ints = IntStream.iterate(10, n -> n*2).limit(3);
		//ints.forEach(System.out::println);
		System.out.println(ints.sum());
	}

}
