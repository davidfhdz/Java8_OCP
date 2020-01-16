package functions.predicate;

import java.util.function.Predicate;

public class TestPredicateWithTypes {

	public static void main(String[] args) {
		Predicate<Integer> even = (Integer i) -> i%2 == 0;
		Predicate even1 = (Integer i) -> i%2 == 0;
		Predicate even2 = (Integer i) -> (Integer)i%2 == 0;
		Predicate even3 =  i -> i%2 == 0;
	}

}
