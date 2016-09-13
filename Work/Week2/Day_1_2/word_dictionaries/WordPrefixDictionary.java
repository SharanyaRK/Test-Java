/**
* Program to create a map with the common prefix(first 3 characters) 
* as key and value as the list of words that starts with that prefix.
* Printing the prefix & words starting with that prefix in the alphabetical order of * the prefix. 
*/

package word_dictionaries;
import java.util.*;

/* Function to create map with common prefix */

public class WordPrefixDictionary extends WordDictionary<String>{
	
	/* Function to get the key */
	public String getKey(String value){
		return value.substring(0,3);
	}

	public static void main(String[] args) {
		String key;

		/* Create object */
		WordPrefixDictionary w = new WordPrefixDictionary();

		String[] stringArray = {"abc","abcd","abcdef","wert","qertyui","werhjikl"};
		
		for(String s : stringArray){
			w.add(s);
		}
		
		/* Display created map */
		w.displayMap();
	}
}