package stream.allmatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestPredicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-2,-1,0,1,2);
		Predicate<Integer> positive = i -> {
			//System.out.println(i);
			return i>0;
		};
		
		Predicate<Integer> negative = i -> {
			//System.out.println(i);
			return i < 0;
		};
		
		list.stream().peek(v -> System.out.println("p1:" + v))
		 .filter(positive)
		 .peek(v -> System.out.println("p2:" + v))
		 .allMatch(negative);
		
		//list.stream().filter(positive).allMatch(negative);
	}
}
