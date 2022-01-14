package ie.gmit.dip;

/**
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8 
 * Returns true if the input is parsable and false if it is not
 */

public class ValidateAsParsable {

	/**
	 * @param input
	 * @return boolean value
	 */
	
	public static boolean isPars(String input) {
		boolean parsable = true;
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			parsable = false;
		}
		return parsable;
	}
}

