
/** 
* Program to read a text file. List all the words in alphabetical order 
* with number of occurrence for each word and write the list into another text file 
* in the format [word]:[number of times it occurred].
*/

import java.io.*;
import java.util.*;

/* CountWord class */

public class CountWord {

    private HashMap<String,Integer> countMap;
    private String inputFileName;

    /* Constructor to initialize */

    CountWord(String inputFileName){

        this.inputFileName = inputFileName;
        countMap = new HashMap<String,Integer>();
        count();
        writeCount();
    }

    /* Function add word and its count */

    private void addWord(String key){

        int currentCount;
        if(countMap.get(key) != null){
            currentCount = countMap.get(key);
            countMap.put(key, currentCount + 1);
        }
        else{
            countMap.put(key,1);
        }
    }

    /* Function to scan file */
    private void count(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFileName));
            String line = br.readLine();
            while (line != null) {
                String[] lineWords = line.split(" ");
                for(String word : lineWords){
                    addWord(word);
                }
                line = br.readLine();
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* Creating fileNameWordCount to store word and count */

    private void writeCount(){
        try {

            int extensionPosition = inputFileName.lastIndexOf(".");
            String fileNameWithoutExtensions = inputFileName.substring(0, extensionPosition);
            String extension = inputFileName.substring(extensionPosition);
            PrintWriter pw = new PrintWriter(new FileWriter(fileNameWithoutExtensions + "WordCount" + extension),false);
            SortedSet<String> keys = new TreeSet<String>(countMap.keySet());
            for(String key : keys){
                pw.write("[" + key + "]:[" + countMap.get(key) +"]\n");
            }
            pw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* Main function to scan user input */
    public static void main(String[] args) {

        String inputFileName = args[0];
        CountWord wc = new CountWord(inputFileName);
    }
}