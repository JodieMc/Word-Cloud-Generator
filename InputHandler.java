package ie.gmit.dip;

/**
 * 
 * @author Josephine Mc Crann
 * 
 *         <b>Interface</b> InputHandler provides a blueprint for classes. Both
 *         the <i>FileHandler</i> and <i>UrlHandler</i> classes will possibly
 *         contain input that requires special handling i.e. leading, trailing
 *         and extra spaces, plurals, and characters that are not part of the
 *         English alphabet will need to be eliminated from the word cloud.
 *         Interfaces specify methods a class should have if it is implemented
 *         by the class and the default implementations for the methods. The
 *         implementing classes must implement the methods specified below and
 *         any specified parameters, but can contain more methods than those
 *         specified in the interface. The interface specifies what the
 *         implementing class should do but not how to do it. Reference:
 *         caveofprogramming.com
 */

public interface InputHandler {

	public void unwantedText();

	public void checkPlural();

	public void checkAlphabet();
}
