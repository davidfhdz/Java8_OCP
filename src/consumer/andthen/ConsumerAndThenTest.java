package consumer.andthen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Consumer<Integer> cons = System.out::print;
		Consumer<Integer> con = e -> System.out.println("" + e*2 + "");
		cons.andThen(con);
		list.forEach(cons);
	}

}
