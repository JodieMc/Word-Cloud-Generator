package ie.gmit.dip;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8 UserMenu handles user input in the command-line driven user menu
 */

public class UserMenu { // Running Time: O(1)

	FileHandler fh = new FileHandler();
	UrlHandler uh = new UrlHandler();

	public void start() throws Exception {

	private boolean keepRunning = true;

	// String input for file or URL or Word Cloud name
	Scanner myObj;
	String name = myObj.nextLine();

	// Numerical input
	int maxWords = myObj.nextInt();

	/**
	 * Keep menu running
	 */
	public void Menu() { // O(n^2)
				Scanner myObj = new Scanner(System.in);  //Input stream

			   do { //Do loop to keep the menu going
				   this.initMenu();
				   this.processUserInput();
			   } while (keepRunning);

	/**
	 * Displays initial menu to user
	 */
	private void initMenu() { // O(1)

		System.out.println("-------------------------");
		System.out.println("**Word Cloud Generator**");
		System.out.println("-------------------------");
		System.out.println("1.Enter File");
		System.out.println("2.Enter URL");
		System.out.println("3.Enter max number of words to display");
		System.out.println("4.Enter a name for storing word cloud image");
		System.out.println("5.Quit");
		System.out.println("Select option [1-5]>");

	}

	/**
		 * Processes the user input
		 */
	private void processUserInput() { // O(n^2)
		int userInput;
		final int SENTINEL = -1;
		char fileOrURL;
		File TEXT_FILE;
		URL URL_FILE;
		String file, url;
		int setVars;
		String imageName;

		while (userInput != SENTINEL) {
			if (userInput == 1) {
				fileOrURL = myObj.next().toUpperCase().charAt(0);

				System.out.println("Please enter your chosen file:");
				file = myObj.next();
				TEXT_FILE = new File(file);
				fh.parse(TEXT_FILE); // Passes the file name to the FileHandler
			} else if (userInput == 2) {
				fileOrURL = myObj.next().toUpperCase().charAt(0);
				System.out.println("Please enter your chosen URL:");
				url = myObj.next();
				URL_FILE = new URL(url);
				uh.parse(URL_FILE); // Passes the file name to the FileHandler

			} else if (userInput == 3) {
				System.out.println("Enter max words to display in word cloud:");
				maxWords = myObj.nextInt();
				setVars++;

			} else if (userInput == 4) {
				System.out.println("Please enter your chose image name for the word cloud:");
				imageName = myObj.next();
				imageName += ".png";
				setVars++;
			

			}else if (userInput == 5) {
				System.out.println("Quitting...");
				keepRunning = false; // Avoids a hard exit
			} else {
				System.out.println("Invalid... please enter a valid number"); // If the user makes an invalid selection
				// this will catch it
			}
			
			if (!myObj.isPars()) {
				System.out.println("Invalid");
				System.exit(0);
			}

	} myObj.close();

}
