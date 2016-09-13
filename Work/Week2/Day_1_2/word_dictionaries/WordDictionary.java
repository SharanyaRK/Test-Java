/**
* Program to add the words to dictionary and display them 
*/ 

package word_dictionaries;
import java.util.*;

/* Class WordDictionary with generic parameter */

abstract public class WordDictionary<T>{

	HashMap<T,ArrayList<String>> map;
	
	/* Constructor to create a map */

	WordDictionary(){
		map = new HashMap<T,ArrayList<String>>();
	}

	abstract public T getKey(String value);

	/* Function to add new words to the dictionary */

	public void add(String value){
		T key = getKey(value);
		ArrayList<String> list = map.get(key);
		if(list == null){
			list = new ArrayList<String>();
			list.add(value);
		}
		else {
			list.add(value);
		}
		map.put(key,list);
	}

	/* Function to display the dictionary on console */

	public void displayMap(){

		/* Loop to display key and value */

		for(Map.Entry m : map.entrySet()){

			System.out.print(m.getKey()+" : ");
			ArrayList<String> list = (ArrayList<String>) m.getValue();			
			for (String word: list) {
				System.out.print(word+" ");
			}
			System.out.println();
		}
	}
}