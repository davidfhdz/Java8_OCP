package functions.compose;

import java.util.function.Function;

public class ComposeTest {
	public static void main(String[] args) {
		Function<Double, Integer> mul = d -> d.intValue();
		Function<Integer, String> f = in -> in.toString();
		
		Function<Double, String> func = f.compose(mul);
		
		System.out.println(func.apply(12.6).length());
	}
}
