package ie.gmit.dip;

import java.util.*;

/**
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8 FrequencyTableBuilder builds a frequency table of words with their
 *        frequency occurrences (key-pairs).
 */

public class FrequencyTableBuilder {
	//With a HashMap O(1) operation 
	 Map<String, Integer> table = new HashMap<String, Integer>(); // String - if the word exists as a key in the
																			// map, it'll be returned X times (Integer
	Scanner in = new Scanner(System.in);

	/**
	 * To process the building of the frequency table
	 * @param words
	 */
	@SuppressWarnings("removal")
	public void process(String[] words) { //process running time: O(n^2) as a loop involved
		/**Use for loop to iterate over words array and create a frequency table for the words
		 * 
		 */
		for (String word : words) {
			String lcWord = word.toLowerCase();
			
			int frequency = 1; //Initialise as 1
			if (table.containsKey(lcWord)){ //Check to see if word exists in the map if the key is present
				frequency = table.get(lcWord); //Give the value associated with the key and number of occurrences
				frequency++; //If there, increment it
				
				/*increments value if word is already
				 * contained in the map. Otherwise adds the key and sets value to 1. Running Time:
				 * O(n)
				 */
			}
			table.put(lcWord, 1); //O(1)Replace lcWord with the new Integer value which takes frequency, will overrride what is there
			//If it's not there, put it in, if it is replace
		} 
		
		
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(table);//Sorts the results
		
	
		//table.remove is a constant time operation on a HashMap and O(log n) on a TreeMap 
		
		//If want to get the keyset
		Set<String> keys = table.keySet();
		for(String key : keys) {
			int number = table.get(key); //Running time O(1)
		}
	    // Returns a collection of Integer types
		//Not a set as the values don't have to be unique but the keys do
		Collection<Integer> values = table.values();
		for(Integer val : values) {
			System.out.println(val);
		}
		
	}
}

