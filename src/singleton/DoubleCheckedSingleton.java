package singleton;

/**
 * Despite classic Singleton class being thread-safe, we can see that there’s a clear performance drawback: each time we want to get the instance of our singleton, 
 * we need to acquire a potentially unnecessary lock.

 * To fix that, we could instead start by verifying if we need to create the object in the first place and only in that case we would acquire the lock.
 *
 * One thing to keep in mind with this pattern is that the field needs to be volatile to prevent cache incoherence issues. 
 * @author Dian Jiao
 *
 */
public class DoubleCheckedSingleton {
	private static volatile DoubleCheckedSingleton instance;
	
	public static DoubleCheckedSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				instance = new DoubleCheckedSingleton();
			}
		}
		return instance;
	}

}
