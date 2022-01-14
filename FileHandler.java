package ie.gmit.dip;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8 FileHandler implements the methods from interface InputHandler and
 *        adds a method to parse the file and ignore words from the
 *        ignorewords.txt file
 */
public class FileHandler implements InputHandler {/*
													 * Interfaces are useful for classes when classes have groups of
													 * identical methods e.g. FileHandler and UrlHandler in this
													 * application. Interface methods are public by default.
													 */

	List<String> fileText = new ArrayList<String>();
	List<String> ignoreWords = new ArrayList<String>();
	File IGNORE_FILE = new File("ignorewords.txt");

	/**
	 * 
	 * @param TEXT_FILE
	 * @throws Exception
	 * parse method uses scanner and InputStream to read input from the file and adds the words. 
	 */
	
	
	public void parse() {//Parse running time: O(n^2) as a loop involved
		File TEXT_FILE;
		Scanner in = new Scanner(TEXT_FILE); //Obtain input
		Scanner ignore = new Scanner(IGNORE_FILE); //Input ignore file
		in.useDelimiter("[^A-Za-z0-9É'.]+"); //Splits strings into tokens
		int i = 0;
		String word;
	
		
		while(ignore.hasNextLine()) {//Check if there is another line in the input ignore file
			ignoreWords.add(ignore.next()); //While there is add to ignored words
		}
		while(in.hasNextLine()) { //Check if there is another line in the input file
			word = in.next();
			word = word.replace(".", "");
			fileText.add(word); //While there is add to the words
		}
		 
		while(i < fileText.size()) { //Loop through to compare words in the URL with words in the ignoreWords.txt file. 
									// If present in this file, remove them.
			word = fileText.get(i).toLowerCase(); //Convert the string to lower case
			if(ignoreWords.contains(word)) {
				fileText.remove(i);//Remove
			}
			else {
				i++;//Or increment
			}
		}

	/**
	 * Remove leading, trailing and extra spaces between words.
	 */
	@Override
	public void unwantedText() { // unwantedText running time: O(n^2)
		fileText = fileText.replaceAll("\\s+", " ");
	}

	/**
	 * Check for plurals.
	 */

	@Override
	public void checkPlural() { // checkPlural running time: O(n^2)
		int count = 0;
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

	}

	static boolean checkPlural(String str) {
		int i = str.length();
		if (str.charAt(i - 1) == 's') {
			return true;
		}
		return false;
	}

	/**
	 * Check for letters in the English alphabet.
	 */

	@Override
	public void checkAlphabet() { // checkAlphabet running time: O(n^2)
		int count = 0;
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

	}static boolean checkAlaphabet(String str) {
		if (str.charAt(>64 && <91) || (>96 && <123) {
			return true;
	}
	return false;
}

	FrequencyTableBuilder ftb = new FrequencyTableBuilder();ftb.table(fileText);

	in.close();ignore.close();
}
