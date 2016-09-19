package csvduplicateremover;

/**
 * Given an input CSV file, 
 * write a program to output a new CSV file with all the duplicate lines removed.
 * 
 */

import org.apache.commons.csv.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.*;

/* Class CsvDuplicateRemover */

public class CsvDuplicateRemover {
    private final String inputFileName;
    public ArrayList<String> CSVheaders;

    /* Constructor to initialize variable */

    CsvDuplicateRemover(String inputFileName) throws IOException{
        this.inputFileName = inputFileName;
        CSVheaders = new ArrayList<>(); 
    }

    public void remove() throws IOException{
        readCsvHeaders();
        removeDuplicates();
    }

    /* Function to reads the headers from the file */

    private void readCsvHeaders() throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            String headerLine = br.readLine();
            CSVheaders.addAll(Arrays.asList(headerLine.split(",")));
        }
	 catch(IOException e){
            e.printStackTrace();
        }

    }

    /* FUnction to return new file's name */

    private String getNewFileName(){
        int extensionPosition=inputFileName.lastIndexOf(".");
        String fileNameWithoutExtensions = inputFileName.substring(0, extensionPosition);
        return fileNameWithoutExtensions + "_without_dups.csv";
    }

    /* Function to verify if a duplicate of the record exists */

    private boolean contains(List<CSVRecord> recordList,CSVRecord recordToCheck){

        /* Check each record against the input record */

        for(CSVRecord record : recordList){

            /* Ignore the case where the record is compared with itself */

            if(record != recordToCheck){
                boolean containsFlag = true;
                for(String header : CSVheaders){

                    /* If there is a mismatch in any row, set contains to false and break out */

                    if(!(record.get(header).equals(recordToCheck.get(header)))) {
                        containsFlag = false;
                        break;
                    }
                }

                /* If there is no mismatch return true */
                if(containsFlag){
                    return true;
                }
            }
        }
        return false;
    }

    /* Function to remove duplicates */

    private void removeDuplicates() {
        try{

            CSVPrinter csvFilePrinter;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(getNewFileName()))) {
                csvFilePrinter = new CSVPrinter(bw, CSVFormat.DEFAULT);
                csvFilePrinter.printRecord(CSVheaders);
                Reader in = new FileReader(inputFileName);
                CSVParser parser = new CSVParser(in, CSVFormat.DEFAULT.withHeader());
                List<CSVRecord> csvRecords = parser.getRecords();
                Iterator<CSVRecord> csvRecordIterator = csvRecords.iterator();
                while(csvRecordIterator.hasNext())  {
                    CSVRecord record = csvRecordIterator.next();

                    if (contains(csvRecords,record)){
                        csvRecordIterator.remove();
                    }

                    else{
                        csvFilePrinter.printRecord(record);
                    }

                }
            }
            csvFilePrinter.close();   
            System.out.println("Duplicates removed");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
       
	/* Main function to instantiate object */

    public static void main(String[] args) throws IOException{
        String fileName = "/Users/cb-sharanya/Desktop/a1.csv";
        CsvDuplicateRemover cd = new CsvDuplicateRemover(fileName);
        cd.remove();
    }
}