package generics;

import java.util.ArrayList;
import java.util.List;

/*
 *  Polymorphism generally implicit, but when it comes to generics it must be specified
 *  
 *  Reference: 
 *  https://stackoverflow.com/questions/43421017/struggling-with-understanding-extends-t-wildcard-in-java
 *  https://stackoverflow.com/questions/2745265/is-listdog-a-subclass-of-listanimal-why-are-java-generics-not-implicitly-po/2745301#2745301
 */
public class TestGenericsPolimorphisim {

	public static void main(String[] args) {
		
		/*
		 *  
		 */
		List<? extends Vehicle> list1 = new ArrayList<>();
		list1.add(new Object());
		list1.add(new SuperVehicle());
		list1.add(new Car());
		list1.add(new Jetta());
		list1.add(new Vehicle());
		
		/*
		 * Add any object to the list ? super Car which element is Car itself or
		 * a child of it, but not his parent
		 */
		List<? super Car> list2 = new ArrayList<>();
		list2.add(new Car());
		list2.add(new Jetta());
		list2.add(new Vehicle());

	}

}
