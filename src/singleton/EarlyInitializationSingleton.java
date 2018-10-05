package singleton;

/**
 * The easiest way to achieve thread safety is to inline the object creation or to use an equivalent static block. 
 * This takes advantage of the fact that static fields and blocks are initialized one after another
 * 
 * A static variable is common to all the instances (or objects) of the class
 * 
 * @author Dian Jiao
 *
 */
public class EarlyInitializationSingleton {
	
	private static final EarlyInitializationSingleton instance = new EarlyInitializationSingleton();
	
	public static EarlyInitializationSingleton getInstance() {
		return instance;
	}

}
