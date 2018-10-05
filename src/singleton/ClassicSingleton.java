package singleton;

/**
 *
 *
 * @author Dian Jiao
 *
 */
public class ClassicSingleton {
	private static ClassicSingleton instance;
	
	public static synchronized ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}

}
