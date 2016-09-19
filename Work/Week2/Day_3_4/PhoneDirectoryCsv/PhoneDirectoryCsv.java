
package phonedirectory;

import java.util.*;
import org.apache.commons.csv.*;
import java.io.*;

/* class PhoneDirectoryCsv to populate object */

public class PhoneDirectoryCsv extends PhoneDirectory{
    private PhoneDirectory pd;
    private String inputFileName;

    PhoneDirectoryCsv(String inputFileName){
        this.inputFileName = inputFileName;
        pd = new PhoneDirectory();
    }
    
    /* Returns the list of csv records in the input csv file */

    private List<CSVRecord> getCsvRecords() throws IOException{
        Reader in = new FileReader(inputFileName);
        CSVParser parser = new CSVParser(in, CSVFormat.DEFAULT.withHeader());
        return parser.getRecords();
    }

    /* Populating directory object with the csv values */

    public void createPhoneBook() throws IOException{
        String name, address, mobileNumber, homeNumber, workNumber;
        List<CSVRecord> csvRecords = getCsvRecords();

        for (CSVRecord record : csvRecords) {
            name = record.get("name");
            address = record.get("address");
            mobileNumber = record.get("mobile_number");
            homeNumber = record.get("home_number");
            workNumber = record.get("work_number");

            ArrayList<PhoneNo> phoneNoList = new ArrayList<PhoneNo>();
            phoneNoList.add(new PhoneNo(mobileNumber,"mobile"));
            phoneNoList.add(new PhoneNo(homeNumber,"home"));
            phoneNoList.add(new PhoneNo(workNumber,"work"));

            addPerson(new Person(name,address,phoneNoList));
        }
        System.out.println("Phone directory created!!");
    }

	/* Main function */
    public static void main(String[] args) throws IOException{
        String fileName = "/Users/cb-sharanya/Desktop/a.csv";
        PhoneDirectoryCsv pdc = new PhoneDirectoryCsv(fileName);
        pdc.createPhoneBook();
        pdc.searchMenu();
    }
}

