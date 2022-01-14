package ie.gmit.dip;

/**
 * 
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8 
 * Runner contains the main method which is used by the Java Virtual
 * Machine to begin execution of a Java program. 
 * Runner creates an object of the UserMenu class and calls the start method.
 */

public class Runner {

	public static void main(String[] args) throws Exception {
		UserMenu userMenu = new UserMenu();
		userMenu.start();

	}

}
