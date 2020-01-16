package core.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Make the flag safely updated only if it has no changes
 * @author r.paredes.bernal
 *
 */
public class TestAtomicInteger {
	public AtomicInteger flag = new AtomicInteger();
	
	public static void main(String[] args) {
		TestAtomicInteger test = new TestAtomicInteger();
		int oldValue = test.flag.get();
		int newValue = 0;
		
		test.flag.compareAndSet(oldValue, newValue);
		
		//NOT for our porpuses but methods exist
		/*
		test.flag.updateAndGet(updateFunction);
		test.flag.getAndUpdate(updateFunction);
		*/
	}

}
