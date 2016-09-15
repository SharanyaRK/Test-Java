/** 
* Program to scan a directory and its sub directories and move all the files 
* into a separate single directory. If a file with the same name is already present, 
* the file name should be appended with the incremented number, eg, a.txt, a-1.txt, a-2.txt
*/

import java.nio.file.*;
import java.io.*;
import java.util.*;

/* MoveFiles class */

public class MoveFiles {

    Path sourceDirectory, destinationDirectory;

    /* Constructor initializing objects */

    MoveFiles(Path sourceDirectory, Path destinationDirectory){
        this.sourceDirectory = sourceDirectory;
        this.destinationDirectory = destinationDirectory;
    }

    /* Function to move file to destination dirctory */

    public void moveFiles(){
        move(sourceDirectory);
    }

    private void move(Path currentDirectory){

        try{

            DirectoryStream<Path> stream = Files.newDirectoryStream(currentDirectory);

            for (Path path: stream) {

			/* If it is a directory , go recursive */

                if(path.toFile().isDirectory()){
			move(path);
                }

                else{
			/* If it is a file do necessary operations */

		       String fileName = path.getFileName().toString();
		       File baseDirectoryFile = new File(destinationDirectory.toString());
                      File newFile = new File(baseDirectoryFile,fileName);

			/* Testing if a file with the same name exists in the destination folder */

                    if(!newFile.exists()){
                       /* If name does not exist, move the file */

                      Files.move(path, destinationDirectory.resolve(fileName));
                    }

                    else{

                        boolean movedFile = false
                        int noOfFiles = 1;
                        do{

                            int extensionPosition=fileName.lastIndexOf(".");

                            if(extensionPosition == -1){
                                extensionPosition = fileName.length();
                            }

                            System.out.println(extensionPosition);
                            String fileNameWithoutExtensions = fileName.substring(0, extensionPosition);
                            
                            String extension = fileName.substring(extensionPosition);
                            int countPosition = fileNameWithoutExtensions.lastIndexOf("-");

                            /* Check if the filename already has an incremented value */

                            if(countPosition == -1){
               
                                fileName = fileNameWithoutExtensions + "-" + noOfFiles + extension;
                            }

                            else{
                              
                                noOfFiles = Integer.parseInt(fileNameWithoutExtensions.substring(countPosition + 1)) + 1;
                                fileName = fileNameWithoutExtensions.substring(0,countPosition) + "-" + noOfFiles + extension;

                            }
                            
                            /* Check if the new filname exists */

                            File newFile2 = new File(baseDirectoryFile,fileName);

                            if(!newFile2.exists()){

                                Files.move(path, destinationDirectory.resolve(fileName));
                                movedFile = true;

                            }
                            
                            /* If filename does not exists the loop repeats , with the new filename */

                        }while(!movedFile);
                    }       
                }
            }
        } 
        catch(IOException e) {
            e.printStackTrace();
        }
    }

	/* Main function for scanning input from user */

    public static void main(String[] args) {

        Path sourceDirectory = Paths.get(args[0]).toAbsolutePath(), destinationDirectory = Paths.get(args[1]).toAbsolutePath();
        MoveFiles m = new MoveFiles(sourceDirectory, destinationDirectory);
        m.moveFiles();

    }
}