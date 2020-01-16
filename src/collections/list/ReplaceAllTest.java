package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllTest {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		
		ints.replaceAll(i -> i / 2 );
		
		ints.stream().distinct().forEach(System.out::println);
		
		// returns the number of elements
		System.out.println(ints.stream().distinct().count());
	}

}
