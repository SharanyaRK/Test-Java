/**
* Program to create a map with length of word as key and value as list of words with * that length 
*/

package word_dictionaries;
import java.util.*;

/* Main class to create map 

public class WordSizeDictionary extends WordDictionary<Integer>{

	/* Function to return key */
	public Integer getKey(String value){
		return value.length();
	}

	public static void main(String[] args) {

		/* creating object */

		WordSizeDictionary w = new WordSizeDictionary();
		String[] stringArray = {"abc","def","ghi", "qwer", "wert","qertyui"};

		/* Add words to object */

		for(String s : stringArray){
			w.add(s);
		}

		/* Display the elements of the map created with key and values */

		w.displayMap();
	}
}