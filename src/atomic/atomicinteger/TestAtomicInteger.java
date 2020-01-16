package atomic.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The value of an AtomicInteger is assigned in compile time
 * @author r.paredes.bernal
 *
 */
public class TestAtomicInteger {
	int val = 10;
	int x;
	
	TestAtomicInteger(int i){
		val = i;
	}
	
	private AtomicInteger value = new AtomicInteger(val);
	
	public static void main(String[] args) {
		TestAtomicInteger at = new TestAtomicInteger(5);
		//at.value.set(5);
		System.out.println(at.value.getAndSet(5)); 
		System.out.println(at.value.decrementAndGet());
	}
}
