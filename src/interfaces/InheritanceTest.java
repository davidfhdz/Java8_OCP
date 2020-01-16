package interfaces;

interface InheritanceTest {
	static boolean staticMethod() {
		return true;
	}
	
	default boolean defaultMethod() {
		return false;
	}

	void emptyMethod();
}

interface Child1 extends InheritanceTest {
	// can override a static method
	static boolean staticMethod() {
		return false;
	}
	
	// cannot hide instance method 
	static boolean defaultMethod() {
		return true;
	}
	
	// can override an abstract method
	default void emptyMethod() {
		
	}
	
}

interface Child2 extends InheritanceTest {
	// can override static method
	default boolean staticMethod() {
		return false;
	}
	
	// can override default method
	default boolean defaultMethod() {
		return true;
	}
	
	// can override an abstract method
	default void emptyMethod() {
		
	}
}

interface Child3 extends InheritanceTest {
	
	// can add abstract methods to hide static parent methods
	boolean staticMethod();
	
	default boolean defaultMethod() {
		return true;
	}
	// cannot hide instance method 
	static void emptyMethod() {
	}
}

interface Child4 extends InheritanceTest {
	// can remove static and add a method with the same name as the static
	boolean staticMethod();
	
	// can remove default and define a method with the same as its defualt parent name
	boolean defaultMethod();
	
	// cannot hide instance method 
	default void emptyMethod() {
	}
}



