package ie.gmit.dip;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8 UrlHandler implements the methods from interface InputHandler and
 *        adds a method to parse the input URL and extract words from the URL
 *        page. It also ignores words from the ignorewords.txt file.
 *
 */

public class UrlHandler implements InputHandler {

	List<String> urlText = new ArrayList<String>();
	List<String> ignoreWords = new ArrayList<String>();
	File IGNORE_FILE = new File("./ignorewords.txt");

	/**
	 * 
	 * @param URL_FILE
	 * @throws Exception
	 * parse method uses scanner and InputStream to read input from the URL page and adds the words. 
	 */
	
	public void parse() { //Parse running time: O(n^2) as a loop involved
		
		URL URL_FILE;
		Scanner in = new Scanner(new InputStreamReader(URL_FILE.openStream()));
		Scanner ignore = new Scanner(IGNORE_FILE);
		in.useDelimiter("[^A-Za-zÉ']+");
		int i = 0;
		String word;

		while(ignore.hasNextLine()) {
			ignoreWords.add(ignore.next());
		}
		while(in.hasNext()) {
			urlText.add(in.next());
		}
		
		 
		while(i < urlText.size()) { 
			word = urlText.get(i).toLowerCase(); 
			if(ignoreWords.contains(word)) {
				urlText.remove(i);
			}
			else {
				i++;
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
		
		FrequencyTableBuilder ftb = new FrequencyTableBuilder();
		ftb.table(urlText);
		
		in.close();
		ignore.close();
	}
}
