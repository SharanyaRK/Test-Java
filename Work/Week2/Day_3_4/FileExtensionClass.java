/**
* Program to scan a directory and its sub directories and print all the file * extensions along with the number of files in that extension.
*/

import java.nio.file.*;
import java.io.*;
import java.util.*;

/* class FileExtensionClass */

public class FileExtensionClass {

    /* HashMap to store the extension’s counts */

    private HashMap<String,Integer> extensionCount;
    private Path inputDirectory;

    /* Initializing the HashMap */

    FileExtensionClass(Path inputDirectory){
        this.inputDirectory = inputDirectory;
        extensionCount = new HashMap<String,Integer>();
        traverse(inputDirectory);
    }

    /* Function to add an extension and its count */
    private void add(String key){
        int currentCount;

        if(extensionCount.get(key) != null){
            currentCount = extensionCount.get(key);
            extensionCount.put(key, currentCount + 1);
        }
        else{
            extensionCount.put(key,1);
        }

    }

    /* Function to display extension and its counts */

    public void displayCount(){
        for(Map.Entry m : extensionCount.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }

    /* Function for recursively traversing the given directory */

    private void traverse(Path currentDirectory) {

        try{
            DirectoryStream<Path> stream = Files.newDirectoryStream(currentDirectory);
		System.out.println(" stream : " +stream);

            for (Path path: stream) {

                if(path.toFile().isDirectory()){
			System.out.println(" in path : " +path);
                    traverse(path);
                }
                else{
                    String fileName = path.getFileName().toString(), extension = "no extension";
                    int i = fileName.lastIndexOf('.');
                    if (i >= 0){
                        extension = fileName.substring(i);
                    }

                    add(extension);
                }
            }
        } 
        catch(IOException e) {
            e.printStackTrace();
        }
    }


    /* Main fuction to scan user input */
    public static void main(String[] args) {
        Path userInput = Paths.get(args[0]).toAbsolutePath();
        FileExtensionClass f = new FileExtensionClass(userInput);
        f.displayCount();
    }

}

