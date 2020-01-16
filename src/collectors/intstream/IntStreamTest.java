package collectors.intstream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 4);
		
		//Object val = intStream.collect(Collectors.partitioningBy( i -> i % 2 == 0)).get(true);
		
		Object val = intStream.boxed().
				collect(Collectors.partitioningBy( i -> i % 2 == 0)).get(true);
		System.out.println(val);
	}

}
