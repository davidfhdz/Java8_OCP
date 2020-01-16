package lambdas.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestFunctionCall {

	public static void main(String[] args) {
		calculate(Arrays.asList(1,2,3,4), (i,j) -> i +j);
		// The parametyzed types must be objects instead of primitives
		calculate(Arrays.asList(1,2,3,4), (int i, int j) -> i +j);
		calculate(Arrays.asList(1,2,3,4), (Integer i,Integer j) -> i +j);
		calculate(Arrays.asList(1,2,3,4), (Integer i, Integer j) -> { return i + j;});		
	}
	
	static int calculate(List<Integer> intList, BiFunction<Integer, Integer, Integer> biFunc ) {
		return 0;
	}

}
